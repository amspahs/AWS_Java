package hk.exam.nine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stadium implements GamePlay{

	// 1번째 참가자
	private HitterPlayer firstPlayer = null;
	// 2번째 참가자
	private HitterPlayer secondPlayer = null;

	// 진행자 한명
	private Emcee mc = new Emcee();

	// 진행자에게 첫번째 참가자 3개의 숫자 전달
	protected void firstPlayerGameSetting() {
		Scanner scan = new Scanner(System.in);
		String name = "";

		System.out.println("첫번째 게임 참가자의 이름을 입력해주세요");
		name = scan.nextLine();
		firstPlayer = new HitterPlayer(name);

		List<Integer> answerNumberList = new ArrayList<>();
		int inputNum = -1;

		System.out.println("상대방이 맞춰야 할 숫자를 3번 입력해주세요");
		// 3개의 숫자를 작성하면 벗어남
		while (answerNumberList.size() != 3) {
			inputNum = GameUtil.inputNum();

			// 같은 내용이 존재하지 않으면 진행자에게 전달한 숫자 작성
			if (!GameUtil.isSame(answerNumberList, inputNum)) {
				answerNumberList.add(inputNum);
			} else {
				System.out.println(inputNum + "숫자는 이미 존재합니다. 다른 값을 입력해주세요");
			}

		} // while 종료

		mc.setFirstAnswerNumberList(answerNumberList);

	}

	// 진행자에게 두번째 참가자 3개의 숫자 전달
	protected void secondPlayerGameSetting() {
		Scanner scan = new Scanner(System.in);
		String name = "";

		System.out.println("두번째 게임 참가자의 이름을 입력해주세요");
		name = scan.nextLine();
		secondPlayer = new HitterPlayer(name);

		List<Integer> answerNumberList = new ArrayList<>();
		int inputNum = -1;

		System.out.println("상대방이 맞춰야 할 숫자를 3번 입력해주세요");
		// 3개의 숫자를 작성하면 벗어남
		while (answerNumberList.size() != 3) {
			inputNum = GameUtil.inputNum();

			// 같은 내용이 존재하지 않으면 진행자에게 전달한 숫자 작성
			if (!GameUtil.isSame(answerNumberList, inputNum)) {
				answerNumberList.add(inputNum);
			} else {
				System.out.println(inputNum + "숫자는 이미 존재합니다. 다른 값을 입력해주세요");
			}

		} // while 종료

		mc.setSecondAnswerNumberList(answerNumberList);

	}

	public void gamePlay() {
		firstPlayerGameSetting();
		secondPlayerGameSetting();

		List<Integer> firstAnswerNumberList = new ArrayList<>();
		List<Integer> secondAnswerNumberList = new ArrayList<>();
		List<Integer> tempAnswerNumberList = new ArrayList<>();

		// 1번째 참가자의 정답지
		firstAnswerNumberList = mc.getFirstAnswerNumberList();
		// 2번째 참가자의 정답지
		secondAnswerNumberList = mc.getSecondAnswerNumberList();

		int inputNum = -1;
		int cnt = 1;
		while (true) {
			
			// 1번째 참가자 차례
			int numberPosition = 1;
			tempAnswerNumberList.clear();
			
			System.out.println(cnt + "회초 경기시작");
			while (tempAnswerNumberList.size() != 3) {
				System.out.print(firstPlayer + "님 " + (numberPosition) + "번 위치에 ");
				inputNum = GameUtil.inputNum();

				if (!GameUtil.isSame(tempAnswerNumberList, inputNum)) {
					tempAnswerNumberList.add(inputNum);
					numberPosition++;
				} else {
					System.out.println(inputNum + "숫자는 이미 존재합니다. 다른 값을 입력해주세요");
				}
			} // while문 종료
			int strikes = 0;
			strikes = resultStrikes(secondAnswerNumberList, tempAnswerNumberList);
			int balls = 0;
			balls = resultBalls(secondAnswerNumberList, tempAnswerNumberList);
			int out = 0;
			out = 3 - (strikes + balls);
			System.out.println("스트라이크: " + strikes + " 볼: " + balls + " 아웃: " + out);
			
			if(strikes == 3){
				firstPlayer.setWinner(true);
				
				System.out.println(firstPlayer + "님이 " + secondPlayer + "님의 숫자를 맞추셨습니다.");
				System.out.println("입력한 숫자: " );
				for (Integer n : tempAnswerNumberList) {
					System.out.print(n + "\t");
				}
				System.out.println();
				
				System.out.println("상대방이 제출한 숫자: " );
				for (Integer n : secondAnswerNumberList) {
					System.out.print(n + "\t");
				}
				System.out.println();
			}
			
			// 2번째 참가자 차례
			tempAnswerNumberList.clear();
			numberPosition = 1;

			System.out.println(cnt + "회말 경기시작");
			while (tempAnswerNumberList.size() != 3) {
				System.out.print(secondPlayer + "님 " + (numberPosition) + "번 위치에 ");
				inputNum = GameUtil.inputNum();

				if (!GameUtil.isSame(tempAnswerNumberList, inputNum)) {
					tempAnswerNumberList.add(inputNum);
					numberPosition++;
				} else {
					System.out.println(inputNum + "숫자는 이미 존재합니다. 다른 값을 입력해주세요");
				}
			} // while문 종료
			strikes = 0;
			strikes = resultStrikes(firstAnswerNumberList, tempAnswerNumberList);
			balls = 0;
			balls = resultBalls(firstAnswerNumberList, tempAnswerNumberList);
			out = 0;
			out = 3 - (strikes + balls);
			System.out.println("스트라이크: " + strikes + " 볼: " + balls + " 아웃: " + out);
			
			if(strikes == 3){
				secondPlayer.setWinner(true);
				
				System.out.println(secondPlayer + "님이 " + firstPlayer + "님의 숫자를 맞추셨습니다.");
				System.out.println("입력한 숫자: " );
				for (Integer n : tempAnswerNumberList) {
					System.out.print(n + "\t");
				}
				System.out.println();
				
				System.out.println("상대방이 제출한 숫자: " );
				for (Integer n : firstAnswerNumberList) {
					System.out.print(n + "\t");
				}
				System.out.println();
			}
			
			
			System.out.println(cnt + "회 경기종료");
			
			if(firstPlayer.isWinner() == true && secondPlayer.isWinner() == true){
				System.out.println("대단하시네요.");
				System.out.println("두분이 동시에 맞췄습니다. 다시 한번 더 자웅을 겨루는건 어떨까요?");
				
				System.exit(1); // 프로그램을 종료하는 코드이다
			}else if(firstPlayer.isWinner() == true && (secondPlayer.isWinner() == false)){
				System.out.println("축하합니다.");
				System.out.println(firstPlayer + "님이 이겼습니다.");
				System.exit(0);
			}else if(firstPlayer.isWinner() == false && (secondPlayer.isWinner() == true)){
				System.out.println("축하합니다.");
				System.out.println(secondPlayer + "님이 이겼습니다.");
				System.exit(1);
			}
			
			cnt++;
			
			if(cnt == 10){
				System.out.println("두분 실력이 형편없네요 9번을 진행해도 끝이 안났습니다. 억울하면 강해지세요");
				System.out.println("게임을 종료합니다.");				
				break; // 마찬가지로 while문을 벗어나며 게임을 종료한다
			}
		}

	}
	
	protected int resultStrikes(List<Integer> answerNumberList, List<Integer> tempAnswerNumberList) {
		int strike = 0;
		for (int i = 0; i < answerNumberList.size(); i++) {
			if (answerNumberList.get(i) == tempAnswerNumberList.get(i)) {
				strike++;
			}
		}
		
		return strike;
	}

	protected int resultBalls(List<Integer> answerNumberList, List<Integer> tempAnswerNumberList) {
		int ball = 0;
		for (int i = 0; i < answerNumberList.size(); i++) {
			for (int j = 0; j < tempAnswerNumberList.size(); j++) {
				if (answerNumberList.get(i) == tempAnswerNumberList.get(j) && i != j) {
					ball++;
				}
			}
		}
		
		return ball;
	}
	
	
	
}
