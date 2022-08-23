
public class MaxAndMin {
	public static void main(String[] args) {
		
//		랜덤한 숫자 5개를 배열에 담는다
//		
//		그 5개의 숫자 중에 가장 큰 값과 가장 작은 값을 출력하시오
	
//		Math.random() 사용
//		1~20
	
//		1 5 15 7 1
		
		int rndNum = 0;						//난수생성을 위한 방
		
		rndNum = (int)(Math.random() * 10);	//난수 생성, 1~9
		
		
				
		
		
		System.out.println(rndNum);
		
//		배열5칸 지정
//		배열 순서대로 지정해주는 포문
//		난수생성 *20으로 19까지 나오게 하고 +1해서 1~20까지 나오게함
//		최대값과 최소값 구분하는 배열초기화를 하고
//		포 이프로 서로 비교해서 방에 들어가게 해
//		문 닫으면 마지막에 출력문 작성, 사진찍었으니 참조해라
		
	
	
	
	
	
//		7.15 수업 여기부터, Max와 Min 계속
		int[] scoreNumArr = new int[3];
		
		int maxNum = 0;	//임시로 써먹을 변수 선언해 놔
		int minNum = 0;
		System.out.println(scoreNumArr.length);
		
		for (int i = 0; i < 3; i++) {	//앞으로 for문의 i는 0으로 해라. 배열할 때 필요하다. 구구단 같은 거 아니면 말이야.
			scoreNumArr[i] =(i + 5) * 10; 
		}
	
		maxNum = scoreNumArr[0];
		minNum = scoreNumArr[0];
		
		for (int i = 0; i < scoreNumArr.length; i++) {	//현업 레벨에서는 렝쓰 이용. 모든 것이 변수화 되어야 함.
			
			if(scoreNumArr[i] > maxNum) {
				maxNum = scoreNumArr[i];
			}else if(scoreNumArr[i] < minNum) {
				minNum = scoreNumArr[i];
			}	
			
	}// end for
	
		System.out.println(maxNum);
		System.out.println(minNum);
	
	
	
	
	}
}
