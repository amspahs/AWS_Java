
public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = new int[10]; //10개의 공간을 가진 배열 생성
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;	//0~9까지 배열에 순서대로 넣음
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println();
		
		int pos = 0;	// 인덱스의 위치로 앞으로 포스 사용할 것임.
		int tempNum = 0;	//임시값, 밑 포문에 필요함. 치환용
		for (int i = 0; i < 100; i++) {
			// 0~9 중 한 값을 임의로 얻는다
			pos = (int)(Math.random() * 10);	//임의의 값으로 쓴다. 여기서 섞는다.
			
			tempNum = numArr[0];	//위에서 만든 난수 바꿔넣기
			numArr[0] = numArr[pos];	//굴러들어온 돌이 박힌 돌 뺐는데 박힌 애가 배열 밖으로 나가지 않게 배치
			numArr[pos] = tempNum;	//이번엔 두번째 쫓겨난 돌이 임시변수로 빠짐
		}
	
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
	
	
	} // main 끝

}
