package four;

public class ThrowsEx1Test {
	
	public static void main(String[] args) {
		
		ThrowsEx test = new ThrowsEx();

		test.testMethod();
	
		try {
			test.testMethod(0);		//나중에 jsp할 때 다시 하게 됨. 현업에서는 f3으로 찾아가서 형식에 맞게 여기 고쳐주면 됨
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
