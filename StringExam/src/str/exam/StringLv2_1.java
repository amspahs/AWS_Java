package str.exam;

public class StringLv2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과   

//		문자열 안에서 마지막 문자가 무엇인지 출력하시오 
		
		changeStr = originStr.charAt(originStr.length() - 1) + "";	//내가 한 것
		
		changeStr = originStr.substring(originStr.length() - 1);	//건황씨꺼
		
		System.out.println(originStr);
		System.out.println(changeStr);

//		valueOf는 뭐든지 문자화 시키기 때문에 쓸만할 것임. 
	}

}
