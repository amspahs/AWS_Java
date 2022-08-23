package five;

public class Point {

	int x = 1000;	//부모 메인에서 나오게 못함.
	int y = 2000;

	Point(){	//()에 값 쓰면 3D에서도 슈퍼() 안에 타입 맞는 값 넣어야 함.
		System.out.println("point 생성자로 왔음");
		x = 10;
		y = 20;
		
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {	//오버라이딩
		String str = "";
				
				str = "x : " + x +  ", y: " + y;
		
		return str;
	}
	
}


	