package five.test;

public class Human {

		String name = "";
		int age = 0;
		String sex = "";
		String MBTI = "";
		
		Human() {
			
		}

		public Human(String name, int age, String sex, String MBTI) {
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.MBTI = MBTI;
		}

		void HumanInfo() {

		System.out.println("사람 1");
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("성별: " + this.sex);
		System.out.println("MBTI: " + this.MBTI);
		
		}

		void HumanInfo2() {

		System.out.println("사람 2");
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("성별: " + this.sex);
		System.out.println("MBTI: " + this.MBTI);
			
		}

}
