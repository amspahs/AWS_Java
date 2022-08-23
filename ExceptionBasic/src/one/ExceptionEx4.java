package one;

public class ExceptionEx4 {

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
		
		}
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