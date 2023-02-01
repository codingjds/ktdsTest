package hello_java;

public class Operation {
	public static void main(String[] args) {
		// 1. 정수와 정수 연산
		int numberOne = 10;
		int numberTwo = 3;
		System.out.println("10 + 3=" + (numberOne + numberTwo));
		System.out.println("10 - 3=" + (numberOne - numberTwo));
		System.out.println("10 * 3=" + (numberOne * numberTwo));
		System.out.println("10 / 3=" + (numberOne / numberTwo));
		System.out.println("10 % 3=" + (numberOne % numberTwo)+"\n");
		
		// 2. 실수와 실수 연산
		double floatOne = 10.1;
		double floatTwo = 3.2;
		System.out.println("10.1 + 3.2 = "+ (floatOne + floatTwo));
		System.out.println("10.1 - 3.2 = "+ (floatOne - floatTwo));
		System.out.println("10.1 * 3.2 = "+ (floatOne * floatTwo));
		System.out.println("10.1 / 3.2 = "+ (floatOne / floatTwo));
		System.out.println("10.1 % 3.2 = "+ (floatOne % floatTwo) +"\n");
		// 3. 실수와 정수 연산
		System.out.println("10.1 + 3 = "+ (floatOne + numberTwo));
		System.out.println("10.1 - 3 = "+ (floatOne - numberTwo));
		System.out.println("10.1 * 3 = "+ (floatOne * numberTwo));
		System.out.println("10.1 / 3 = "+ (floatOne / numberTwo));
		System.out.println("10.1 % 3 = "+ (floatOne % numberTwo)+"\n");
		// 4. 정수와 실수 연산
		
		// 5. 문자와 변수 연산
		System.out.println("10.1 + 3 = "+ floatOne + numberTwo);
		System.out.println("10.1 - 3 = "+ (floatOne - numberTwo));
		System.out.println("10.1 * 3 = "+ floatOne * numberTwo);
		System.out.println("10.1 / 3 = "+ floatOne / numberTwo);
		System.out.println("10.1 % 3 = "+ floatOne % numberTwo);
		
	}
}
