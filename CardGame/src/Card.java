//지금까지 배운 걸로만 카드 게임을 만들어본다.
public class Card {
//	♥	◆	♠	♣	
	static String[] shapeArr = {"♥","◆","♠","♣"};
	static String[] numberArr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	String card = "";
	
	Card(){
		init();
	}
	
	Card(int shapeIndex, int numberIndex){
		init(shapeIndex, numberIndex);
	}
	//임의의 카드를 생성
	void init() {
		int shapeIndex = 0;
		shapeIndex = (int)(Math.random() * shapeArr.length);
		
		int numberIndex = 0;
		numberIndex = (int)(Math.random() * numberArr.length);

		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	//작위적 카드 생성
	void init(int shapeIndex, int numberIndex){
		
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	String getCard() {
		return card;
	}
}

	
	
	