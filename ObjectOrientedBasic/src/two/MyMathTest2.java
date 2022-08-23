package two;

public class MyMathTest2 {

	public static void main(String[] args) {
	
		MyMath2 myMath2 = new MyMath2();
		
		int result = 0;
		
		//리턴타입이 있는 메서드 사용처
		//안의 내용이 앞으로 좀 더 필요하다, 활용, **현업에서는 출력과 확인으로 많이 쓴다.
		
		result = myMath2.add(10, 5);	//add 메서드를 호출함
	
		System.out.println("두 수를 더한 결과: " + result);
	
		
		double rr = 0.0;
		
		rr = myMath2.divide(10, 3);
		
		System.out.println("두 수를 나눈 결과: " + rr);
		
		
		
		
		
		
		
	}
}
