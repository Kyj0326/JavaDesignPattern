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
public class PaymentImpl implements Payment{


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

근데 여기서.. **휴대폰결제 기능**과 **계좌이체 기능** 요건과, 결재 취소기능이 생겼고 이를 따로 **분리** 해 달라는 요건이 생겼다.
지금은 결제수단을 분리하지도 않았고, 결제방법도 분리 해놓지 못한 개발이다.

이를 아래와 같이 수정 해보자.

먼저 Interface를 만들고 결재를 method와 arg로 받는다.
취소 또한 마찬가지다.

```java
public interface Payment {
	
	public void pay(String method, String arg);
	
	public void cancel(String method, String arg);

}
```

서비스를 아래와 같이 만들자. 

```java
public class PaymentImpl implements Payment {


	private Item item;
		
	public PaymentImpl(Item item) {
		this.item = item;
	}

	@Override
	public void pay(String method, String arg) {
		// TODO Auto-generated method stub
		
		if (method == "HP") {
		
		System.out.println("휴대폰결제 비즈니스를 통해 결제 완료." + arg);
		
		}else if(method == "ACCOUNT") {
			
		System.out.println("계좌결제 비즈니스로 결제완료" + arg);	
		
		}
				
	}
		
	@Override
	public void cancel(String method, String arg) {
		// TODO Auto-generated method stub
		System.out.println("취소 비즈니스를 통해 취소 완료");
	}
	
}
```
Client입장에서 서비스 콜을 해보면 아래와 같이 바뀌었다.
```java
public class MainApp {
	
	public static void main(String[] args) {
	
		Payment customer = new PaymentImpl(new Item("AAB33D", 3));
		customer.pay("HP", "01034497790");
		Payment customer2 = new PaymentImpl(new Item("ABBDCC", 5));
		customer.pay("ACCOUNT", "88091039728907");
	}

}
```
결과를 보면 아래와 같이 나온다.
```console
휴대폰결제 비즈니스를 통해 결제 완료.01034497790
계좌결제 비즈니스로 결제완료88091039728907
```

## 문제점
서비스를 직접 수정한다. 이는 **OCP규칙**에 어긋난다. 일단 최초 만들때부터 잘못 됐다. 우리는 결제라는것은 다양한 결제 시스템이 존재하고, 이에따라 취소라는 기능도 당연히 있을거라는걸 미리 인지하고 설계 했어야 했다.
OCP규칙 위배라는 것은 새로운 기능이 추가 될 때 기존의 코드는 수정없이 새로운 코드를 추가함으로써 기능의 추가와 변경이 가능하지 못하다는 것이다.

이를 전략패턴을 이용해 아래와 같이 수정 해 보자.

아래는 DAO다.(동일하다)

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

Interface도 동일하다.

```java
public interface PaymentStrategy {
	
	public void pay(Item item, String arg);

	public void cancel();

}
```

휴대폰 결제와 계좌 결제, 카카오 결제를 아래와 같이 나누었다.
```java
public class PhonePayment implements PaymentStrategy{

	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("휴대폰 결제입니다. item : "+item.getCode() + " "+ item.getAmount()+ " strategy : "+ arg);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("휴대폰 결제 취소입니다.");
	}
	
}
```
```java
public class AccountPayment implements PaymentStrategy{

	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("계좌 결제입니다. item : "+item.getCode() + " "+ item.getAmount()  + " strategy : " + arg);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("계좌 결제 취소입니다.");
	}
}
```
```java
public class KakaoPayment implements PaymentStrategy{

	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("카카오 결제입니다. item : "+item.getCode() + " "+ item.getAmount()+ " strategy : "+ arg);
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("카카오 결제 취소입니다.");
	}

}
```
여기서 핵심은 아래 클래스이다. 너무 길어져 Getter/Setter는 삭제했다.
```java
public class ShoppingCart {
	
	private Item item;
	
	private PaymentStrategy paymentStrategy;
	
	private String arg;

	public ShoppingCart(Item item, PaymentStrategy paymentStrategy,  String arg) {
		this.item = item;
		this.arg = arg;
		this.paymentStrategy = paymentStrategy;
	}
	
	public void pay() {
		paymentStrategy.pay(item, arg);
	}
	
	public void cancel() {
		paymentStrategy.cancel();
	}
	
}
```

결제 수단이라는 전략을 주입받아 결제에 대한 비즈니스는 캡슐화 하여 숨기고, Client에서 해당 클래스를 통하여 결제수단을 선택하고, 결제를 수행 할 수 있다. 
캡슐화라는 것은 정보를 은닉하고, 다른 클래스(여기서는 Client도 될 수 있다.)에서 데이터 변형을 막을 수 있다.
여기서는 결제라는 돈이 관련 된 Biz 이기때문에 더 중요하다. (모두 public으로 되어 있는데, 바꾸자..)
또한 클래스 간 결합도가 낮아진다. (이는 유지보수에 좋을 것 같다.)

자 이제 해당 서비스를 호출 해보자.

```java
public class MainApp {
	
	public static void main(String[] args) {
	
		ShoppingCart cart = new ShoppingCart(new Item("AABB#d",4),new KakaoPayment(),"01034497790");
		cart.pay();

	}
}
```

결과 값은 아래와 같다.
```console
카카오 결제입니다. item : AABB#d 4 strategy : 01034497790
```

근데 여기서 페이코 결제를 추가 해 주세요 ! 라는 요구사항이 생기면 이제 위 코드는 그대로 놔두고, 아래와 같이 클래스만 추가하면 된다.

```java
public class PaycoPayment implements PaymentStrategy{
	
	@Override
	public void pay(Item item, String arg) {
		// TODO Auto-generated method stub
		System.out.println("페이코 결제입니다.  item : "+item.getCode() + " "+ item.getAmount()+" strategy : "+ arg );
				
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("페이코 결제 취소입니다.");
	}
}
```
결과 값이다.
```java
public class MainApp {
	
	public static void main(String[] args) {
	
		ShoppingCart cart = new ShoppingCart(new Item("AABB#d",4),new PaycoPayment(),"01034497790");
		
		cart.pay();
		
	}
}
```
