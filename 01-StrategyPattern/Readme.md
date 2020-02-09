## 전략패턴(StrategyPattern)
- 알고리즘을 클래스로 캡슐화하여 동적으로 행위를 자유롭게 바꿀 수 있다.
- 동일한 행위에 대하여 결과는 동일하나 여러가지 알고리즘이 있을 때 전략을 쉽게 바꿀 수 있게 한다.

## 전략이란?
- 어떤 목적을 달성하기 위한 방식
- 비즈니스 규칙
- 문제를 해결하는 알고리즘 등

## 장점
- 행동들을 서로 다른 클래스로 캡슐화하기에 조건문을 사용할 필요가 없다.
- 서브클래싱을 사용하지 않아 구현한 알고리즘과 행동들을 재사용 할 수 있다.

## 단점
- 적합한 행동을 선택하기 위해서는 사용자가 사용되는 다양한 전략에 대해 미리 인지 할 수 있어야 한다.
- 행동별로 클래스를 생성하여 **프로그램 내의 객체의 수가 증가**한다.

## 소스로 이해 해 보자. 
우리는 결제담당 개발자다. 인터페이스를 먼저 만들자.
``` java
public interface Payment {
	
	public void pay();
	
}

```
제품에 대한 DAO(Data Access Object)를 아래와 같이 정의했다.

```java
public class Item {
	
	String code;
	
	int amount;
	
	public Item(String code, int amount) {
		this.code = code;
		this.amount = amount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
```
그리고 결제 서비스 로직을 생략하고 아래와 같이 만들었다. 

```java
public class PaymentImpl implements Payment {


	private Item item;
		
	public PaymentImpl(Item item) {
		this.item = item;
	}

	@Override
	public void pay() {
		System.out.println("결제 비즈니스를 통해 결제 완료." + item.getCode() + item.getAmount());
	}
}
```

서비스 수행을 아래와 같이 해보면..
```java
public class MainApp {
	
	public static void main(String[] args) {
	
		Payment customer = new PaymentImpl(new Item("AAB33D", 3));
		customer.pay();
	}
}
```
아래와 같은 결과가 나온다.
```console
결제 비즈니스를 통해 결제 완료.AAB33D3
```

근데 여기서.. 아래와 같이  휴대폰결제 기능과 계좌이체 기능 요건이 생겼고 이를 따로 분리 해 달라는 요건이 생겼다.
지금은 결제수단을 분리하지도 않았고, 결제방법도 분리 해놓지 못한 개발이다.

이를 아래와 같이 수정 해보자.





## **무작정 ArrayList API 까 보자.**
1. API에는 무엇이 적혀져 있나? 
2. 가변 크기 배열
3. Doubling 전략
4. Multithreading
5. Fail-Fast
6. 나의 ArrayList 만들기   

### API에는 무엇이 적혀져 있나?   
> Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)
The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. All of the other operations run in linear time (roughly speaking). The constant factor is low compared to that for the LinkedList implementation.
Each ArrayList instance has a capacity. The capacity is the size of the array used to store the elements in the list. It is always at least as large as the list size. As elements are added to an ArrayList, its capacity grows automatically. The details of the growth policy are not specified beyond the fact that adding an element has constant amortized time cost.
An application can increase the capacity of an ArrayList instance before adding a large number of elements using the ensureCapacity operation. This may reduce the amount of incremental reallocation.
Note that this implementation is not synchronized. If multiple threads access an ArrayList instance concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally. (A structural modification is any operation that adds or deletes one or more elements, or explicitly resizes the backing array; merely setting the value of an element is not a structural modification.) This is typically accomplished by synchronizing on some object that naturally encapsulates the list. If no such object exists, the list should be "wrapped" using the Collections.synchronizedList method. This is best done at creation time, to prevent accidental unsynchronized access to the list:
``` java   
 List list = Collections.synchronizedList(new ArrayList(...));   
```   
> The iterators returned by this class's iterator and listIterator methods are fail-fast: if the list is structurally modified at any time after the iterator is created, in any way except through the iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException. Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future. Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: the fail-fast behavior of iterators should be used only to detect bugs.   

내가 생각하는거와 다르게 많은 내용을 API 문서에서 이야기를 하고 있다. 여기서 필자가 **진면목(?)**으로 생각하게 만든 단어는 "Resizable-array","not synchronized","fail-fast" 라는 단어이다. 해당 단어를 중심으로 이야기를 풀어 가보려고 한다.   

### 가변 크기 배열   
API 문서를 보면 가변 크기 배열에 대한 설명이 있다. `배열의 사이즈를 조정할 수 있는 List 인터페이스의 구현체`, `배열의 element를 저장하기 위한 capacity 존재`, `capacity 크기는 항상 리스트의 크기보다 큼`, `element가 ArrayList에 추가되면 capacity는 자동 증가`, `배열 크기 증가 규칙은 element를 추가할 때 분할상환시간을 넘지 못함`과 같은 문장으로 요약을 해 볼 수 있다. 처음으로 생각해 보아야 할 포인트는 `배열 사이즈 자동 증가`이다.   

