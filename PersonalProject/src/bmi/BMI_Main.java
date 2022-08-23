package bmi;

import java.util.Scanner;

public class BMI_Main {	//나중에 이거 클래스에 객체지향적으로 나눠봐.

	public static void main(String[] args) {

		double myWeight = 0.0;
		double myHeight = 0.0;
		double bmi = 0.0;
		String resultStr = "";

		Scanner scan = new Scanner(System.in);
		
		System.out.println("체중을 입력해주세요.");
		myWeight = scan.nextDouble();
		System.out.println("신장을 입력해주세요.");
		myHeight = scan.nextDouble();

		bmi = myWeight / ((myHeight * myHeight) / 10000.0);
		bmi = (int)((bmi + 0.005) * 100) / 100.0;
		
		if (bmi >= 25.0) {
			resultStr = "비만";
		}else if (bmi >= 23.0) {
			resultStr = "과체중";
		}else if (bmi >= 18.5) {
			resultStr = "정상";
		}else {
			resultStr = "저체중";
		}

		System.out.println("당신의 BMI는 " + bmi + "로, " + resultStr + "입니다.");
	}
}