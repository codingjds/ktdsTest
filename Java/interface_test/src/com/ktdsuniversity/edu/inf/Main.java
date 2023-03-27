package com.ktdsuniversity.edu.inf;

public class Main {
	
	public static void calculate(Calculator calculator) {
		System.out.println(calculator);
		
		if(calculator instanceof CalculatorNormalImpl) {	
			System.out.println(calculator.sum(10, 20));
			System.out.println(calculator.minus(40, 3));
		}
		
	}
	
	public static void main(String[] args) {
		
		calculate(new CalculatorNormalImpl());
		calculate(new CalculatorRandomImpl());
		
//		//인터페이스명 변수명 = new 구현클래스명();  ==>확장성이 좋아진다 == 유지보수가 편해진다
//		Calculator calculator1 = new CalculatorNormalImpl();
//		
//		System.out.println(calculator1.sum(10, 20));
//		System.out.println(calculator1.minus(40, 3));
//		//calculator1.devide(10,5);//타입이 인터페이스이기 때문에 devide가 안댐
//								//타입을 CalculatorNormalImp로 한다면 또 가능함)
//		
////		CalculatorNormalImpl calculator2 = new CalculatorNormalImpl(); //타입과 생성자명 일치한 경우
////		System.out.println(calculator2.devide(10, 2));
//		
//		Calculator calculator2 = new CalculatorRandomImpl();
//		System.out.println(calculator2.sum(10, 20));
//		System.out.println(calculator2.minus(40, 3));
	}
}
