package five.test;

public class Human_ref {

	String name = "";
	int age = 0;
	String gender = "";
	String mbti = "";
	
	Human_ref(){}
	
	Human_ref(String name, String gender, String mbti, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mbti = mbti;
	}
	
	void profile() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("MBTI: " + mbti);
	}
	
	
			
	
}
