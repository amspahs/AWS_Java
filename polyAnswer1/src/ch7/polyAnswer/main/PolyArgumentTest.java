package ch7.polyAnswer.main;

import ch7.polyAnswer.customer.Customer;
import ch7.polyAnswer.product.Book;
import ch7.polyAnswer.product.Computer;
import ch7.polyAnswer.product.SmartPhone;
import ch7.polyAnswer.product.Tv;

// 다형성 활용 -> 메서드 매개변수
public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer psu = new Customer();
		Customer jys = new Customer();
		Customer ldh = new Customer();
		Customer ogw = new Customer();
		Customer abk = new Customer();
		Customer ksj = new Customer();
		Customer sdy = new Customer();
		Customer lyb = new Customer();
		Customer nkh = new Customer();
		Customer pym = new Customer();
		Customer hwj = new Customer();
		Customer kth = new Customer();
		
		
		psu.name = "박성욱";
		jys.name = "조윤성";
		ldh.name = "이동현";
		ogw.name = "오건황";
		abk.name = "안병규";
		ksj.name = "김소진";
		sdy.name = "손다예";
		lyb.name = "이영빈";
		nkh.name = "남기형";
		pym.name = "박윤미";
		hwj.name = "황원준";
		kth.name = "김태훈";	
	
		psu.buy(new Tv());
		jys.buy(new Tv());
		ldh.buy(new Tv());
		
		System.out.println(psu);
		System.out.println(jys);
		System.out.println(ldh);
		System.out.println();		
		
		ogw.buy(new Computer());
		abk.buy(new Computer());
		ksj.buy(new Computer());
		
		System.out.println(ogw);
		System.out.println(abk);
		System.out.println(ksj);
		System.out.println();		
		
		sdy.buy(new SmartPhone());
		lyb.buy(new SmartPhone());
		nkh.buy(new SmartPhone());
		
		System.out.println(sdy);
		System.out.println(lyb);
		System.out.println(nkh);
		System.out.println();		
		
		pym.buy(new Book());
		hwj.buy(new Book());
		kth.buy(new Book());
		
		System.out.println(pym);
		System.out.println(hwj);
		System.out.println(kth);
		System.out.println();		
		
		
	}

}
