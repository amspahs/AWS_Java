package one;

public class Bird implements Animal{	//밑에 오버라이딩 조건 필기 있다.

	String wing = "";
//	int footNum = 0;
	String beak = "";
	
	//이전에 밝혀지지 않은 오버라이딩의 조건
	//접근 제어자는 부모 클래스의 메서드보다 좁은 범위로 변경할 수 없다.	//자식으로 내려갈수록 다른이가 사용할 가능성이 크니까 사용 범위가 커져야 해.(차세대)
	//부모 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
	
	public void fly() {	//인터페이스는 절대 혼자 못 쓰는데, 이걸 혼자 쓰게 하려면 접근제어자를 명시해줘야 가능하다.
		
	}

	public void bark() {
		
	}
	
	public void walk() {
		
	}

	@Override	//재정의했다는 어노테이션(알림), 주석과 같은 의미임.
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
	
