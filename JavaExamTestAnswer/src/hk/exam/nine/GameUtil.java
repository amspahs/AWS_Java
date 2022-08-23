package hk.exam.nine;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameUtil {
	
	// 배열안의 내용 중 같은 숫자가 존재하는지 여부 확인
	public static boolean isSame(List<Integer> answerNumberList, int inputNum) {
		boolean isS = false;
		for (int i = 0; i < answerNumberList.size(); i++) {
			if (answerNumberList.get(i) == inputNum) {
				isS = true; // 같은 내용이 존재하면 true
				break;
			}
		}
		return isS;
	}
	
	// 0~9사이의 숫자를  반환한다.
	public static int inputNum(){
		Scanner scan = new Scanner(System.in);
		int inputNum = -1;
		System.out.println("0 ~ 9 사이의 숫자를 입력해주세요");
		while(true){
			try {
				
				inputNum = scan.nextInt();
				// 숫자만 입력이 되고 0~9사이의 숫자를 판별한 후
				if(!isNumberRange(inputNum)){
					// 0~9사이면
					break;
				}else{ // 범위를 벗어나면
					System.out.println("0 ~ 9 사이의 숫자만 입력가능합니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("잘못된 내용을 입력했습니다.");
				System.out.println("0 ~ 9 사이의 숫자만 입력가능합니다.");
				System.out.println("다시 입력해주세요.");
				
			}finally {
				scan.nextLine();
			}
			
		} // while 문 종료
		
		return inputNum;
		
	}
	
	// 숫자의 범위가 0~9 사이인지 알려줌
	private static boolean isNumberRange(int inputNum){
		boolean isS = false;
		
		if(inputNum > 9 || inputNum < 0){
			isS = true;
		}
		
		return isS; 
	}
	
}
