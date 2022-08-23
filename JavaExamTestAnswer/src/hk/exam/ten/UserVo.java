package hk.exam.ten;

public class UserVo {
	private String name = "";
	// 게임 유저의 대답
	private int userAnswer = 0;
	// 병뚜껑의 숫자를 맞춘 사람이 진다. 진 사람은 true 
	private boolean passCheck = false;
	

	public UserVo(String name) {
		super();
		this.name = name;
	}


	public UserVo() {
		super();
	}

	
	public int getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(int userAnswer) {
		this.userAnswer = userAnswer;
	}

	public boolean isPassCheck() {
		return passCheck;
	}

	public void setPassCheck(boolean passCheck) {
		this.passCheck = passCheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		if(passCheck){
			return "병뚜껑 숫자를 맞추신 분은 [name=" + name + "님 입니다. , userAnswer=" + userAnswer + ", passCheck=" + passCheck + "] 벌칙 받으러 ㄱㄱ ^^";
		}else{
			return "[name=" + name + "님은 생존하셨습니다. , passCheck=" + passCheck + "] 축하합니다~~";
		}
		
	}
}
	
