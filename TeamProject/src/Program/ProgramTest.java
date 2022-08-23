package Program;

import java.util.Scanner;

public class ProgramTest {
	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		Program program = new Program();
		
		program.welcome();
		
		
		num=sc.nextInt();
		System.out.println();
		
		program.viewProgram(num);
	}
}
