package three.test;

//캡션 기능이 있는 TV
public class CaptionTv extends Tv{

	boolean caption = false;
	String captionStr = "";	//현업에선 캡션스테이터스 같은 걸로 씀
	
	void captionButton() {
		caption = !caption;
	}
			
	void displayCaption(String text) {
		
		//캡션 상태가 켜졌을 경우 알려준다.
		if(caption == true) {
			System.out.println(text);
		}
	}
	
	void info() {
		if(caption == false) {
			captionStr = "끔";
		} else {
			captionStr = "켬";
		}
			System.out.println("==== Tv정보 ====");
			System.out.println("color: " + color);
			System.out.println("power: " + power);
			System.out.println("channel: " + channel);
			System.out.println("자막 여부: " + captionStr);
	}	
}
