
public class PrimitiveClassTest {
	
	public static void main(String[] args) {
		
//		wrapper 래퍼 개념		
//		궁금하면 래퍼에서 박싱, 언박싱만 검색해서 공부하셈
		
		int num = 0;
		
		num = Integer.parseInt("100");	//문자열을 숫자화시켜줌.
		
		System.out.println(num);
		
		double doubleNum = 0.0;
		
		doubleNum = Double.parseDouble("100");
		
		System.out.println(doubleNum);
		
		Boolean boolChk = false;
		
		System.out.println(boolChk);
		
		boolChk = Boolean.valueOf(true);	//모든 기본값은 문자열
		
		System.out.println(boolChk);
		
		
	}
}
