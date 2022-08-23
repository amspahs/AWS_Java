
public class ShuffleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = new int[5];
	
		numArr[0] = 10;
		numArr[1] = 54;
		numArr[2] = 3; 
		numArr[3] = 9; 
		numArr[4] = 80;
		
		int pos = 0;
		int tempNum = 0;

		for (int i = 0; i < 10; i++) {	//10번 반복 섞기
			pos = (int)(Math.random() * 5);	//0~4(총 5개, *5의 이유) 중 무작위 숫자 뽑아
			tempNum = numArr[0];	//위에서 뽑은 숫자의 번호를 가진 방에 넣을 거임. 근데 그냥 넣으면 맞바꾸질 못하고 복사됨. 휴지통에 잠시 보관 temp = 10;, 0번방은 10
			numArr[0] = numArr[pos];	//0번방은 무작위 숫자 방의 숫자로 변함.
			numArr[pos] = tempNum;	// 휴지통에 있는 10 가져와서 난수방에 넣어
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");	//출력과 칸 띄우기를 위함
	
	} // main 끝

	}
}
