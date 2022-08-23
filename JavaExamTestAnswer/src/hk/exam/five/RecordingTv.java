package hk.exam.five;

public class RecordingTv extends Tv{

	protected boolean record = false;
	
	void recordingButton(){
		record = !record;
		
		if(record){
			System.out.println("녹화 시작");
		}else{
			System.out.println("녹화 종료");
		}
		
	}

	@Override
	public void powerButton() {
		// TODO Auto-generated method stub
		power = !power;
		System.out.println("녹화 Tv");
	}

	@Override
	public String toString() {
		return "RecordingTv [record=" + record + ", power=" + power + ", channel=" + channel + ", volume=" + volume
				+ "]";
	}
	
}
