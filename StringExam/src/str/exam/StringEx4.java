package str.exam;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 m메서드를 활용haja하자"; // 기준
		String changeStr = "";
		
//		영어로 적힌 부분들을 모두 대문자화 하여 
//		기존의 문자열에 출력되도록 하시오
// 		ex: 문자열 메서드를 활용HAJA하자
//		changeStr = originStr.substring(originStr.indexOf('h'), originStr.indexOf('h' + 4))+"";	//베끼다가 실패함. 이 줄에서 오류남.
//		changeStr = changeStr.toUpperCase();
//		
//		originStr = changeStr.replace("haja", changeStr);
//		
//		System.out.println(originStr);
//		System.out.println(changeStr);

		String tempFirstStr = "";			//선생님의 코드. 리플레이스는 같은 것을 다 바꾸기 때문에 위험하다. 결국 노가다 하게 할 수도 있어.
		String tempEngStr = "";				//그래서 특정 코드만 찝어내서 바꿔주는 방법이 중요할 수 있다.
		String tempSecondStr = "";
		
		tempFirstStr = originStr.substring(0, 12);	//앞부분, 바꿀 부분, 뒷부분으로 블록화해서 잘라 보관
		tempEngStr = originStr.substring(12, 16);
		tempSecondStr = originStr.substring(16, originStr.length());
		
		tempEngStr = tempEngStr.toUpperCase();	//바꿀 블록만 바꾼 뒤 합침
		
		changeStr = tempFirstStr + tempEngStr + tempSecondStr;
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
		
		
	}

}
