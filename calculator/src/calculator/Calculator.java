package calculator;

/**
 * 사칙연산 클래스
 * @author User
 *
 */
public class Calculator {
	
	//더하기(정수,정수): 정수
	public int sum(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		return result;
	}
	
	//뺴기(정수,정수): 정수
	public int minus(int numberOne, int numberTwo) {
		int result = numberOne - numberTwo;
		if(result<0) {
			result = -1*result;
			//result = numberTwo-numberOne;
			return result;
		}
		return result;
	}
	//곱하기(정수,정수): 정수
	public int multi(int numberOne, int numberTwo) {
		int result = numberOne * numberTwo;
		return result;
	}
	//나누기(정수,정수): 실수
	public double devide(int numberOne, int numberTwo) {
		double result = (double)numberOne/numberTwo;
		return result;
	}
	//나머지 구하기(정수,정수) :정수
	public int remain(int numberOne, int numberTwo) {
		int result = numberOne % numberTwo;
		return result;
	}
	
}
