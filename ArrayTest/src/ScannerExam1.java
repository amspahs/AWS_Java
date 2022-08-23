import java.util.Scanner;

public class ScannerExam1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

//      국어, 영어, 수학을 입력받는다

      Scanner scan = new Scanner(System.in);
      
      int sum = 0;							//총합 변수
      double avg = 0.0;						//평균 변수
      
      int[] numArr = new int[3];
      
      System.out.println("국어를 입력해주세요");
      numArr[0] = scan.nextInt();			//이거라고 치자: 화면단
      
      System.out.println("영어를 입력해주세요");
      numArr[1] = scan.nextInt();
      
      System.out.println("수학을 입력해주세요");
      numArr[2] = scan.nextInt();
      
//    for (int i = 0; i < 3; i++) {
//         System.out.print(numArr[i] + "\t");
//    }

      for (int i = 0; i < 3; i++) {
    	  sum = sum + numArr[i];
      }
      
//    avg = (int)((sum / 3.0 + 0.005) * 100) / 100.0;			<-별로래
      
      avg = sum / 3.0;			//묵시적 형변환을 위함, 	48.66666,,,
      avg = avg + 0.005;		//소수점 자리 올림,		48.67166,,,	
      avg = avg * 100;							//	4867.166,,,
      avg = (int)avg;							//	4867
      avg = avg / 100.0;						//	48.67
      
      System.out.println("총합: " + sum);
      System.out.println("평균: " + avg);
   
   }

}