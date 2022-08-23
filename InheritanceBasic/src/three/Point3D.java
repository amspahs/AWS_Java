package three;

public class Point3D extends Point{

	int z = 0;

	String getLocation() {	//부모꺼랑 똑같은데 발전시켜서 덮어쓸 수 있다. 이거 많이 쓴다...차세대 개념\
		String str = "";
				
			str = "x : " + x +  ", y: " + y + ", z: " + z;
		
		return str;
	}
	
}

/*
-오버라이딩(Overriding)이란?
부모 클래스로부터 상속받은 메서드의 내용을 변경하는 것
상속받은 메서드를 그대로 사용하기도 하지만 자식 클래스 자신에 맞게 변경해야 하는 경우 사용한다

-오버라이딩 조건
자식 클래스에서 오버라이딩하는 메서드는 부모 클래스의 메서드와 이름, 매개변수, 반환 타입이 같아야 한다.


*오버로딩 vs 오버라이딩
-오버로딩: 기존에 없는 새로운 메서드를 정의하는 것(new)
-오버라이딩: 상속받은 메서드의 내용을 변경하는 것(change, modify)
*/




