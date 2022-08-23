
public class SecondArrayExam1 {
	public static void main(String[] args) {
		
//		2차원 배열에 강사가 제시한 값들을 순차적으로 담으시오.
		
//		2	4	6	8	10
//		3	6	9	12	15
//		4	8	12	16	20
//		5	10	15	20	25
		
		int numArr[][] = new int[4][5];	//[y][x]
		
		for (int i = 0; i < numArr.length; i++) {	//[y]
			for (int n = 0; n < numArr[0].length; n++) {	//[x]
				numArr[i][n] = (i + 2) * (n + 1);	//내용 간파 안되면 일단 따로 다 적어. 그 뒤엔 2씩 더하는 덩어리로 나눠. 그 다음에 보일 것임.
				System.out.print(numArr[i][n] + "\t");
			}
		System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
	}
}
