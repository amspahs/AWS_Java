package three;

public class Point {

	int x = 0;
	int y = 0;

	String getLocation() {	//오버라이딩
		String str = "";
				
				str = "x : " + x +  ", y: " + y;
		
		return str;
	}
	
}


	