package four;

public class CarTest2 {
	public static void main(String[] args) {
		
	
	Car2 car2 = new Car2("red", "manual", 4, 4, 2000);		//생성자, **인스턴스 변수 초기화 메서드, 공장초기화하면 들어있는 기본어플같은 느낌으로 박힘
	
	System.out.println("car의 색상: " + car2.color + ",\t\t기어타입: " + car2.gearType
						+ ",\t문 수: " + car2.door + ",\t\t타이어 개수: " + car2.tire + ",\t배기량: " + car2.displacement);
	
	Car2 car3 = new Car2("black", "auto", 5, 4, 20000);
	
	System.out.println("car의 색상: " + car3.color + ",\t기어타입: " + car3.gearType
						+ ",\t문 수: " + car3.door + ",\t\t타이어 개수: " + car3.tire + ",\t배기량: " + car3.displacement);
	
	}

}