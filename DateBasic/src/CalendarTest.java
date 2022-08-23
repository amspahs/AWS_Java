import java.util.Calendar;

public class CalendarTest {	//이거 모르면 살아남을 수 없다

	public static void main(String[] args) {
		
//		Calendar date = new Calendar();			//캘린더는 인스턴스화가 안됨. 추상성(abstract) 반영된 특별한 클래스여서 보통의 방법으론 안됨.
		Calendar date = Calendar.getInstance();	//이렇게 특이한 애는 뉴가 없어야 됨.
//		Calendar는 세계 공용이라 스태틱으로 바로 접근할 수 있음. 높으신 분들만 건드릴 수 있음. 우리는 그저 갖다 쓸 뿐.
	
		System.out.println(date);	//미국식
		
		int yearStr = 0;
		int monthStr = 0;
		int dateStr = 0;
		int hourStr = 0;
		int minuteStr = 0;
		int secondStr = 0;
				
		yearStr = date.get(Calendar.YEAR);	//유일한 것을 적용하기 위해 다 대문자, 스태틱, 상수화
		monthStr = date.get(Calendar.MONTH) + 1;
		dateStr = date.get(Calendar.DATE);
		hourStr = date.get(Calendar.HOUR);
		minuteStr = date.get(Calendar.MINUTE);
		secondStr = date.get(Calendar.SECOND);

		System.out.println(yearStr);
		System.out.println(monthStr);
		System.out.println(dateStr);
		System.out.println(hourStr);
		System.out.println(minuteStr);
		System.out.println(secondStr);
	
	}
}
