import java.util.Calendar;
import java.util.Random;

public class RandomBasic2 {	//이게 현업 수준의 매스랜덤. 매스랜덤은 교육용으로 사용하는 것임

   public static void main(String[] args) {
      // TODO Auto-generated method stub

//		난수 생성
	   Calendar cal = Calendar.getInstance();
	   System.out.println(cal.getTimeInMillis());
	   
	   Random random = new Random(cal.getTimeInMillis());	//얘가 밀리초 난수 넣은 것임. 캘린더 겟타임밀리초로 임포트
	   Random random2 = new Random(3);
  
//	   seed? 시드란, 주어진 값을 기준으로 무언가를 설정할 때 쓰임
	   
//	   유일값을 얻는 난수를 사용
//	   UUID 유니크 아이덴티티
	   
//	   현재날짜 -> 밀리초로 만들어 난수 씨드로 쓰면 예측 불가함.
	   System.out.println(random.nextInt(10));	//밀리초 부분에 뭘 적으면 난수와 비슷한 것이 생성됨.
	   System.out.println(random2.nextInt(10));
      
   }

}