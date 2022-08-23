package one;

public class InheriTest {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		
		Child child = new Child();
		
		GrandChild grandchild = new GrandChild();
		
		parent.age = 40;
//		parent.play(); //없어서 오류
		System.out.println(parent.age);
		
		child.age = 1;
		child.play();	//상속 되었으니 안오류
		System.out.println(child.age);
		
		grandchild.age = 30;
		grandchild.birthYear = 2007;
		grandchild.play();
		System.out.println(grandchild.age);
		System.out.println(grandchild.birthYear);
		
		//자식이 호쌍새라서 부모님 덕으로 잘 컸는데 효도 안함.
	}
}
