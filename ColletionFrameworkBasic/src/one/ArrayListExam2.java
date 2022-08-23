package one;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam2 {	//1부터 10까지 차례대로 들어가게 하고 clear() 없이 다 지우기

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();	
		
//		for (int i = 0; i < 10; i++) {
//			arrayList.add(i);
//			System.out.println(arrayList.get(i));
//		}
//		
//			System.out.println();
//		
//		for (int i = 0; i < 10; i++) {
//			arrayList.remove(0);		//데이터 구조 상 i 쓰면 바운더리예외 뜸. 0을 계속 지워서 밑둥썰기 해야 다 지워짐.
//		
//		}
//		System.out.println(arrayList.isEmpty());
	
		for (int i = 0; i < 10; i++) {		//선생님 하신 것
			arrayList.add(i+1);
		}
		
//		검증하는 습관이 중요. 밑에가 검증. 검증하고 주석 처리해놔.
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
		
//		arrayList.remove(0);	//밑에서부터 지우면 오류남.
//		arrayList.remove(1);
//		arrayList.remove(2);
//		arrayList.remove(3);
//		arrayList.remove(4);
//		arrayList.remove(5);
//		arrayList.remove(6);
//		arrayList.remove(7);
//		arrayList.remove(8);
//		arrayList.remove(9);
	
//		arrayList.remove(9);	//위에서부터 지우면 오류 안 남. 아래에 변화가 없음. 스택식. 젠가같은 구조임.
//		arrayList.remove(8);
//		arrayList.remove(7);	
//		arrayList.remove(6);
//		arrayList.remove(5);
//		arrayList.remove(4);
//		arrayList.remove(3);
//		arrayList.remove(2);
//		arrayList.remove(1);
//		arrayList.remove(0);
		
		for (int i = arrayList.size() - 1; i >= 0; i--) {	//바로 위의 것을 포문으로 처리하려면 이렇게 마마 써야함.
			arrayList.remove(i);							//근데 이거 회사에서는 거의 안 씀. 이렇게 한다는 개념만 가져가셈.
		}
		
		System.out.println(arrayList.size());
	}
}
/*
	list의 특징
	배열을 이용한 자료구조는 데이터를 읽어오고 저장하는 데는 효율이 좋다.
	하지만 용량을 변경해야할 때는 새로운 배열을 생성한 후에 기존의 배열로부터 새로 생성된
	배열로 데이터를 복사해야하기 때문에 상당히 효율이 떨어진다는 단점이 있다.
	
	ArrayList 순차적인 추가 삭제는 빠르다.
	비효율적인 메모리 사용이 가능하니 추가/삭제는 주의해야 한다.
	ex: 중간이나 처음 삭제/추가가 필요한 경우	//이걸 쓰면 엄청 느려진다.

*/
