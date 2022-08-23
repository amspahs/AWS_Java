package one;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time koreaTime = new Time();
		Time usatime = new Time();
		
		koreaTime.setHour(23);
		koreaTime.setMinute(50);
		koreaTime.setSecond(33);
		
		usatime.setHour(1);
		usatime.setMinute(10);
		usatime.setSecond(20);
		
		System.out.println("한국 현재시각: " + koreaTime.getHour() + "시" 
							+ koreaTime.getMinute() + "분" + koreaTime.getSecond() + "초");
		
		System.out.println("미국 현재시각: " + usatime.getHour() + "시" 
				+ usatime.getMinute() + "분" + usatime.getSecond() + "초");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
