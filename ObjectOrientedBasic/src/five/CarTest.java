package five;
//	this
public class CarTest {

//	this?
//	생성자의 이름으로 클래스 이름 대신 this를 사용한다.
//	this는 그 인스턴스의 주소이다.
	
	
	public static void main(String[] args) {
		Car car = new Car("grey", "auto", 4);
	
		System.out.println("메인에서 address: " + car);
		car.carInfo();

	}
}
