
public class CardCase {
	
	int numOfCards = Card.shapeArr.length * Card.numberArr.length;
	
	Card[] cardArr = new Card[numOfCards];
	
	CardCase() {
		int totalCnt = 0;	//52장의 카드를 위한 배열 인덱스
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt] = new Card(i, n);	//각자 고유의 주소를 갖는다. 1차 배열
				totalCnt++;
			}
		}	//전체 for문 종료
	}
	
	//지정된 위치의 카드를 뽑는다
	Card pick(int index) {
		return cardArr[index];
	}

	//카드 섞기
	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int rand = 0;
			
			rand = (int)(Math.random() * numOfCards);
			
			Card tempCard = null;
			
			tempCard = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = tempCard;
			
		}	//for 종료
	}
	
	void cardCaseView() {
		int totalCnt = 0;

		for (int i = 0; i < cardArr.length; i++) {
			System.out.print(cardArr[i].card + "\t");
			if((i+1)%13 == 0) {
				System.out.println();
			}
			
		}
		
//		for (int i = 0; i < Card.shapeArr.length; i++) {
//			for (int n = 0; n < Card.numberArr.length; n++) {
//				cardArr[totalCnt] = new Card(i, n);	//각자 고유의 주소를 갖는다. 1차 배열
//				totalCnt++;
//				System.out.print(cardArr[n].card);
//			}
//			System.out.println();
//		}	//전체 for문 종료
	}

//카드 케이스의 카드 52장 보기(증명)
//	순서는 뒤바뀌든지 말든지 문양 별로 4줄 안에 뽑아내라




}
