package seven;	//세븐과 쓰리는 다른 패키지기 때문에 디폴트 상태에서는 값을 부를 수 없다

import three.test.Tv;	//쓰리에 있는 쓰려는 변수에 퍼블릭을 붙이면 가져와서 쓸 수가 있다

public class Tvtest {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.channelUp();
		
		tv.channelDown();
		
		tv.power();
		
		System.out.println(tv.channel);
		System.out.println(tv.power);
	}
	
	
	
}
