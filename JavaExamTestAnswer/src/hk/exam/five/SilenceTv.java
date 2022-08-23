package hk.exam.five;

public class SilenceTv extends Tv {

	protected boolean silence = false;    // 음소거 동작 가능 여부
	protected int previousVolume = 0;     // 이전 볼륨 정보

	// 음소거 버튼
	public void silenceButton() {
		silence = !silence;
		if (silence) {
			previousVolume = volume;
			volume = 0;
		} else {
			volume = previousVolume;
		}
	}

	// 전원 버튼
	@Override
	public void powerButton() {
		// TODO Auto-generated method stub
		power = !power;
		System.out.println("음소거 Tv");

	}
	
	@Override
	public String toString() {
		return "SilenceTv [power " + power + ", channel=" + channel + ", volume=" + volume + " silence=" + silence
				+ "]";
	}



	
}
