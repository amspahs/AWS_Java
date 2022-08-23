package caption;

public class SilenceTv extends Tv{ // TV기능 물려받기
	
	int beforevolume = 0;
	boolean silenceButton = false;// 음소거 속성을 켜거나 끈다
	//off
		// 이전 볼륨의 값
	
	void silenceButton(){// 음소거버튼 기능구현 off->on
		silenceButton = !silenceButton;
		
		if(silenceButton == true) {
			beforevolume = volume;
			volume = 0;
		
		}else {
			volume = beforevolume;
			
		}
	}	
		/*
		 * 버튼을 누를때 마다 음소거 상태는 변경
		 * 
		 * 음소거 속성이 켜졌는지, 꺼져있는지 
		 * 켜져있으면 ...
		 * 소리를 끈다
		 * 꺼져있으면...
		 * 이전 볼륨으로
		 * */
		
}	
	

