package ch7.polyAnswer.main;

import ch7.polyAnswer.customer.Customer;

import ch7.polyAnswer.product.*;

// 다형성 활용 -> 메서드 매개변수
public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customerArr = new Customer[12];
		
		customerArr[0] = new Customer(10000,0,"김소진");
		customerArr[1] = new Customer(10000,0,"손다예");
		customerArr[2] = new Customer(10000,0,"남기형");
		customerArr[3] = new Customer(10000,0,"조윤성");
		customerArr[4] = new Customer(10000,0,"이동현");
		customerArr[5] = new Customer(10000,0,"박윤미");
		customerArr[6] = new Customer(10000,0,"오건황");
		customerArr[7] = new Customer(10000,0,"조현석");
		customerArr[8] = new Customer(10000,0,"이영빈");
		customerArr[9] = new Customer(10000,0,"황원준");
		customerArr[10] = new Customer(10000,0,"안병규");
		customerArr[11] = new Customer(10000,0,"김태훈");

//		customerArr[0].buy(new Tv());
//		customerArr[1].buy(new Tv());
//		customerArr[2].buy(new Tv());
//		
//		System.out.println(customerArr[0]);
//		System.out.println(customerArr[1]);
//		System.out.println(customerArr[2]);

		for (int i = 0; i < 3; i++) {
			customerArr[i].buy(new Tv());			
		}	
		
		for (int i = 0; i < 3; i++) {
			customerArr[i+3].buy(new Computer());			
		}
		
		
		for (int i = 0; i < 3; i++) {
			customerArr[i+6].buy(new SmartPhone());			
		}
		
		
		for (int i = 0; i < customerArr.length; i++) {
			System.out.println(customerArr[i]);
		}
		
//		jys.buy(new Computer());
//		ldh.buy(new Computer());
//		pym.buy(new Computer());
//		System.out.println(jys);
//		System.out.println(ldh);
//		System.out.println(pym);
//		System.out.println();
//		ogh.buy(new SmartPhone());
//		jhs.buy(new SmartPhone());
//		lyb.buy(new SmartPhone());
//		System.out.println(ogh);
//		System.out.println(jhs);
//		System.out.println(lyb);
//		System.out.println();
//		hwj.buy(new Book());
//		abg.buy(new Book());
//		kth.buy(new Book());
//		System.out.println(hwj);
//		System.out.println(abg);
//		System.out.println(kth);

	}

}
