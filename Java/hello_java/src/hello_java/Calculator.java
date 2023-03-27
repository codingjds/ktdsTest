package hello_java;

public class Calculator {
	
	public int f(int x) {
		int a=10;
		int b=50;
		
		int result=a*b+x;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		int result1=calc.f(10);
		int result2=calc.f(30);
		int result3=calc.f(50);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
