package one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {	//좀 그럴싸한, 예외 처리 적용된 프로그램이다.

	public static void main(String[] args) {

		int num = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("숫자 입력");
				num = scan.nextInt();

				System.out.println(num);

			} catch (InputMismatchException ime) {
				// TODO: handle exception
				System.out.println(ime);
				System.out.println("호갱님. 숫자만 입력해주세요.");
				scan.next();
				
			} catch (IllegalStateException ise) {
				System.out.println(ise);
				System.err.println("호갱센터에 문의해주세요.");
				System.err.println("항상 감사하십시오.");
				num = -1;
			}
			
			if(num == 999) {
				scan.close();
			}

			if (num == -1) {
				break;
			}
			
		}
			System.out.println("프로그램 종료");
	}

}