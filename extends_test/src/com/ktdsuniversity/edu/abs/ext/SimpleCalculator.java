package com.ktdsuniversity.edu.abs.ext;
/**
 * 추상클래스를 상속받아 구현한 클래스
 * 상속+인터페이스(구현)
 * @author User
 *
 */
public class SimpleCalculator extends Calculator{

	@Override
	protected int sum(int numberOne, int numberTwo) {
		return numberOne+numberTwo;
	}

	@Override
	protected int minus(int numberOne, int numberTwo) {
		return numberOne-numberTwo;
	}
	
}
