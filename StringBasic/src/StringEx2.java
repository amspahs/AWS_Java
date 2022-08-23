
public class StringEx2 {
	
	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		
		String c = a + b;
		
		System.out.println(c == "ab");	//서로 다른 ab다. new가 두번 생성된다.
		System.out.println(c == (a + b));
	}
}
