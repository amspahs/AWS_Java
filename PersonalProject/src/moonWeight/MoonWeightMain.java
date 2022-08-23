package moonWeight;

public class MoonWeightMain {

	public static void main(String[] args) {
		double earthWeightNum = 0.0;
		Calculation calculation = new Calculation();
//		변수 double earthGravity2 = Calculation.earthGravity
//		Calculation.moonGravity(earthGravity2)
		earthWeightNum = calculation.moonGravity();

		System.out.println(earthWeightNum + " kg");
	}
}

	//미완성, 이런 식으로 해라.
	//객체지향에 빠지기 보다는 먼저 메인에서 완벽하게 구현하고 객체지향적으로 만들어도 된다.