package three.test;

public class TvInfoTest {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();

		tv.color = "blue";
		tv.power = true;
		tv.channel = 10;

		tv.info();
		
		CaptionTv tvi = new CaptionTv();
		

		tvi.info();
		

		
	}
}
