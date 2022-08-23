import java.util.Iterator;

public class StringArrName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 		배열 활용
//		3명의 이름을 배열을 통해 출력
//		단, 반복문 사용 금지

		String[] strArr = new String[3];

		strArr[0] = "남기형";
		strArr[1] = "손다예";
		strArr[2] = "김소진";

//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);

//		여기는 반복문 사용		
		
		for (int i = 0; i < 3; i++) {	//헷갈리니까 뉴 스트링 초기화 때 넣은 숫자를 조건식에 넣자. 여기선 같다를 빼는 것이 덜 헷갈림
			System.out.println(strArr[i]);
		}
		
		
	}

}
