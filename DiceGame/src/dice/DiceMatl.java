package dice;

import java.util.Scanner;

public class DiceMatl {

	public static final int BLACKJACK = 21;

	Scanner sc = new Scanner(System.in);

	int uNum = 0;
	int cNum = 0;
	int uCount = 0;
	int cCount = 0;
	int cdiceNum = 0;
	int userdiceNum = 0;
	int rollCount = 0;
	String userBreak = "";
	public int countGame = 0;

	DiceMatl() {
	}

	void breakDice() {
		userBreak = sc.next();
		if (userBreak.equals("Yes")) {
			System.out.println("게임종료");
		}
	}

	void start() {
		System.out.println("유저 vs 컴퓨터 먼저 도착하기 게임");
		System.out.println("S를 입력해주세요");
		String input = "";
		input = sc.nextLine();
		if (input.equals("S")) {
			this.dice();
			this.Conti();
		}else {
			System.out.println("게임을 종료합니다.");
			return;
		}
	}

	public void diceRoll() {

		rollCount++;
		System.out.println(rollCount + "<-- 주사위 굴린 횟수");
		for (int i = rollCount; i <= rollCount; i++) {
			if (rollCount % 2 == 0) {
				cDiceRoll();
				cCount = cCount + 1;
			} else {
				uDiceRoll();
				uCount = cCount + 1;
			}
		}
	}

	public void uDiceRoll() {
		userdiceNum = 0;
		userdiceNum = (int) ((Math.random() * 6) + 1);
		uNum = uNum + userdiceNum;
	}

	public void cDiceRoll() {
		cdiceNum = 0;
		cdiceNum = (int) ((Math.random() * 6) + 1);
		cNum = cNum + cdiceNum;
	}

	int countGame() {
		this.countGame = countGame + 1;
		return countGame;
	}

	public void initialized() {
		this.uNum = 0;
		this.cNum = 0;
		this.uCount = 0;
		this.cCount = 0;
		this.cdiceNum = 0;
		this.userdiceNum = 0;
		this.rollCount = 0;
	}

	public void Conti() {
		System.out.println("계속하실거면 C를 입력해주세요.");
		String input = "";
		input = sc.nextLine();
		if (input.equals("C")) {
			this.dice();
			this.Conti();
		} else {
			System.out.println("게임을 종료합니다.");
		}
	}

	public void dice() {
		do {
			this.diceRoll();
			System.out.print("유저 주사위 횟수: " + this.uCount + " ");
			System.out.println("유저 주사위합: " + this.uNum);
			System.out.print("컴퓨터 주사위 횟수: " + this.cCount + " ");
			System.out.println("컴퓨터 주사위합: " + this.cNum);

		} while (this.uNum < BLACKJACK && this.cNum < BLACKJACK);
		System.out.println("게임종료");
		System.out.println(this.countGame() + "회차 게임 종료");
		this.initialized();
	}

}
