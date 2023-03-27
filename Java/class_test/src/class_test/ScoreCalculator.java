package class_test;

public class ScoreCalculator {
	/*
	 * 멤버변수, 인스턴스필드
	 */
	int math = 80;
	int physics = 95;
	int english = 78;
	int programing = 96;
	
	/**
	 * 4과목의 평균을 구하기
	 */
	public void getAverage() {
		
		/*int math = 80;
		int physics = 95;
		int english = 78;
		int programing = 96;
		*/
		int sum = math + physics + english + programing;
		
		double avg = (double) (sum) / 4; // 87.5
		// double avg=(double)((sum)/4);==>(double)(정수/정수)=87.0
		System.out.println("평균점수 : " + avg);
	}
	
	/**
	 * 성적 등급을 계산한다.
	 */
	public void getGrade() {
		int sum = math + physics + english + programing;
		double avg = (double) (sum) / 4; // 87.5
		
		String grade="";
		if(avg>=90) {
			grade="A";
		}
		else if(avg>=80) {
			grade="B";
		}
		else if(avg>=70) {
			grade="C";
		}
		else if(avg>=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		System.out.println("등급은? "+ grade);
	}
	public void getAvergaeGrade(int x) {
		int sum = math + physics + english + programing;
		double avg = (double) (sum) / 4; // 87.5
		String grade="";
		if(x>=90) {
			grade="A";
		}
		else if(x>=80) {
			grade="B";
		}
		else if(x>=70) {
			grade="C";
		}
		else if(x>=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		System.out.println("등급은? "+ grade);
	}
}
