package test.two;

public class MyMathTest2 {

	public static void main(String[] args) {
	
		MyMath2 myMath2 = new MyMath2();
		
		int result = 0;
		
		result = myMath2.add(10, 5);	//add 메서드를 호출함
	
		System.out.println("두 수를 더한 결과: " + result);
	
		
		double rr = 0.0;
		
		rr = myMath2.divide(10, 3);
		
		System.out.println("두 수를 나눈 결과: " + rr);
		
		
		double rslt2 = 0.0;
		
		rslt2 = myMath2.multiple(5.5, 2);
		
		System.out.println("두 수를 곱한 결과: " + rslt2);
		
		
		int rslt3 = 0;
		
		rslt3 = myMath2.subtract(3, 2);
		
		System.out.println("두 수를 뺀 결과: " + rslt3);
		
		
		
		
	}
}
