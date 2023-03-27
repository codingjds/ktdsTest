package hello_java;

/**
 * 섭씨를 화씨로 변경한다
 * 
 * @author User
 *
 */
public class CeltoFah {

	/**
	 * 섭씨를 화씨로 변경
	 */
	public static void toFah() {
		/*
		 * 섭씨를 화씨로 변경해 fah 변수에 할당후 출력
		 */
		int cel = 31;
		double fah = ((double) cel * 9 / 5) + 32;// (double)위치 중요!
		// double fah = (cel*1.8)+32;
		System.out.println("섭씨 " + cel + "도 " + " -> " + "화씨 " + fah);

	}
	public double f(int x) {
		int a=32;
		double b=1.8;
		double result = x*b+ a;
		
		return result;
	}
	
	/**
	 * 화씨를 섭씨로 변경
	 */
	public static void toCel() {
		double fah = 87.6;
		/*
		 * 화씨를 섭씨로 변경해 cel 변수에 할당후 출력
		 */
		int cel = (int) ((5 * (fah - 32)) / 9);
		// cel= (int)((fah-32)/1.8);
		System.out.println("화씨 " + fah + "도 " + " -> " + "섭씨 " + cel);

	}

	/**
	 * 4과목의 평균을 구하기
	 */
	public static void getAvg() {
		/*
		 * 수학,물리,영어,프로그래밍 4가지 과목의 평균을 구하기
		 */
		int math = 80;
		int physics = 95;
		int english = 78;
		int programing = 96;
		int sum = math + physics + english + programing;
		double avg = (double) (sum) / 4; // 87.5
		// double avg=(double)((sum)/4);==>(double)(정수/정수)=87.0
		System.out.println("평균점수 : " + avg);
	}

	public static void main(String[] args) {
		CeltoFah ctf=new CeltoFah();
		double result1=ctf.f(32
				);
		System.out.println(result1);
		/*System.out.println("시작");
		toFah();
		
		toCel();
		
		getAvg();
		
		System.out.println("끝");*/
	}
}
