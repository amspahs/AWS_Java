package hk.exam;

import hk.exam.ten.UpDownService;

public class ExamMainTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10번 문제 병뚜껑 맞추기 게임 - 임의의 숫자를 참가자들이 순서를 가지고 부르다 걸리면 벌칙으로 술을 먹는 게임
		UpDownService ud = new UpDownService();

		// 플레이어 이름과 순서를 설정
		ud.setPlayerInfo();
		// 병뚜껑 숫자 설정
		ud.setUpDownAnswerNumber();
		// 병뚜껑 숫자 설정(setUpDownAnswerNumber()) 후 범위 지정
		ud.setUpDownRangeNumber();

		// 게임 시작
		ud.playUpDownGame();
		// 게임 결과
		ud.printPlayerResultInfo();
	}

}
