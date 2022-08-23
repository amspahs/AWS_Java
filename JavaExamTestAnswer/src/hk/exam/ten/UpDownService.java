package hk.exam.ten;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UpDownService {

	private int minRange = 0; // 사용자가 입력가능한 최소값
	private int maxRange = 0; // 사용자가 입력가능한 최대값
	private int answer = 0; 	// 병뚜껑 숫자값(1~1000)을 얻어서 answer에 저장한다.
	private static final int RANGE_SIZE = 100; // 이 게임은 무조건 랜덤의 값에서 100단위로 가진다.

	public int playerJoinNumber = 0; // Up&Down 게임 참가 인원
	
	// ex) 56은 1 부터 100, 566은 500에서 600까지
	private int count = 0; // 시도횟수를 세기위한 변수
	private int tempNum = 0; // 사용자입력을 저장할 임시변수
	private ArrayList<UserVo> userList = new ArrayList<>(); // 사용자들의 정보
	
	// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
	java.util.Scanner s = new java.util.Scanner(System.in);

	
	/**
	 * 병뚜껑 게임 참여 인원 설정
	 * 
	 */
	public void setPlayerInfo(){
		int num = 0; // num 참여선수 인원
		String name = ""; // 게임 참가자 이름
		System.out.println("병뚜껑 맞추기 게임에 몇 명이 참가하시겠습니까? 2 ~ 11명 참여 가능");
		
		while(true){
			try {
				num = s.nextInt();
				
				if(num < 2 || num > 11){
					System.out.println("2 ~ 11 사이의 숫자만 입력가능합니다.");
					System.out.println("다시 입력해주세요.");
					continue;
				}
				// 정확한 숫자가 들어왔다면 반복문 종료
				break;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("잘못된 내용을 입력했습니다.");
				System.out.println("2 ~ 11 사이의 숫자만 입력가능합니다.");
				System.out.println("다시 입력해주세요.");
			}finally {
				s.nextLine();
			}
			
		} // while문 종료
		
		for (int i = 0; i < num; i++) {
			System.out.println(i + "번째 참가자의 이름을 입력해주세요");
			name = s.nextLine();
			UserVo userVo = new UserVo(name);
			userList.add(userVo);
		}
		playerJoinNumber = num; // 게임 참가자 수 설정
		
	}
	
	// 게임 참가자 명단
	public void printPlayerResultInfo(){
		for (UserVo userVo : userList) {
			System.out.println(userVo);
		}
	}
	
	// 제일 먼저 설정해야함
	// 병뚜껑 숫자 설정
	public void setUpDownAnswerNumber() {
		
		System.out.println("병뚜껑의 숫자를 확인했습니다.");
		// 병뚜껑은 1~1000사이의 값만 존재
		answer = (int) (Math.random() * 1000) + 1;
				
	}
	
	// 병뚜껑 숫자 설정(setUpDownAnswerNumber()) 후 범위 지정 
	public void setUpDownRangeNumber(){
		int temp = 0;
		temp = answer/100;
		
		if(answer%1000 < 100){
			minRange = ++temp;
			maxRange = temp * RANGE_SIZE;
		}else{
			minRange = temp*RANGE_SIZE;
			maxRange = (temp+1) * RANGE_SIZE;
		}
		System.out.println("상대방이 숫자의 범위를 설정했습니다.");
	}

	// 게임 시작
	public void playUpDownGame() {
		boolean bigSmallCheck = false; // 사용자의 입력값이 너무 크면 true, 작으면 false
		int playerNum = 0;
		System.out.println("게임을 시작합니다.");
		do {
			count++;
			UserVo userVo = userList.get(playerNum);
			userInputNumberCheck(userVo);
						
			userVo.setUserAnswer(tempNum);
			System.out.println(userVo.getName() + "님");
			
			if (answer > userVo.getUserAnswer()) {
				System.out.println("틀렸습니다. 다음 분은 더 큰 수를 입력하세요.");
				bigSmallCheck = true;
			} else if (answer < userVo.getUserAnswer()) {
				System.out.println("틀렸습니다. 다음 분은 작은 수를 입력하세요.");
				bigSmallCheck = false;
			} else {
				System.out.println("병뚜껑 번호" + answer + " 맞췄습니다.");
				System.out.println("총 시도횟수는 " + count + "번입니다.");
				userVo.setPassCheck(true);
				break; // do-while문을 벗어난다
			}
			resetRangeNumber(bigSmallCheck, userVo); // 숫자 범위 재설정
			playerNum++; // 다음 사람선택
			
			if(playerNum == playerJoinNumber){ // 마지막 참가자 수행 후 다시 첫 참가자 차례
				playerNum = 0;
			}
			
		} while (true); // 무한반복문
	}
	
	// 참가자의 잘못된 답변 체크 및 수정
	private void userInputNumberCheck(UserVo userVo){
		while(true){
			System.out.println(userVo.getName() + "님");
			System.out.println(minRange + "과 " + maxRange + "사이의 값을 입력하세요 :");
			try {
				tempNum = s.nextInt(); // 입력받은 값을 변수 userAnswer에 저장한다.
				if(tempNum < minRange){
					System.out.println(minRange + "값 보다 작은 값을 넣을 수 없습니다.");
				}else if(tempNum > maxRange){
					System.out.println(maxRange + "값 보다 큰 값을 넣을 수 없습니다.");
				}else{
					break;
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("잘못입력하셨습니다. 숫자만 입력가능합니다. 다시 시도해주십시요");
				s.nextLine();
			} 
		}
		
	}
	
	// 게임 중 사용자가 사용가능한 숫자범위 설정
	private void resetRangeNumber(boolean bigSmallCheck, UserVo userVo){
		if(bigSmallCheck){
			minRange = userVo.getUserAnswer()+1;
		}else{
			maxRange = userVo.getUserAnswer()-1;
		}
	}

		
}
