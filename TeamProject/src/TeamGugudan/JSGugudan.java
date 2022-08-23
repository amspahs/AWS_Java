package TeamGugudan;
import java.util.Scanner;

public class JSGugudan {
	public static void main(String[] args) {
		int y = 0;
		
		Scanner scan = new Scanner(System.in);

		QudrbGugudan ggd = new QudrbGugudan();
		
		System.out.print("몇 단을 보여줄까요? ");
		
		y = scan.nextInt();
		
		System.out.println(y + "단");
		
		ggd.qudrbGugudan(y);
		
	}
}
