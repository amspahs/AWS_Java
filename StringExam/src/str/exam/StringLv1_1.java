package str.exam;

public class StringLv1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과
		
//		String java = "";
//		String fStr = "";
//		String sStr = "";
//		
//		java = "db";
//		fStr = originStr.substring(originStr.indexOf("를"), 4);
//		sStr = originStr.substring(originStr.indexOf("라"));
//		
//		changeStr = java + fStr + java + sStr;						//여기까진 내가 한 것.
		
		int idx1 = originStr.indexOf("자바");
		int idx2 = originStr.lastIndexOf("자바");
		
		changeStr = "db" + originStr.substring(idx1 + 2, idx2) + "db" + originStr.substring(idx2 + 2);	//김반장님꺼
		
		
//		자바를 자바라를 db를 db라로 변경하여 출력하시오 
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
		
	}

}
