package str.answer;

public class StringEx2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		int strLength = 0; // 결과
		String resultStr = "";
		
//		문자열 총 길이와 끝에서 3번째 위치의 문자를 출력하시오 //lastIndexOf이건 문자를 출력하는 거라서...여기선 안됨
		strLength = originStr.length();
		resultStr = originStr.charAt(strLength - 3) + "";
		
		System.out.println(originStr);
		System.out.println(strLength);
		System.out.println(resultStr);

	}

}
