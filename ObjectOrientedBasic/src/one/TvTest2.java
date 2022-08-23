package one;

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv;
		
		tv = new Tv();	//alt + 화살표 위, 아래로 줄 이동시킬 수 있음. 꿀
		
		Tv tv2 = new Tv();	//Tv랑 똑같은 물건을 하나 더 만듦.
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
		System.out.println();
		
		tv.channel = 7;
		System.out.println("tv의 channel값을 " + tv.channel + "로 변경하였습니다.");
		System.out.println();		
		
		System.out.println("tv의 channel값은 " + tv.channel + "입니다.");
		System.out.println("tv2의 channel값은 " + tv2.channel + "입니다.");
	}

}
