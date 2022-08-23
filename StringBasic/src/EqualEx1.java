import java.util.Scanner;

public class EqualEx1 {

	public static void main(String[] args) {
		
		String str = "";
		String str2 = "";
		String str3 = new String("a");
		String str4 = new String("a");
		str = "a";
		System.out.println(str3 == str4); // > false
		System.out.println(str.equals(str4)); // > true
			//	ㄴ 
		Scanner scan = new Scanner(System.in);		
		
		if ("a" == "a") {
			System.out.println("a == a 실행된다");
		}
		
		System.out.println("값 a 입력");
		str = scan.nextLine();
		
		if (str == "a") {
			System.out.println("str == a 실행된다");
		}else {
			System.out.println("X");
		}
			
		str2 = "a";
		
		if (str == str2) {
			System.out.println("str == str2 실행된다");
		}
		
		scan.close();
	}
}
