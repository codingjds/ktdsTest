package com.ktdsuniversity.edu.inf;

public class CalculatorNormalImpl implements Calculator{
	//인터페이스 타입으로 구현한것이 구현클래스
	
	//오버라이딩= 메소드 재정의 ==> 새로 정의 안댐
	//애노테이션 회색 주석 jvm이 인식하기에 함부로 지우면 안댐
	@Override
	public int sum(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

	@Override
	public int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
	
	//@Override//오버라이딩= 메소드 재정의 ==> 새로 정의 안댐
	public int devide(int numberOne, int numberTwo) {
		return numberOne/numberTwo;
	}
	
	
	
}
