package hk.exam.three;

public class RectangleService {
	
	// 정사각형을 출력한다
	public void printRectangle(int line){
		
		for(int i=0; i< line; i++){
			// 직각삼각형
			for(int k=0;  k<=i; k++){
				System.out.print("*");
			}
			// 역직각삼각형
			for(int n=0; n < (line-i-1); n++){
				System.out.print("?");
			}
			// 라인
			System.out.println();
		}
		
	}
	
}