
public class StringEx3 {

	public static void main(String[] args) {
		
//		빈 문자열(empty string)
		
		String str = "";
		
		String str2 = null;	//이리 만들면 힙에 저장되지 않음. 널로 초기화하지 마셈. 아무것도 없는 걸로 접근하면 막음.
		
		String str3 = new String();
		
		String str4;	//노란 줄: 사용하지 않았는데 지워도 되지 않니? 남을 위해서라도 초기화는 해라.
		
		
		System.out.println(str == str2);
		System.out.println(str == str3);
//		System.out.println(str == str4);	//지역변수는 초기화하지 않으면 오류가 남. 값이 없으면 쓰지 마라.
		
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));	//기본으로 뉴해서 아무것도 안적으면 기본값
//		System.out.println(str.equals(str4));

	}
}
