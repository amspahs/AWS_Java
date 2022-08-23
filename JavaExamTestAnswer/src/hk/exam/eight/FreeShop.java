package hk.exam.eight;

// 면세점
public class FreeShop {
	
	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.
	
	double storeMoney = 0;  // 주인장의 소지금
	private Book book = null; // 책 한권 
	private Computer computer = null; // 컴퓨터 한개
	private Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개
	
	public FreeShop() {
		super();
	}

	public FreeShop(Book book, Computer computer, Tv tv, SmartPhone smartPhone){
		this.storeMoney = 100000; // 초기자금은 무조건 10만원
		this.book = book;
		this.computer = computer;
		this.tv = tv;
		this.smartPhone = smartPhone;
	}
	
	// 물건 구입
	/**
	 * @param customer  고객
	 * @param ?? 어떤 상품을 살까
	 * @throws CloneNotSupportedException
	 */
	public void buy(Customer customer, Product product) throws CloneNotSupportedException{
		
		// 물건이 존재하는지 여부
		if(product instanceof Book && this.book == null){
			System.out.println(product.getName() +  "은 다 팔렸습니다.");
			return;
		}else if(product instanceof Computer && this.computer == null){
			System.out.println(product.getName() +  "은 다 팔렸습니다.");
			return;
		}else if(product instanceof SmartPhone && this.smartPhone == null){
			System.out.println(product.getName() +  "은 다 팔렸습니다.");
			return;
		}else if(product instanceof Tv && this.tv == null){
			System.out.println(product.getName() +  "은 다 팔렸습니다.");
			return;
		}
		
		// 물건이 존재하면 구매 가능여부 확인
		// 나의 소지금으로 해당 상품의 구매가 가능하면
		if(customer.getMoney() >= product.getPrice()){
			customer.setMoney(customer.getMoney() - product.getPrice()); 
			storeMoney = storeMoney + product.getPrice();
			System.out.println(product.getName() + "를 구입하셨습니다.");
			customer.setProduct((Product)product.clone());
			customer.setMyBonusPoint(customer.getMyBonusPoint() + product.getBonusPoint());
			
			if(product instanceof Book){
				book = null;
			}else if(product instanceof Computer){
				computer = null;
			}else if(product instanceof SmartPhone){
				smartPhone = null;
			}else if(product instanceof Tv){
				tv = null;
			}
			// 나의 소지금으로 해당 상품의 구매가 불가능하면
		}else{
			System.out.println(product.getName() + " 제품을 구입하기에 ");
			System.out.println( (product.getPrice() - customer.getMoney()) + " 원 부족합니다.");
		}
	}

	@Override
	public String toString() {
		return "FreeShop 상태 = 매진: [storeMoney=" + storeMoney + ", book=" + book + ", computer=" + computer + ", tv=" + tv
				+ ", smartPhone=" + smartPhone + "]";
	}
	
}
