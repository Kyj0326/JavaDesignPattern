## 어뎁터 패턴(Adapter Pattern)
- 한 클래스의 인터페이스를 클라이언트에서 사용하고자하는 다른 인터페이스로 변환한다.
- 어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다.

## 바로 소스로 보자
우리는 원래 아래와 같은 클라이언트 역할을 하는 클래스가 있다.
``` java
public class Client {
	private Target target;
	public void setTarget(Target target) {
		this.target = target;
	}
	public void doSomething() {
		target.request();
	}
}
```
그리고 아래에 어떤 request()를 제공하는 라이브러리가 있다.
```java
public class Adaptee {
	void request() {
		System.out.println("어떤 비즈니스가 있는 라이브러리 입니다.");
	}
}

```
위 두개는 서로 호환성이 없다. Adaptee 클래스에 있는 request()를 사용하고 싶을 때 Adapter Pattern을 사용한다.
먼저 아래와 같이 Target Interface를 만든다.
```java
public interface Target {
	void request();
}
```
그리고 이 Interface를 장착한 Class를 만드는데, 이게 Adapter역할을 한다.
이는 아래와 같이 Adaptee 클래스 객체를 생성하여 사용할 수도 있다.
이로 인한 장점은 Adapter에서 제공하는 변수들이나 기능들을 원하는대로 변형 할 수 있지만
하나하나 다 코딩 해줘 야 한다는 단점이 있다.
```java
public class Adapter implements Target{
	
	Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.request();
	}	
	
}
```
또는 아래와 같이 상속을 이용하여도 된다.
```java
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		super.request();
	}
		
}
```
아래 main소스에서 수행을 하면
```java
public class main {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.setTarget(new Adapter());
		client.doSomething();
	}
}
```
아래와 같은 결과가 나온다.
```console
어떤 비즈니스가 있는 라이브러리 입니다.

```


