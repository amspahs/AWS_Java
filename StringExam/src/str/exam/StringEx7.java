package str.exam;

import java.util.Iterator;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String passwordOriginStr = "qwer1234"; // 기준
		String passwordChangeStr = "";
		
//		비밀번호를 숨기시오 
// 		ex: 출력형태(8글자라서 8개의 *이 출력됨) 
//		******** 

		for (int i = 0; i < passwordOriginStr.length(); i++) {		//답은 가까이 있었다.
				passwordChangeStr = passwordChangeStr + "*";		
		}
		
		
//		String p = "";
//		p = 
//		for (int i = 0; i < passwordOriginStr.length(); i++) {		//내가하다가말음. 문자부분만 바꾸는 건데 못함.
//			if(passwordOriginStr == boolean )
//			passwordChangeStr = passwordChangeStr + "*";		
//		}
		
		System.out.println(passwordOriginStr);
		System.out.println(passwordChangeStr);

	}

}
