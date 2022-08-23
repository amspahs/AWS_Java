package str.exam;

public class StringEx3 {

	public static void main(String[] args) {	//substring의 중요성
		// TODO Auto-generated method stub

		// 

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열 메서드를 활용haja하자"; // 기준
		String changeStr = "";
		
//		영어로 적힌 부분들을 모두 대문자화 하여 영어만 출력하시오 
//		changeStr = originStr.toUpperCase();
//		changeStr = changeStr.substring(11, 15);	//배열 때와 같음. 같거나 작다라서 14까지가 아니라 15까지임.
		
//체인 메서드, 체이닝 메서드: 한 줄에 한마디 적는다. 근데 경력자들의 영역이다. 높은 분석력이 필요해서 유지보수에 죽어난다.
//멋진 코드이나 배우는 입장에서는 쉽게 풀어쓰는 걸로 하자. 현업 가서 쓰든지 말든지.		
		changeStr = changeStr.substring(11, 15).toUpperCase();	//모범답안, 4개만 추려서 4개만 대문자화 = 연산 빠름.

		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
