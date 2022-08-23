package hk.exam.nine;
public class HitterPlayer extends Human{
	
	private boolean isWinner = false;
	
	public HitterPlayer() {
		super();
	}

	public HitterPlayer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	@Override
	public String toString() {
		return "[이름: " + name + "]";
	}

}
