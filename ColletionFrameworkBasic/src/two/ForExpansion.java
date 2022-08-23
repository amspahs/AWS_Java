package two;

import java.util.Iterator;

public class ForExpansion {

	public static void main(String[] args) {
		
		int[] numArr = new int[5];	//스택의 개념에서는 밑이랑 위랑 차이가 없어. 위가 낭비 같아보여도 말이야.
		
		for (int i = 0; i < numArr.length; i++) {	//추가공을 할 수도 있을 때 i 사용
			numArr[i] = i;
		}
	
//		확장 포문, for each문
		for(int num : numArr) {	//완벽한 것의 안에 있는 데이터만 필요할 때. 추가공하지 않을 때.
			System.out.println(num);
		}
	
	}
}
