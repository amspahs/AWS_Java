package two;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
//		<Integer>	제너릭, 지네릭스(Generics)	밑에 계속.
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		
//		arrayList.add(1);	//기본값이 아니라 객체형만 존재하는데 기본값을 넣을 수 있었던 이유는 제너릭 덕분임.<>
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
//		arrayList.add(5);
//		
//		Iterator it = arrayList.iterator();	//안쓸건데 개념만 가져가자. 이터레이터 패턴은 있어. 게러세러처럼.
//								//자루에 구슬 빼기 이야기. 로또처럼 뽑기가 됨.
//		while (it.hasNext()) {	//안에 데이터가 있으면 트루, 없으면 펄스. 해즈 넥스트는 손을 집어넣어 꺼낸 느낌이다. 이거 쓰면 개수 줄음
//			int num = (Integer) it.next();		//와일은 총 개수 몰라도 다 뽑아낸다.
//			
//			System.out.println(num);
//			
//		}
//		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(2));
//		System.out.println(arrayList.get(3));
//		System.out.println(arrayList.get(4));
////////////////////////////////////////////////////////////////////////////////////////////
//		ArrayList tvList = new ArrayList();	//배열. 뭔가 담는 것. 클래스는 다 넣을 수 있다.
//		
//		tvList.get(0).channerUp();	//오브젝트에는 채널업이 없어서 에러.
//		
//		Tv tv = new Tv();
//		
//		tvList.add(tv);	//부모(오브젝트)에 담긴다.
//		
//		Tv tempTv = (Tv)tvList.get(0);	//겟을 통해 담은 것은 오브젝트의 것이다.
//		
//		System.out.println(tempTv.channel);
//		tempTv.channelUp();
////////////////////////////////////////////////////////////////////////////////////////////	
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//1.6까진 뒤에도 <Tv> 명시해야 했는데 1.8에서는 앞에만 넣어도 예측 가능해서 앞에만 써도 됨.

		Tv tv = new Tv();
											
		tvList.add(tv);
		
		System.out.println(tvList.get(0).channel);
		tvList.get(0).channelUp();	//원래 이거 안되는데 <>로 하면 됨.
		
		
	}
}
/*
	<Integer>	제너릭, 지네릭스(Generics)

	컬렉션 클래스에 컴파일 시 타입 체크를 해주는 기능이다.
	객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안정성을 높이고, 형변환의 번거로움이 줄어든다.
	
	제너릭 장점
	-타입 안정성을 제공
	-타입 체크와 형변환을 생략할 수 있어서 코드가 간결해진다.
	
*/	