package com.ktdsuniversity.edu.constructor;

public class Calculator {
	
//	public Calculator() {
//		System.out.println("생성자 호출됨!");
//	}
//	
//	public Calculator(int num) {
//		System.out.println(num + " 전달됨.");
//	}
	private int a;
	private int b;
	
	public Calculator() {
		a=10;
		b=20;
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b;
	}
	
}
