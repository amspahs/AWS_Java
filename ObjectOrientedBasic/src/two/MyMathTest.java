package two;

public class MyMathTest {

	public static void main(String[] args) {
	
//f3: 선언된 곳으로 찾아감.
//알트 + 왼키, 오른키로 뒤로 가기, 앞으로 가기 가능
		MyMath myMath = new MyMath();
		
		myMath.add(1, 5);
		System.out.println("두 수를 더한 결과: " + myMath);
	
//		void 메서드 사용처?
//		난이도를 바꾸는 등의 설정에 강력함.
//		설정할 때, 연산을 다른 것과 연계할 필요가 없을 때
		
	}
}
