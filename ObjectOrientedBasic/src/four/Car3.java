package four;

public class Car3 {
	
	String color = "";
	String gearType = "";	
	int door = 0;	
								
	Car3(){				//**기본 생성자를 명시할 수도 있다.
						//근데 기본 생성자는 무조건 넣어라. 나중에 오류 안 띄우려면
						//괄호 열고 바로 닫는 것은 생각보다 많지 않다.
		System.out.println("아하! 이 순간에 생성자가 수행되는구나!");
	}

	Car3(int d){				//**기본 생성자를 명시할 수도 있다.
		System.out.println("어? merge?");
	}
								//위 두개의 생성자는 오버로딩 중

}
