package three.test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap();
		
		map.put("myId", "1234");
		map.put("kjs", "kjs00");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID와 password를 입력해주세요.");
		System.out.println("id: ");
		
		String id = "";
		id = scan.nextLine().trim();	//공백 제거용 트림. 사용자가 실수로 공백 써도 잘라줌.
		System.out.println("password: ");
		
		String password = "";
		password = scan.nextLine().trim();
		System.out.println();
		
		boolean keyCheck = false;	//상태변화 체크는 불린으로 구현
		boolean passwordCheck = false;	//맞니, 아니니 구분하기 위해 이 두개 작성
		
		keyCheck = map.containsKey(id);
		if(keyCheck == false) {	//특별한 경우가 없는 한 된다와 안 된다 중 안 된다 먼저 표현
			System.out.println("입력하신 ID는 존재하지 않습니다.");
		}else {
			passwordCheck = password.equals(map.get(id));
			if(passwordCheck == false) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("ID와 비밀번호가 일치합니다.");
			}
		}//첫 if의 else 종료
		
	}//main 종료
}//클래스 종료
