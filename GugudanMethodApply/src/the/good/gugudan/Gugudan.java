package the.good.gugudan;

public class Gugudan {

	public String gugudanResultStr = "";
	
	
	public void setGugudan(int putNum){
		String spaceStr = "";
		
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k <= i; k++) {
				spaceStr = spaceStr + " ";
			}
			
//			System.out.println(putNum + spaceStr + "*" + spaceStr + (i+1) +  spaceStr + "=" + spaceStr + (putNum * (i+1)));
			gugudanResultStr = gugudanResultStr + putNum + spaceStr + "*" + spaceStr + (i+1) 
					+  spaceStr + "=" + spaceStr + (putNum * (i+1)) + "\n";
			
			spaceStr = "";
		}
		
//		return gugudanResultStr;
	}
	
	public String getGugudan(){
		return gugudanResultStr;
	}
	
	
}
