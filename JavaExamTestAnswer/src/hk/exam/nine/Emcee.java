package hk.exam.nine;
import java.util.ArrayList;
import java.util.List;

// 진행자
public class Emcee extends Human{

	// 첫번째 참가자 번호 -> 두번째 참가자가 맞춰야 함
	private List<Integer> firstAnswerNumberList = new ArrayList<>();
	// 두번째 참가자 번호 -> 첫번째 참가자가 맞춰야 함
	private List<Integer> secondAnswerNumberList = new ArrayList<>();
		
	Emcee() {
		super();
	}

	public List<Integer> getFirstAnswerNumberList() {
		return firstAnswerNumberList;
	}


	public void setFirstAnswerNumberList(List<Integer> firstAnswerNumberList) {
		this.firstAnswerNumberList = firstAnswerNumberList;
	}


	public List<Integer> getSecondAnswerNumberList() {
		return secondAnswerNumberList;
	}

	public void setSecondAnswerNumberList(List<Integer> secondAnswerNumberList) {
		this.secondAnswerNumberList = secondAnswerNumberList;
	}
	
	
}
