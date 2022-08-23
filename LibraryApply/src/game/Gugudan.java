package game;

//	jar파일 만들기
public class Gugudan {
	
	public void rowGugudanView() {
		int resultNum = 0;
		
		for (int i = 2; i < 9; i++) {
			System.out.println(i + "단");	//제목
			for (int n = 1; n < 9; n++) {
				resultNum = i * n;
				System.out.print(i + " * " + n + " = " + resultNum + "\t");
			}	
			System.out.println();	//라인
		}	//첫 for문 종료

	}
}
