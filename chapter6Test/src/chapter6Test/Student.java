package chapter6Test;

public class Student {
		
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int total = 0;
	double average = 0.0;

	Student() {		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}

	int getTotal() {
		int total = 0;
		total = kor + eng + math;
		return total;
	}

	double getAverage() {
		double average = 0.0;
		average = (int)(((getTotal()/3.0)+0.005)*100)/100.0;	//마지막 나누기에 점찍는 것이 중요함
		return average;
	}
// 결합도는 낮춰야 하고 응집도는 높여야 한다.
	void exe() {
		System.out.println("이름: " + name + " / " + "반: " + ban
							+ " / " + "번호: " + no);
		System.out.println("국어: " + kor + " / " + "영어: " + eng
				+ " / " + "수학: " + math);
	}
	
	public static void main(String[] args) {
		
		Student student = new Student("홍길동", 2, 1, 100, 60, 76);
		
		int wholescore = 0;
		double wholeaverage = 0.0;
		
		wholescore = student.getTotal();
		wholeaverage = student.getAverage();
	
		student.exe();		
		
		System.out.println("총점: " + wholescore);
		System.out.println("평균: " + wholeaverage);
	}		
}
