package one;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
//		ArrayList 참조 변수명 = new ArrayList(list 크기);
		ArrayList arrayList = new ArrayList(5);	//어레이리스트는 클래스로 구현되어 있어.
		
		arrayList.add(1);	//다섯개의 공간에 어레이리스트를 만듦.
		arrayList.add(2);	//애드는 할당 연산자. 값을 넣어준다. 객체지향은 메서드 안에 이런 거 써서 함. = 잘 안쓴다.
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.get(4));
		
	}
}






/*
	List 인터페이스
	중복을 허용하면서 저장순서가 유지되는 인터페이스이다.
	
	List의 구현 클래스 -> ArrayList 등이 있다.
	
*/
	