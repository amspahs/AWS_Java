package four;

public class Child extends Parent{
	
	void childMethod() {
		System.out.println("x: " + x);
		System.out.println("this: " + this.x);
		System.out.println("super: " + super.x);
	}
}

/*
super란?
-자식 클래스에서 부모 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
-인스턴스 메서드에서만 사용가능

-주의: static 메서드는 인스턴스와 관련이 없다


super()
-부모 클래스의 생성자를 호출하는데 사용된다.

-생성자의 첫 줄에서 부모 클래스의 생성자를 호출해야 한다.
이유는 자식 클래스의 멤버가 부모 클래스의 멤버를 사용할 수도 있으므로
부모의 멤버들이 먼저 초기화 되어 있어야 하기 때문이다.

-Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에는 생성자, this() 또는 super()를 호출해야 한다.
그렇지 않으면 컴파일러가 자동적으로 super()를 생성자의 첫 줄에 삽입한다.



*/