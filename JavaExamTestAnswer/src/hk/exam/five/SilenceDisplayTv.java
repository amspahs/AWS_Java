package hk.exam.five;

public class SilenceDisplayTv extends SilenceTv{

	public void silenceButton(){
		if(power == false){
			return;
		}
		
		super.silence = !super.silence;
		if(silence){
			previousVolume = super.volume;
			super.volume = 0;
			System.out.println("-----음소거 모드 사용중----");
		}else{
			volume = previousVolume;
			System.out.println("-----음소거 모드 종료----");
		}
		System.out.println("현재 볼륨: " + super.volume);
		
	}
	
	@Override
	public void powerButton() {
		// TODO Auto-generated method stub
		power = !power;
		if(power == false){
			System.out.println("음소거 상태표시 가능 Tv 꺼짐");
		}else{
			System.out.println("음소거 상태표시 가능 Tv 켜짐");
		}
		
	}
	
	@Override
	public String toString() {
		return "SilenceDisplayTv [power " + power + ", channel=" + channel + ", volume=" + volume 
				+ " silence=" + silence + "]";
	}
	
}