import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimpleFormatTest3 {

	public static void main(String[] args) {
		
//		형식화 클래스 Format
		
//		형태를 만들어주는 느낌이다
//		원하는 형식으로 내용을 변환해주는 것
		
		Date date = new Date();	
	
//		패턴. 지켜줘야 되는 것
//		yyyy	: 연도(대문자로 적으면 뭔가 다르다. 보통은 대문자로 적는다.)
//		MM		: 월
//		dd		: 날짜
//		hh		: 12시간(대문자로 적으면 +12를 한 것과 같다.)
//		HH		: 24시간
//		mm		: 분
//		ss		: 초
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	//패턴
		SimpleDateFormat KoreaSdf = new SimpleDateFormat("YYYY년MM월dd일");	//나중에 DB에서 하게 됨
		
		String resultDate = sdf.format(date);
		String KoreaDate = KoreaSdf.format(date);
	
		System.out.println(date);
		System.out.println(resultDate);
		System.out.println(KoreaDate);
	}
}
