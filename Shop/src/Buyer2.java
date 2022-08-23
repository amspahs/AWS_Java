
public class Buyer2 {

	int money = 0;
	int bonusPoint = 0;
	
	void buy(Tv tv) {
		
		if(money < tv.price) {
			System.out.println("잔액이 부족합니다");
			return;		// 조건문 실행시 메서드(buy()) 종료
		}
		
		money = money - tv.price;
		
		bonusPoint = bonusPoint + tv.bonusPoint;
		
		System.out.println(tv + "구입");
		
	}
	
	void buy(Com com) {
		
		if(money < com.price) {
			System.out.println("잔액이 부족합니다");
			return;		// 조건문 실행시 메서드(buy()) 종료
		}
		
		money = money - com.price;
		
		bonusPoint = bonusPoint + com.bonusPoint;
		
		System.out.println(com + "구입");
		
	}
}
