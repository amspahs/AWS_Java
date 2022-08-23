package two;

public class ThrowEx1 {

	public static void main(String[] args) {

		Exception e = null;

		try {
			e = new Exception("고의로 예외 발생");

			throw e;
			
		} catch (Exception exception) {
			
			System.out.println("에러 메시지: " + exception.getMessage());

			exception.printStackTrace();	//스택 추적 명시(원래 디버그 같은 거 켜면 자동으로 해줬음)
											//이걸 해야 해
		}
		
		System.out.println("프로그램 종료");
	}
}
/*
 * 예외 발생시키기
 * 
 * throw를 사용하여 프로그래머가 고의로 예외를 발생시킬 수 있다.
 * 
 * 1. 먼저 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
 * 
 * ex: Exception e = new Exception("고의 발생");
 * 
 * 2. 키워드 throw를 이용해서 예외를 발생시킨다.
 * 
 * throw e;
 */