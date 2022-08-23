package ch7.polyExam.main;

import ch7.polyExam.customer.Customer;
import ch7.polyExam.product.*;


// 다형성 활용 -> 메서드 매개변수
class PolyArgumentTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Customer customer = new Customer();

				Computer com = new Computer();
//				Tv tv = new Tv();
//				Smartphone smartph = new Smartphone();
				Book book = new Book();
				
				customer.buy(new Tv());
				System.out.println(customer.toString());
								
				customer.buy(com);
				System.out.println(customer.toString());
							
				customer.buy(new Smartphone());
				System.out.println(customer.toString());
							
				customer.buy(book);
				System.out.println(customer.toString());
			
	}
		

}
