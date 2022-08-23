package hk.exam.two;

public class GugudanService {

	public void showGugudan(int number) {
		System.out.print("    " + number + "단\n");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + (i * number));
		}

	}

	
	public void showGugudan(int frontIndex, int lastIndex) {

		if (frontIndex > lastIndex) {
			System.out.println("처음 숫자가 마지막 숫자보다 클 수 없습니다.");
			return;
		}

		for (int i = frontIndex; i <= lastIndex; i++) {
			System.out.print("   " + i + "단\t\t");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = frontIndex; j <= lastIndex; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}

	}

}
