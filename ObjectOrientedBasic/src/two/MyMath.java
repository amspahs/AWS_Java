package two;

public class MyMath {
	
//	메서드의 선언과 구현
//	
//	표현식
//	반환타입 메서드 이름(타입 변수명, 타입 변수명, ,,,) { -- 선언부
//		메서드 호출 시 수행될 코드					 -- 구현부
//	}
//	() 안에 있는 변수들을 매개변수(parameter)라고 부른다.
	
	void add(int x, int y) {	//선언부
		int result = x + y;		//구현부 
		
		System.out.println("두 수를 더한 결과: " + result);
	
//	반환 타입이 없다. 묵시적으로 컴파일러가 리턴 넣어줌.	
	
	}
}
