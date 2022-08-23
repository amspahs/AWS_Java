package one.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {	//배열 크기를 자유자재로 조정 가능. 원래 알던 static한 배열과 다르다. 다이나믹

	public static void main(String[] args) {
		
//		ArrayList 참조 변수명 = new ArrayList(list 크기);
		ArrayList arrayList = new ArrayList(5);	
		
		arrayList.add(1);
		arrayList.add(2);	
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.get(4));
		System.out.println(arrayList.get(5));
		
		System.out.println("==========배열 시작==========");
		
		int[] numArr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) {	//여기서 넘렝쓰 +1 해도 안됨. 이 배열은 한번 만들면 개수 조정 불가능함.
			numArr[i] = i + 1;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
}

	