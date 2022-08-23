package one;

public class TvTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv;
		
		tv = new Tv();
		
		Tv tv2 = tv;	//tv랑 tv2랑 동기화 시켜버림. 위험하니까 쓰지 마셈.
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		System.out.println();
		
		tv.channel = 7;
		System.out.println("tv의 channel값을 " + tv.channel + "로 변경하였습니다.");
		System.out.println();		
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		
		tv2 = tv;
		
		tv.channelDown();
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		
		
		
		
		
		
	}

}
