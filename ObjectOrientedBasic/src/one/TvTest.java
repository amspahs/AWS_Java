package one;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		클래스명 변수명;		//클래스의 객체를 참조하기 위한 참조변수를 선언
//		변수명 = new 클래스명();		//클래스의 객체를 생성 후,
//								//객채의 주소를 참조변수에 저장
		
		Tv tv;			//Tv클래스 타입의 참조변수 tv를 선언
		
		tv = new Tv();	//개념적: 클래스 타입, 유형적: 참조형 타입. 여기서는 티비 클래스 타입이라고 부름. tvㅁ 0x0000
						//뉴는 객체 생성 키워드임. 이거 쓰면 물건이 만들어진다
						//Tv인스턴스(instance)를 생성한 후, 생성된 Tv인스턴스의 주소를 Tv에 저장
//		인스턴스화
		tv.channel = 7;
		tv.channelDown();
		
		System.out.println("현재 채널은 " + tv.channel + " 입니다");
	}

}