``` java
    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;   
```   
java 1.8에 ArrayList API를 보면 위와 같이 Default Capacity가 `10`으로 세팅되어 있음을 볼 수 있다. 그렇다면 리스트의 크기가 Default Capacity보다 커지는 경우에는 자동적으로 Capacity가 증가하게 되는데, API에서는 아래와 같이 작성이 되어 있다.   

``` java
    /**
     * Increases the capacity to ensure that it can hold at least the
     * number of elements specified by the minimum capacity argument.
     *
     * @param minCapacity the desired minimum capacity
     */
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }   
```   
자동 증가가 과연 얼마큼 이루어 질까? `int newCapacity = oldCapacity + (oldCapacity >> 1)` 이 코딩에 주목해 보면 그 답을 찾을 수 있다. newCapacity는 oldCapacity와 오른쪽으로 `1`만큼 이동한 oldCapacity의 합만큼 증가한다. 예를 들어 Defalut Capacity인 `10`보다 더 큰 리스트가 추가 될 때, newCapacity는 얼만큼 할당이 될까? `15`만큼 할당

``` java
    int newCapacity = oldCapacity + (oldCapacity >> 1);
        15          = 10          +  5
    
    oldCapacity >> 1    
    1010 (10의 이진수)의 오른쪽으로 1만큼 이동 -> 0101 (5)                   
```
결국 일반화를 하면, `newCapacity = oldCapacity + (oldCapacity / 2)`로 나타낼 수 있다.   
참고적으로 `elementData = Arrays.copyOf(elementData, newCapacity);` 이 코딩을 보면 자동 증가 배열은 기존 배열을 복사한 새로운 배열임을 알 수 있다. (새로 할당된 배열에 이전 배열 요소를 옮기는 비용이 추가 됨을 의미)    

### Doubling 전략   

새로운 배열을 만드는 전략을 Doubling으로 가지고 가도 동일한 효과를 줄 수 있을까? 사실 자바 버전에 따라 newCapacity를 구하는 전략은 다를 수 있다. 그렇다면 Doubling 전략은 무엇인가? 말 그대로 자동 증가 시점에 배열의 크기를 2배로 늘리는 전략이다. 위 `grow` 메소드도 Doubling 전략을 사용한다면 `int newCapacity = oldCapacity * 2;`로 수정이 된다. 결국 Doubling, `grow` 메소드에서 사용한 Half, 모두 상수배만큼 배열을 자동으로 조정해 주는 거라 일반화 할 수 있다. 여기서 한 가지 문제가 발생한다. ArrayList에서는 임의의 접근인 경우 O(1)의 성능을 보여 준다. 하지만 위에서 언급했듯이 ArrayList는 배열의 크기를 동적으로 조정할 수 있다. 만약 동적으로 할당된 상태에서도 기존 처럼 O(1)의 성능을 보여 줄 수 있을까? 이를 검증하기 위해서는 `상환입력시간`이라는 개념이 필요하다. 이 포스팅에서는 `상환입력시간`이라는 개념에 대해서는 깊에 다루지 않는다. 간략하게 `상환입력시간`은 Best Case와 Worst Case를 모두 고려한 `평균적인 성능치`정도로 생각하자. 여기서 Best Case는 O(1)이다. Worst Case는 배열의 길이(N)에 영향을 받음으로 O(N)으로 나타낼 수 있다. 이제 `평균적인 성능치`를 단계 별로 구해 보면 아래와 같이 나타낼 수 있다.    

``` java   
     현재 상황에서 배열의 크기 조정 후 원소를 복사하는 데 드는 비용: N * t
     그 전 상황에서 배열의 크기 조정 후 원소를 복사하는 데 드는 비용: N/2 * t
     그 전 상황에서 배열의 크기 조정 후 원소를 복사하는 데 드는 비용: N/4 * t
     .....
    (일반화)
     N >= N/2 + N/4+ N/6 + + N/8.... , 1 >= 1/2 + 1/4 + 1/6 + 1/8 + .... 1 을 넘지는 못함
```   
결국 `평균적인 성능치`인 `상환입력시간`으로 계산한 경우 O(1)이다. Doubling(*2), Half(1/2)와 같은 상수배 전략도 같은 결과를 유추해 볼 수 있다.   

### Multithreading   

