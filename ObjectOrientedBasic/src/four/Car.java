package four;

public class Car {
	
	String color = "";			//색상
	String gearType = "";		//변속기 종류 - auto, manual
	int door = 0;				//문의 개수
								//디폴트값임.
	Car(){
		
	}
	
	public Car(String c, String g, int d) {		//생성자, 여기서 초기화가 된다.
		color = c;								
		gearType = g;
		door = d;
	}
	
	
	

}
