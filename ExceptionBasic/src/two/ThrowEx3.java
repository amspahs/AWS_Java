package two;

public class ThrowEx3 {

	public static void main(String[] args) {

//   indexOutOf바운드 예외	      
//	 널포인터예외를 발생 시켜서 예외처리를 수행하시오

		String message = "";
		IndexOutOfBoundsException ioobe = null;
		NullPointerException npe = null;

		try {
			ioobe = new IndexOutOfBoundsException("IndexOutOfBoundsException");
//		    npe = new NullPointerException("NullPointerException");

			throw ioobe;
//			throw npe;

		} catch (Exception e) {					//익셉션이 최상위라서 이거 쓰면 됨. 지금은
			System.out.println(e.getMessage());
			
		}
	}

}
