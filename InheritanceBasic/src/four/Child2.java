package four;

public class Child2 extends Parent2{
	
	int x = 0;
	
	void childMethod() {
		System.out.println("x: " + x);
		System.out.println("this: " + this.x);
		System.out.println("super: " + super.x);
	}
}

/*
-super란?
자식 클래스에서 부모 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
인스턴스 메서드에서만 사용가능

*주의: static 메서드는 인스턴스와 관련이 없다

*/