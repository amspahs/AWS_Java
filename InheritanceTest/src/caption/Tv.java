package caption;

public class Tv { 

	boolean power;
	int channel;
	int volume;	// 볼륨 속성 추가
	
	public void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	void channelDown(){
		channel--;
	}
	
	
	void volumeUp(){	// 볼륨 업 기능구현
		volume++;
	}
	
	void volumeDown(){	// 볼륨 다운 기능구현
		volume--;
	}
		
}
