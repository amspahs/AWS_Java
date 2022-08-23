package ch7.polyExam.product;

import ch7.polyExam.customer.Customer;

public class Tv extends Product {
	int money = 0;
	String name = "Tv";
	
	public Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
		
	}
	public String toString() {
		// TODO Auto-generated method stub
		String str = "현재 남은 돈은 " + money + "만원입니다.\n";
		str = str + "현재 보너스점수는 " + bonusPoint + "점입니다. \n\n";
		str = str + "Tv 시청 중"; 
	
		
		return str;
	}
}
