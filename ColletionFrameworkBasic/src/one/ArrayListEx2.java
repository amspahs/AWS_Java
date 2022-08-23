package one;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
//		ArrayList 참조 변수명 = new ArrayList(list 크기);
		ArrayList arrayList = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		
		arrayList.add("가");	//숫자도 들어가고 문자도 들어감.
		arrayList.add("나");
		arrayList.add("다");
		
		for (int i = 0; i < arrayList.size(); i++) {	//렝쓰 대신 사이즈가 명확하게 크기를 나타냄.
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("list의 크기: " + arrayList.size());
		System.out.println();
		
		//데이터 하나 지우기
		arrayList.remove(0);	//원래 배열에서 데이터 지우기는 매우 어렵다. 여기선 쉽다.

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//list가 비워져 있는지 확인
		System.out.println(arrayList.isEmpty());
		
		//데이터 전부 지우기
		arrayList.clear();
		
		System.out.println(arrayList.isEmpty());
		
		System.out.println("list의 크기: " + arrayList.size());
	}
}

