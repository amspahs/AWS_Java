package one.Test;

//캡션 기능이 있는 TV
public class CaptionTv extends Tv{

	boolean caption = false;
	
	void captionButton() {
		caption = !caption;
	}
	
	void displayCaption(String text) {
		
		//캡션 상태가 켜졌을 경우 알려준다.
		if(caption == true) {
			System.out.println(text);
		}
	}

	
}
