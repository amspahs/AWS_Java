package hk.exam.one;

import java.util.Random;

public class DiceService {
	
	// 주사위를 던지다
	public void throwDice(){
		System.out.println("주사위를 던졌습니다.");
		
		Random rand = new Random();
		// 주사위 값을 담을 변수
		int num = 0;
		// 주사위는 1부터 6까지 숫자만 존재
		num = (int)(rand.nextDouble()*6)+1;

		System.out.print("주사위 숫자: ");
		switch(num){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default:
				System.out.println("6");
				break;
		}
		
	}
}
