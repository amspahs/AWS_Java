package two;

public class CardTest {
	
	public static void main(String[] args) {
		
		System.out.println("카드 width " + Card.width);
		System.out.println("카드 height " + Card.height);
	
		Card card = new Card();
		card.kind = "Heart";
		card.num = 7;
		
		Card secondCard = new Card();
		secondCard.kind = "Spade";
		secondCard.num = 4;
		
		System.out.println("card는 " + card.kind + ", " + card.num 
							+ "이며, 크기는 " + Card.width + ", " + Card.height);
		
		System.out.println("card는 " + secondCard.kind + ", " + secondCard.num 
							+ "이며, 크기는 " + secondCard.width + ", " + secondCard.height);
	
		System.out.println("card의 width와 height를 각각 50, 80" + "으로 변경합니다.");
		
		Card.width = 50;
		Card.height = 80;
		
		
		
		
		
	}
}
