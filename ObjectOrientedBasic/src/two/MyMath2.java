package two;

public class MyMath2 {
	
	//리턴 타입이 있는 메서드
	//return type(반환타입) 메서드에서 수행된 결과를 반환한다
	//return 반환값의 타입을 적는다.
	
	int add(int x, int y) {	//선언부
		int result = x + y;		//구현부
		
//		System.out.println("두 수를 더한 결과: " + result);
	
		return result;	//나를 호출한 곳으로 반환
	}	
	
// 나누기와 소수점
	double divide(double x, double y) {
			
		double rslt = 0.0;
		
		rslt = (double)x / y;	//둘 다 형변환을 시켜줘야 하지만 하나만 명시해주면 나머지는 컴이 맞춤.
		
		return rslt;	//하나의 값만 반환할 수 있는데, 호출하고 반환할 때는 타입이 맞아야 됨.
	}
		
		
		
	
}
