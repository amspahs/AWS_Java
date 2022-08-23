
public class CardCaseTest {

	public static void main(String[] args) {
		
		CardCase cardCase = new CardCase();	//이미 52장 만들어짐
		Card card = null;	//순차적으로 뽑기 위해 적음
		
		card = cardCase.pick(42);		
		System.out.println(card.getCard());
//		System.out.println(cardCase());
		
		cardCase.cardCaseView();
		
		cardCase.shuffle();
		
		card = cardCase.pick(42);		
		System.out.println(card.getCard());
		
		
	}	
}
