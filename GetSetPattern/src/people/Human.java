package people;

public class Human {	//getter, setter 적용. 이거 약속같은 거래.
						//DTO, Data Transport Object
	private String name = "";	//Source -> generate getters and setters -> select all -> generate
	private int age = 0;		//현업 레벨의 게러세러 패턴
	private String sex = "";
	private String haircolor = "";
	
	public Human() {	//Source -> generate constructor using fields -> deselect all -> generate
		super();		//기본생성자 생성, 이거 넣어야 함
	}

	public Human(String name, int age, String sex, String haircolor) {
		super();		//Source -> generate constructor using fields -> select all -> generate
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.haircolor = haircolor;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getHaircolor() {
		return haircolor;
	}
	public void setHaircolor(String haircolor) {
		this.haircolor = haircolor;
	}

	@Override	//Source -> generate toString
	public String toString() {	//**투 스트링: 우리방식으로 자식들에서 선언을 해주면 주소값이 아니라 문자열, 인스턴스 등 내용 나옴.
		return "Human [name=" + name + ", age=" + age + ", sex=" + sex 
				+ ", haircolor=" + haircolor + "]";
	}
	

		
}
