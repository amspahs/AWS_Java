package four;

public class CarTest {
	public static void main(String[] args) {
		
	
	Car car = new Car();
	
	car.color = "흰색";								//공장초기화 하고나서 내가 어플 세개 깔은 느낌
	car.gearType = "auto";
	car.door = 4;
	
	Car newCar = new Car("red", "manual", 4);		//생성자, **인스턴스 변수 초기화 메서드, 공장초기화하면 들어있는 기본어플같은 느낌으로 박힘
	
	System.out.println("car의 색상: " + car.color + ",\t\t기어타입: " + car.gearType
						+ ",\t문 수: " + car.door);

	System.out.println("newCar의 색상: " + newCar.color + ",\t기어타입: " + newCar.gearType
						+ ",\t문 수: " + newCar.door);
	
	}
}