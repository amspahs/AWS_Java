package hk.exam.five;

// Tv클래스는 학생들에게 제공하자 
public abstract class Tv {

	protected boolean power; // tv전원		전원이 꺼진 상태에서는 다른 기능들이 절대 작동되어서는 안된다.
	protected int channel; // 채널 			제일 작은 채널값은 1 최대값 5 5를 넘기면 1이 되어야 함 / 1에서 내려가면 5
							
	protected int volume; // 볼륨 			최소 0 최대 3 0에서는 더 내려가지 않음 / 3에서 더 올라가면 안됨

	public Tv() {
		power = false;
		channel = 1;
		volume = 0;
	}

	// tv전원 키거나 끔
	public abstract void powerButton();

	public void channelUp() {
		if(power == false){
			return;
		}
		
		++channel;
		if (channel > 5) {
			channel = 1;
		}
		System.out.println("현재 채널: " + channel);
	}

	public void channelDown() {
		if(power == false){
			return;
		}
		
		--channel;
		if (channel < 1) {
			channel = 5;
		}
		System.out.println("현재 채널: " + channel);
	}

	public void volumeUp() {
		if(power == false){
			return;
		}
		
		volume++;
		if (volume > 3) {
			volume = 3;
			System.out.println("볼륨을 더이상 높일 수 없습니다. ");
		}
		System.out.println("현재 볼륨: " + volume);
	}

	public void volumeDown() {
		if(power == false){
			return;
		}
		
		volume--;
		if (volume < 0) {
			volume = 0;
			System.out.println("볼륨을 더이상 낮출 수 없습니다 ");
		}
		System.out.println("현재 볼륨: " + volume);
	}

	@Override
	public String toString() {
		return "Tv [power " + power + ", channel=" + channel + ", volume=" + volume + "]";
	}

}