API 문서를 보면, **ArrayList는 synchoronized가 아니다.** 만약 멀티 스레드 환경에서 ArrayList 인스턴스에 동시에 접근하고 적어도 하나의 스레드라도 리스트의 구조를 수정하는 경우 외부에서 동기화를 구현해 주어야 한다.(리스트의 구조 수정은 element 추가, 삭제, 내부 배열 크기 수정, 값의 변경은 아님) 일반적으로 List Object를 synchoronized하는 방식으로 하면 해결할 수 있다. 만약 Object가 별도로 없다면 List를 Collections.synchronizedList 메소드로 Wrapping 하면 된다. Vector를 사용하면 된다고 하는데, 다음 기회에 Vector도 다뤄 보도록 하겠다.   


### Fail-Fast   
ArrayList 클래스도 Collection 클래스의 특징을 모두 가지고 있다. Collection 객체는 저장된 객체들에 대한 순차적인 접근을 제공하는데, 순차적인 접근이 끝나기 전에 Collection 구조적인 변경(객체의 추가 혹은 삭제)이 발생하게 되면, 순차적인 접근이 실패(ConcurrentModificationException)하게 된다. 이것이 Fail-Fast라 부른다.  

``` java   
public class FailFast {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iter = lists.iterator();
        while (iter.hasNext()) {
            Integer number=  iter.next();
            lists.add(50);  // collection 구조 변경
            System.out.println(number);
        }
   }
}
```   

### 나의 ArrayList 만들기   
이제 제공해 준 ArrayList가 아닌 나만의 ArrayList를 구현해 보자. 기본적인 내용은 java 1.8 API를 참고 하였다.   
1. Default Capacity는 10으로 지정한다.   
2. Constructor는 파라미터가 없는 경우, 파라미터(초기 배열 값)가 1개 존재하는 경우를 고려한다.   
3. 리스트의 추가 기능은 맨 뒤에 추가하는 기능과, 특정 인덱스에 값을 추가하는 기능을 제공한다.   
   (Type의 결정은 Client 소스가 결정 -> Generic)   
4. 특정 인덱스의 리스트를 삭제하는 기능을 제공한다.   
5. 배열의 리스트가 꽉 찼을 경우 크기를 자동적으로 증가하는 기능을 고려한다.(Doubling 전략)   
6. 배열의 리스트가 꽉 찼는 지 확인은 리스트를 추가하기 전에 확인한다.   
7. 특정 인덱스의 값을 조회할 수 있는 기능을 제공한다.   

``` java   
import java.util.Arrays;

/***
 Author: minikuma
 DATE: 2019/03/06
 Project: javaBasic
 ***/
public class MyArrayList<E> {

    //Initial Capacity
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private Object[] elementData = {};
    private int index = 0;

    //constructor no parameter
    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    //constructor 1st parameter
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("IllegalArgumentException: " + initialCapacity);
        }
    }
    //array size
    public int getSize() {
        return this.elementData.length;
    }
    //last add 
    public void add(E e) {
        int finalIndexPos = getValueIndex();
        ensureChecked(finalIndexPos);
        this.elementData[index] = e;
        index++;
    }
    // add by index
    public void add(int index, E e) {
        int finalIndexPos = getValueIndex();
        ensureChecked(finalIndexPos);
        rightSwiftArray(finalIndexPos, index, e);
    }
    //remove
    public void remove(int index) {
        int finalIndexPos = getValueIndex();
        leftSwiftArray(finalIndexPos, index);
    }
    //get
    @SuppressWarnings (value="unchecked")
    public E get(int index) {
        return (E) this.elementData[index];
    }

    private int getValueIndex() {
        int findValueIndex = 0;
        for (int i = 0; i < this.elementData.length; i++) {
            if (this.elementData[i] == null) {
                break;
            }
            findValueIndex++;
        }
        return findValueIndex;
    }
    //length checked + size up
    private boolean ensureChecked(int finalIndexPos) {
        if (index >= elementData.length || finalIndexPos >= this.elementData.length) {
            grow(); //Size up
            return true;
        } else if (index < 0) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException: " + index);
        }
        return false;
    }
    //grow
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;  // doubling
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    //array right swift
    private void rightSwiftArray(int finalIndexPos, int index, E e) {
        for (int i = finalIndexPos-1; i >= index; i--) {
            this.elementData[i+1] = this.elementData[i] ;
        }
        this.elementData[index] = e;
    }
    //array left swift
    private void leftSwiftArray(int finalIndexPos, int index) {
        for (int i = index; i < finalIndexPos; i++) {
            this.elementData[i] = this.elementData[i+1];
        }
        this.elementData[finalIndexPos-1] = null;
    }
}
```   
이번 포스팅에서는 나만의 ArrayList를 구현해 보는 것이 목적이라 위에서 언급했던 Multithreading은 테스트는 별도로 진행해 보지 않았다. ArrayList API가 가지고 있는 핵심적인 특징들을 살펴 보고 그 특징들을 가지고 API를 실제로 구현해 보았다.    

참고: https://daehwann.wordpress.com/2016/08/26/java-arraylist/    

