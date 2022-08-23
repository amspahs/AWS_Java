package test;

import people.Human;

public class HumanTest {

	public static void main(String[] args) {
		
		Human h = new Human();	//getter, setter 적용. 이거 약속같은 거래.
		
		h.setName("박성욱");
		h.setAge(36);
		h.setSex("남");
		h.setHaircolor("검정색");
		
		String name = "";
		int age = 0;
		String sex = "";
		String haircolor = "";
	
		name = h.getName();
		age = h.getAge();
		sex = h.getSex();
		haircolor = h.getHaircolor();
		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(sex);
//		System.out.println(hairColor);
		
		System.out.println(h);
	
	
	
	
	
	
	}



}
