package three.test;

public class Tv {	//Tv 설계도

	String color = "";	//색상
	public boolean power = false;	//전원
	public int channel = 0;	//채널
	
	public void power() {	//메서드, 전원이라는 변수를 조작하는 애
		power = !power;	//TV를 켜거나 끄는 기능
	}
	public void channelUp() {					
		channel = channel + 1;	//채널을 높이는 기능
	}
	public void channelDown() {
		channel = channel - 1;	//채널을 낮추는 기능을 하는 메서드
	}
	
	void info() {
		System.out.println("==== Tv정보 ====");
		System.out.println("color: " + color);
		System.out.println("power: " + power);
		System.out.println("channel: " + channel);
	}
	
	
	
	
	
	
	
	
	
	
	
}
