
public class Buyer {

	int money = 0;
	int bonusPoint = 0;
	
	void buy(Product product) {
		
		if(money < product.price) {
			System.out.println("잔액이 부족합니다");
			return;		// 조건문 실행시 메서드(buy()) 종료
		}
		
		money = money - product.price;
		
		bonusPoint = bonusPoint + product.bonusPoint;
		
		System.out.println(product + "구입");	
	}

}
