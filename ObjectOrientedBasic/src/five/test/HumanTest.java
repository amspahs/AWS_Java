package five.test;

public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human("김재섭", 34, "남자", "인프제");
	
		human.HumanInfo();
	
		System.out.println();
		
		Human human2 = new Human("홍길동", 999, "남자", "????");
	
		human2.HumanInfo2();
	}

}