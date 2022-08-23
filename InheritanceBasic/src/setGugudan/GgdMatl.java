package setGugudan;

public class GgdMatl {
	
	int[] putNum = new int[9];

	GgdMatl(){
	}
	
	void setGugudan() {
		String spaceStr = "";
		
		for (int i = 0; i < putNum.length; i++) {
			putNum[i] = i + 1;
			System.out.println(2 + spaceStr + " * " + spaceStr + putNum[i] 
								+ spaceStr + " = " + spaceStr + (2 * putNum[i]));
			
			spaceStr = spaceStr + " ";
		}
	}
	
	String getGugudan() {
		String resultStr = "";
		
		setGugudan();
		
		return resultStr; 
	}	
}

