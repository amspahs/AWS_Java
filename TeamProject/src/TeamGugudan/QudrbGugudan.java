package TeamGugudan;

public class QudrbGugudan {
	int i=0;
	QudrbGugudan(){
		
	}
	
	void qudrbGugudan(int x){
		if(x>=2 && x<=9) {
			for(int i=1; i<=9; i++) {
				System.out.print(x + " * " + i + " = " + x*i + "\t");
			}
		}
	}
	
}
	
