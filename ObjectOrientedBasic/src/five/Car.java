package five;

public class Car {
	
	String color = "";
	String gearType = "";
	int door = 0;

	Car(){
		
	}
	
	public Car(String color, String gearType, int door) {	//생성자
		this.color = color;								
		this.gearType = gearType;
		this.door = door;
	}
	
	void carInfo() {
//		String color = "이건 메서드 안에서 만든 내용이야.";	//인스턴스 변수(위에있는 애)는 힙에 있는데 얘는 지역변수라 가까워서 얠 땡겨씀
		System.out.println("나의 드림카 정보");
		System.out.println("color: " + color);	//사실 이런 거에 다 디스쩜이 들어가야 되는데 컴이 알아서 넣어줌
		System.out.println("gearType: " + gearType);
		System.out.println("door: " + door);
		
//		System.out.println(this);		//자기 자신, 나
//		System.out.println(this.color);
	}
	

}
