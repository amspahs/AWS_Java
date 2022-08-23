package three;

public class ExceptionEx5 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);

		} catch (ArithmeticException ae) {
			System.err.println(5);

		} catch (Exception e) {
			System.err.println(6);

		}finally {
			System.out.println("새로 만든 파이날문");		//예외가 있든지 없든지 무조건 마지막으로 수행한 뒤에 종료
		}											//마무리 작업을 넣을 때(스캔 클로즈 같은 것)
		System.out.println(7);
	}

}

//System.out.println(1);
//System.out.println(2);
//
//try {
//	System.out.println(3);
//	System.out.println(0 / 0);
//	System.out.println(4);		//현업에서는 적재적소에 작은 단위를 넣어서 예외 처리하셈
//
//} catch (Exception e) {		//얘가 부모라서 밑에 아리스메틱까지 닿을 수 없음. 밑에꺼 중복이니 지워.
//	System.err.println(6);		//최상위 예외 처리 기능
//
//} catch (ArithmeticException ae) {	//아리스메틱이 익셉션 위에 오면 수행 가능
//	System.err.println(5);
//
//}
//System.out.println(7);
//}