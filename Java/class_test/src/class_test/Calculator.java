package class_test;

public class Calculator {
	public static void main(String[] args) {
		
		/*
		 * primitive Type
		 * 	byte, short, int, long
		 * 	float, double
		 * 	char, boolean
		 * 
		 * Reference Type
		 * 	Primitive Type을 제외한 모든 타입
		 * 
		 * 변수의 생성 방법
		 * primitive Type
		 * 	type name=value;		//String은 예외적으로 허용됨
		 * 
		 * Reference Type
		 * 	Type name= new Type();
		 */
		/*String name="정덕수";
		String name2=new String("정덕수");
		System.out.println(name);
		System.out.println(name2);
		*/
		ScoreCalculator scoreCalculator = new ScoreCalculator(); //인스턴스화|객체화|생성자
		scoreCalculator.getAverage();                 
		scoreCalculator.getAverage();
		scoreCalculator.getGrade();
		scoreCalculator.getAvergaeGrade(90);
		TemperatureConventer temperatureConventer= new TemperatureConventer();
		temperatureConventer.toCel();
		temperatureConventer.toFah();
		
		

	}
}
