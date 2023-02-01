package com.ktdsuniversity.edu.abs.ext;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//인터페이스나 추상클래스는 객체화 시킬수 없다
		//Calculator calc = new Calculator() ;
		//List<String> list = new List<>(); 
		
		//Calculator calc = new Calculator() { } ; //{} 구현부 추가하면 가능
		
		Calculator calc = new SimpleCalculator();
		System.out.println(calc.calculate("+", 10, 40));
		System.out.println(calc.calculate("-", 10, 40));
	}
}
