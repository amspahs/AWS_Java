package three;

import java.util.HashMap;

public class MapBasic {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> doorMap = new HashMap<String, Integer>();
		//호텔이 해시맵, 001호실(키)의 비밀번호(값)는 1234
		doorMap.put("001", 1234);	//풋은 애드같은 개념. 
		doorMap.put("101", 1111);
		doorMap.put("102", 2222);
		
		System.out.println(doorMap.get("001"));
		System.out.println(doorMap.get("102"));
		System.out.println(doorMap.get("101"));
		System.out.println(doorMap.size());
		
		doorMap.put("102", 22222);
		
		System.out.println(doorMap.get("001"));
		System.out.println(doorMap.get("102"));	//102호는 하나야. 풋하면 비밀번호만 덮어씌워짐. 키는 하나임.
		System.out.println(doorMap.get("101"));	//102호랑 103호는 비밀번호가 같을 수도 있다. 값은 같아도 됨.
		System.out.println(doorMap.size());
		
	}
}
/*
	키(key): 컬렉션 내의 키 중에서 유일해야 한다.
	값(value): 키와 달리 데이터의 중복을 허용한다.
	
	많은 양의 데이터를 검색하는데 있어서 뛰어난 성능을 보인다.

*/