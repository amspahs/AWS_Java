package one.Test;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		
		ctv.displayCaption("자막이 켜졌습니다.");//기본값 펄스니까 이프문 작동 안함.
			
		ctv.captionButton();//근데 위에껄 부정을 하네
		
		ctv.displayCaption("자막이 켜졌습니다.");//그럼 이제 작동함
	}
}
