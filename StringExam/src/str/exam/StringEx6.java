package str.exam;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "2022/07/27"; // 기준
		String changeStr = "";
		
//		날짜를 아래와 같이 출력하시오 
// 		ex: 출력형태 
//		2022년07월27일 
		String firstStr = "";
		String secondStr = "";
		String thirdStr = "";
		String year = "";
		String month = "";
		String day = "";
			
		firstStr = originStr.substring(0, 4);				//기본기에 충실한 느낌? 잘라내서 붙이고 합치고
		year = originStr.substring(4);
		year = "년";
		
		secondStr = originStr.substring(5, 7);
		month = originStr.substring(7);
		month = "월";
		
		thirdStr = originStr.substring(8, originStr.length());
		day = "일 ";
	
//		changeStr = firstStr + "년" + secondStr + "월" + thirdStr + "일 ";	//이건 그냥 잘라서 붙인 거고
		changeStr = firstStr + year + secondStr + month + thirdStr + day;	//이건 붙일 것을 변수로 지정해 본 것
												//선생님은 substring 쓰기는 하는데 첫 슬래시와 두번째 슬래시를 인트 변수로 찾아냈다.
												//"/", 첫번째변수 + 1로 찾으면 다음 슬래시를 찾아냄 
												//마지막엔 슬래시가 없는데 렝쓰로 찾아냄
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
