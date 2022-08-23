package four;

public class ThrowsEx {	//여기서 throws Exception 치든지 밑에 메소드에 트라이-캐치문 쓰든지 한군데서는 해주고
					
	void testMethod() {

		try {	//예외 던져서 예외 만들어서 수행했다
			throw new Exception();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

//	메서드에 예외 선언하기
//	throws 키워드를 사용하여 메서드에 선언할 수 있다.
//	선언부에 메서드를 선언해 놓으면 메서드를 사용하려는 사람이 메서드의 선언부를 보았을 때,
//	 이 메서드를 사용하기 위해서 어떠한 예외들이 처리 되어져야 하는지 쉽게 예측할 수 있다.
	void testMethod(int num) throws Exception {
		throw new Exception();
		//다른 개발자에게 예외 처리를 넘김. 내가 만들어 봐야 니 할 때 오류 뜰 것 같으니까 니가 쓸 때 만들어.
	}	//현업은 쓰로우즈가 아주 많다.
}
