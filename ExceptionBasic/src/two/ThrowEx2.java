package two;

public class ThrowEx2 {

	public static void main(String[] args) {

//		IndexOutOfBoundsException
//		널 포인터 예외를 발생시켜서 예외 처리를 수행하시오.
		
		String message = "";
		IndexOutOfBoundsException e = null;
		NullPointerException npe = null;
		
		try {
			e = new IndexOutOfBoundsException("고의로 예외 발생");	//객체를 만들어야 수행 가능
			npe = new NullPointerException("고의로 예외 발생");	//객체를 만들어야 수행 가능
			
			throw e;	//객체 던짐
			
		} catch (IndexOutOfBoundsException iob) {
			message = "인덱스아웃오류";
			System.out.println(iob.getMessage());
			e.printStackTrace();
			
		try {
			
		} catch (IndexOutOfBoundsException r) {
			message = "널포인트오류";
			System.out.println(iob.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		}
	}
}
