package one;

public class Dog implements Animal, OtherAnimal{	//이렇게까지 적어야 완벽하다. 부를 수 있는 추상임.
													//다중 상속이 가능. 충돌하면? 일단 실험 상 아더애니멀에 에러 안남.
//	int footNum = 0;
	String teeth = "";
	String nose = "";
	
	
	
	public void run() {
		System.out.println("Dog run");
	}
	
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dog walk");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog bark");
	}
	
	
}
