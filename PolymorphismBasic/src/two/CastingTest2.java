package two;

public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		기본형 변수와 같이 참조변수도 형변환이 가능하다
//		단, 서로 상속관계에있는 클래스 사이에서만 가능하기 때문에
//		자식타입의 참조변수를 부모타입의 참조변수로, 조상타입의 참조변수를
//		자식타입의 참조변수로의 형변환만 가능하다
		
//		
//		자식타입 > 조상타입(up-casting): 형변환 생략가능
//		부모타입 > 자식타입(down-casting): 형변환 생략불가
		
		Car car = null;
		FireEngine fe = new FireEngine();
		Ambulance am = null;
			
//		am = fe;
//		am = (Ambulance)fe; > 상속관계가 아닌클래스
//		
//		am = car;
		am = (Ambulance)car;
		
	}

}
