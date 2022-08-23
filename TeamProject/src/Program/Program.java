package Program;

public class Program {
	
	Program(){		
	}

	void welcome() {
		System.out.println("홀짝 판별 프로그램입니다.");
		System.out.println("어서오세요, 고객님.");
		System.out.println();
		System.out.println("홀짝 판별을 하고 싶은 숫자를 하나 입력해주세요.");
	}

	void viewProgram(int num) {

		if (num % 2 == 0) {
			System.out.println(num + "은 짝입니다.");
		} else {
			System.out.println(num + "은 홀입니다.");
		}

	}



}
