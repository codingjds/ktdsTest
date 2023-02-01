package com.ktdsuniversity.edu.abs.ext;
//abstract 추상클래스
/**
 * 추상클래스
 * @author User
 *
 */
public abstract class Calculator {
	//추상클래스는 구현되어있는 메소드와 구현되어있지 않는 메소드가 복합적으로 있다
	//구현 O		(ex. 중복되는 코드)
	public int calculate(String calcType, int numberOne, int numberTwo) {
		if(calcType.equals("+")) {
			return sum(numberOne,numberTwo);
		}
		else if(calcType.equals("-")) {		
			return minus(numberOne,numberTwo);
		}
		return 0;
	}
	//구현 X		(ex.중복되지 않은 코드=>따로 구현할 SimpleCaculator)
	protected abstract int sum(int numberOne, int numberTwo);
	protected abstract int minus(int numberOne, int numberTwo);
	
}
