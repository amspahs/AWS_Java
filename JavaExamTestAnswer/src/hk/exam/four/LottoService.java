package hk.exam.four;

import java.util.ArrayList;

public class LottoService {
	// 45개의 정수값을 저장하기 위한 배열 생성.
	private int[] balls = new int[45];
	private int[] luckyBall = new int[6];
	
	private ArrayList<Integer> ballList = new ArrayList<>();
	private ArrayList<Integer> luckyBallList = new ArrayList<>();
	
	public LottoService(){
		
	}
	
	// 1~45까지의 공 준비
	public void setLottoNumber() {

		// 배열의 각 요소에 1~45의 값을 저장한다.
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1; // balls[0]에 1이 저장된다.
		}

	}
	
	// 45개의 로또 번호 중 중복되지 않는 나만의 숫자 6개를 선택
	public void setAutoLottoNumber(){
		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수

		// 배열에 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 지정한다.
		// 배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		for (int i = 0; i < 100; i++) {
			j = (int) (Math.random() * 45); // 배열 범위(0~44)의 임의의 값을 얻는다.

			temp = balls[0];
			balls[0] = balls[j];
			balls[j] = temp;
		}
		
		for(int i=0; i < luckyBall.length; i++){
			luckyBall[i] = balls[i];
		}
	}


	/**
	 * 
	 * @param sequence
	 *            true이면 오름차순, false이면 내림차순 정렬
	 * 
	 *            <pre>
	 * 로또 번호 정렬
	 *            </pre>
	 */
	// 좋은 코드는 아니지만 시험 문제에 매개변수를 쓰기 위해 만들어 봄
	public void sortLottoNumber(boolean sequence) {
		int temp = 0;
		boolean changeCheck; // 정렬이 일어나면 true, 안일어나면 false
		int cnt = 0; // 정렬 횟수

		if (sequence) { // 오름차순 정렬
			System.out.println("오름차순");
			for (int i = 0; i < (luckyBall.length - 1); i++) {
				changeCheck = false; // 자리바꿈이 발생했는지 체크
				for (int j = 0; j < (luckyBall.length - 1 - i); j++) {
					if (luckyBall[j] > luckyBall[j + 1]) {
						temp = luckyBall[j];
						luckyBall[j] = luckyBall[j + 1];
						luckyBall[j + 1] = temp;
						
						changeCheck = true;
					
						cnt++;
//						System.out.print(cnt + "회차\t");
//						printLottoNumber(luckyBall);
					}
				}

				if (!changeCheck) {
					break; // 자리바꿈이 없다면 종료
				}
			}
		} else { // 내림차순 정렬
			System.out.println("내림차순");
			for (int i = 0; i < (luckyBall.length - 1); i++) {
				changeCheck = false; // 자리바꿈이 발생했는지 체크
				for (int j = 0; j < (luckyBall.length - 1 - i); j++) {
					if (luckyBall[j] < luckyBall[j + 1]) {
						temp = luckyBall[j + 1];
						luckyBall[j + 1] = luckyBall[j];
						luckyBall[j] = temp;
						
						changeCheck = true;
					
						cnt++;
//						System.out.print(cnt + "회차\t");
//						printLottoNumber(luckyBall);
					}
				}
				
				if (!changeCheck) {
					break;
				}
			}
		}
	}

	// 6개의 공의 숫자를 출력
	public void printLottoNumber() {
		// 배열 balls의 앞에서 부터 6개의 요소를 출력한다.
		for (int i = 0; i < 6; i++) {
			System.out.print(luckyBall[i] + " ");
		}
		System.out.println();
	}
	
	// 공 6개의 숫자가 정렬되는 과정을 출력
//	public void printLottoNumber(int[] balls) {
//		// 배열 balls의 앞에서 부터 6개의 요소를 출력한다.
//		for (int i = 0; i < 6; i++) {
//			System.out.print(balls[i] + " ");
//		}
//		System.out.println();
//	}

}
