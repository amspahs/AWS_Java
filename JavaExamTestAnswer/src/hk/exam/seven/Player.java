package hk.exam.seven;

import java.util.List;

public class Player {

	private String name = ""; // 이름
	private int age = 0;		// 나이
	private int score = 0;		// 2개의 카드를 더한 점수
	private boolean winner = false; // 승자가 누구인지 기록 (true 승자, false 패자)
	private Card[] myChoiceCards = null; // 내가 선택한 2장의 카드
	private CardCase cardCase = null;  // 나는 무조건 카드덱(52장의 카드)을 가지고 있다.

	// 생성자 (멤버변수 초기화)
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.cardCase = new CardCase();
		this.myChoiceCards = new Card[2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Card[] getMyChoiceCards() {
		return myChoiceCards;
	}

	public void setMyChoiceCards(Card[] myChoiceCards) {
		this.myChoiceCards = myChoiceCards;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	
	// 게임에 이용할 카드를 뽑는다
	public Card[] drawCard() {
		
		// 내가 가진 전체 카드
		List<Card> cardList = cardCase.getCardList();
		
		int tempIndex = cardList.size() - 1;
		// 카드 2장을 뽑는다 
		// 그리고 뽑은 카드는 다시는 사용하지 못한다. -> 카드덱에 존재하지 않는다
		for (int i = 0; i < myChoiceCards.length; i++) {
			myChoiceCards[i] = cardList.get(tempIndex);
			cardList.remove(tempIndex);
			tempIndex--;
		}

		return myChoiceCards;
	}

	// 카드 섞기
	public void shuffle() {
		List<Card> cardList = cardCase.getCardList();

		if (cardList.size() != 52) {
			cardCase.init();
		}

		for (int i = 0; i < cardList.size(); i++) {
			int rand = (int) (Math.random() * cardList.size());

			Card temp = cardList.get(i);
			cardList.set(i, cardList.get(rand));
			cardList.set(rand, temp);
		}
	}

}
