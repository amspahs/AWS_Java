import java.util.Scanner;

public class Hol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strS = "";
		String strH = "홀";
		System.out.println("컴퓨터가 구슬을 잡았습니다");
		System.out.println();
		System.out.println("홀/짝 ?");
		strS = scan.nextLine();
		
		if (strS.equals(strH)) {
			System.out.println("정답");
		}else {
			System.out.println("떙");
		}
		scan.close();
	}

}
