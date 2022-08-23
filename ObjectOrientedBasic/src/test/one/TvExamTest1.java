package test.one;

public class TvExamTest1 {

	public static void main(String[] args) {
		
//		Tv를 2개 만든다.
//		하나의 Tv는 0에서 시작해서 채널을 높이는 메서드를 활용하여 3까지 증가시킨다.
//		두번째 Tv는 11번 채널로 직접 지정하여 6번 채널까지 메서드를 활용하여 출력한다.
		
		Tv tv = new Tv();		
		Tv tv2 = new Tv();
		
		tv.channel = 0;
		tv2.channel = 11;

		System.out.println("첫번째 Tv의 채널은 " + tv.channel + "입니다.");

		for (int i = 0; i < 3; i++) {
			tv.channelUp();
		}

		System.out.println("첫번째 Tv의 채널은 " + tv.channel + "입니다.");
		System.out.println("두번째 Tv의 채널은 " + tv2.channel + "입니다.");
				
		for (int i = 0; i < 5; i++) {
			tv2.channelDown();
		}

		System.out.println("두번째 Tv의 채널은 " + tv2.channel + "입니다.");

//		Tv를 하나 더 만든다. 첫번째 값을 복제하는 느낌으로.
//		전원를 켜라라고 명령하고 처음 Tv의 전원과 같은지 다른지 확인
		
		Tv tv3 = tv;
		
		tv3.power();
		tv3.channel = 2;

		System.out.println("첫번째 Tv의 채널은 " + tv.channel + "입니다.");
		System.out.println("세번째 Tv의 채널은 " + tv3.channel + "입니다.");
		
		tv.channel = 5;
		
		System.out.println("첫번째 Tv의 채널은 " + tv.channel + "입니다.");
		System.out.println("세번째 Tv의 채널은 " + tv3.channel + "입니다.");
	}	
		
}

