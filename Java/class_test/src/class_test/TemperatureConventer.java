package class_test;

public class TemperatureConventer {
	
	/**
	 * 섭씨를 화씨로 변경
	 */
	public void toFah() {
		/*
		 * 섭씨를 화씨로 변경해 fah 변수에 할당후 출력
		 */
		int cel = 31;
		double fah = ((double) cel * 9 / 5) + 32;// (double)위치 중요!
		// double fah = (cel*1.8)+32;
		System.out.println("섭씨 " + cel + "도 " + " -> " + "화씨 " + fah);
	}
	
	/**
	 * 화씨를 섭씨로 변경
	 */
	public void toCel() {
		double fah = 87.8;
		/*
		 * 화씨를 섭씨로 변경해 cel 변수에 할당후 출력
		 */
		int cel = (int) ((5 * (fah - 32)) / 9);
		// cel= (int)((fah-32)/1.8);
		System.out.println("화씨 " + fah + "도 " + " -> " + "섭씨 " + cel);
	}
	
}
