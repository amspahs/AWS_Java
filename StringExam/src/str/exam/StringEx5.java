package str.exam;

public class StringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String firstStr = "";
		String secondStr = "";
		String thirdStr = "";
		
//		문자열에서 뛰워쓰기 되어있는 각각의 단어를 분리하여 출력하시오 			//이 문제는 스플릿을 쓰면 공백이 날아가서 위험하다는 것을 알려줌.
// 		ex: 출력형태 
//		문자열 
//		메서드를  
//		활용HAJA하자
		
		firstStr = originStr.substring(0, 4);					//charAt, substring, indexOf 기본, 기본을 이해하면 나머지는 도와줄 것.
		secondStr = originStr.substring(4, 9);					//이 문제에서 인덱스오브를 추가하면 더 객체지향적이 됨. 문자로 자를 수도 있음.업글
		thirdStr = originStr.substring(9, originStr.length());
	
		originStr = firstStr + secondStr + thirdStr;
		
		System.out.println(originStr);
		System.out.println(firstStr);
		System.out.println(secondStr);
		System.out.println(thirdStr);

		System.out.println(firstStr + secondStr + thirdStr);
	}

}
