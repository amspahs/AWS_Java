import java.util.Date;

public class DateTest {	//이거 모르면 살아남을 수 없다

	public static void main(String[] args) {
		
		Date date = new Date();		//운영체제에 맞게 생성됨
	
		System.out.println(date);	//미국식
		
		String yearStr = "";
		String monthStr = "";
		String dateStr = "";
		String hourStr = "";
		String minuteStr = "";
		String secondStr = "";
												//디플리케이티드, 사장되었다. 딴 거 쓰라고 취소선 그어줌
		yearStr = date.getYear() + 1900 + "";	//1900부터 시작해서 이리 됨. 1900 더해주면 됨.
		monthStr = date.getMonth() + 1 + "";	//0이 1월임. 10진수...
		dateStr = date.getDate() + "";			//day는 월요일이 1, 우리가 원하는 값은 date.
		hourStr = date.getHours() + "";			//기본은 24시간제. 조건 달아서 바꿀 수 있겠지? 오후 8시 이렇게
		minuteStr = date.getMinutes() + "";
		secondStr = date.getSeconds() + "";
//		단위? 배워야 되는데 시간 상 나중으로
		System.out.println(yearStr);
		System.out.println(monthStr);
		System.out.println(dateStr);
		System.out.println(hourStr);
		System.out.println(minuteStr);
		System.out.println(secondStr);
	
	}
}
