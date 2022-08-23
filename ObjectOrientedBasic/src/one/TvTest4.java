package one;

public class TvTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv();	//복제하고 싶으면 이 객체 묶음을 연동시키지 말고 그 안의 변수를 땡겨와라.
		Tv tv2 = new Tv();
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		System.out.println();
		
		tv.channel = 7;
		System.out.println("tv의 channel값을 " + tv.channel + "로 변경하였습니다.");
		System.out.println();		
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		
		tv2.channel = tv.channel;
		tv2.color = tv.color;
		tv2.power = tv.power;	
		
		tv.channelDown();
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		
		
		
		
		
		
	}

}
