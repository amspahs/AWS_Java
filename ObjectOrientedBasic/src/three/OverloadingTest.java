package three;

import java.util.Scanner;

public class OverloadingTest {
	public static void main(String[] args) {
		
//		System.out.println();		//이거 다 오버로드 쓰고 있는 거임. 타입 다른데 작동함
//		System.out.println(1);
//		System.out.println("설마");
//		System.out.println(true);
		
//		키보드 입력 하나를 받는다 
//		이 값으로 4칙연산이 각각 적용된다
		
		Calculator calc = new Calculator();
		
		double result = 0;
		
		result = calc.add(2l, 1000000);		//메인에서 호출할 때 계산기에 적힌 대로 양식 맞추면 맞춘 게 돌아옴
		System.out.println(result);
		
		result = calc.subtract(100l, 200l);
		System.out.println(result);
		
		result = calc.mul(10l, 0);
		System.out.println(result);
		
		result = calc.div(100.5, 5.0);
		System.out.println(result);
	
		
	}
}
