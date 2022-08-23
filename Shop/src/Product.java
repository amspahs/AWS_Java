
public class Product {

	int price = 0;
	int bonusPoint = 0; // 제품구매시 제공하는 보너스점수
		
	public Product() {
		super();
	}


	public Product(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
}
