import java.util.Random;

public class RandomBasic {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

//      난수 생성
      
      int rand = 0;
      int randomNum = 0;
      
      Random random = new Random();	//이렇게 쓰면 회사 망한다
      
      System.out.println("(int)(Math.random() * 100)의 결과");
      for (int i = 0; i < 10; i++) {
         if(i % 10 == 0) {
            System.out.println();
         }
         rand = (int)(Math.random() * 10);
         
         System.out.print(rand + " ");
      }
      
      System.out.println();
      System.out.println();
      System.out.println("random.nextInt(100)의 결과");
      
      for (int i = 0; i < 10; i++) {
         if(i % 10 == 0) {
            System.out.println();
         }
         randomNum = random.nextInt(10);	//nextDouble, nextLong 다 된다. 그리고 위에 했던 뺑이를 안 쳐도 99까지 다 뽑아낸다
         
         System.out.print(randomNum + " ");
      }
      
      
   }

}