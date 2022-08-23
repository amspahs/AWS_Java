
public class ShopPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer ogw = new Buyer();
		Tv tv = new Tv();
		Com com = new Com();
		Audio audio = new Audio();
		BookJava bJava = new BookJava();
		BookCartoon bCa = new BookCartoon();
		Buyer abk = new Buyer();
		
		ogw.money = 100;
		abk.money = 100;
		
		ogw.buy(bJava);
		abk.buy(bCa);
		
		System.out.println("내 남은돈 : "+ogw.money);
		System.out.println(" side :" + abk.money);
		
	}

}
