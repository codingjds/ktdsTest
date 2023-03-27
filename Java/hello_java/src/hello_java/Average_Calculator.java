package hello_java;
/**
 * 과목의 평균을 구하기
 * @author User
 *
 */
public class Average_Calculator {
	public static void main(String[] args) {
		/*
		 * 수학,물리,영어,프로그래밍 4가지 과목의 평균을 구하기
		 */
		int math=80;
		int physics=95;
		int english=78;
		int programing=96;
		int sum= math+physics+english+programing;
		double avg=(double)(sum)/4; //87.5
		//double avg=(double)((sum)/4);==>(double)(정수/정수)=87.0
		System.out.println("평균점수 : "+ avg);
	}
}
