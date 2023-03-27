package com.ktdsuniversity.edu.constructor;

public class Main {
	
	public static void main(String[] args) {
		
//		Calculator calculator = new Calculator();
//		Calculator calculator1 = new Calculator();
//		Calculator calculator2 = new Calculator(111);
		
//		Calculator calc1 = new Calculator();
//		int result = calc1.sum();
//		System.out.println(result);
//		
//		Calculator calc2 = new Calculator(5, 6);
//		result =  calc2.sum();
//		System.out.println(result);

		Doctor doctor1 = new Doctor("최신컴퓨터", "펜");
		String result = doctor1.examination();
		System.out.println(result);
		// 출력 >> 의사가 최신 컴퓨터와 펜으로 진찰합니다.
		Doctor doctor2 = new Doctor("오래된컴퓨터", "청진기");
		result = doctor2.examination();
		System.out.println(result);
		
		Doctor doctor3 = new Doctor("종이", "손");
		result = doctor3.examination();
		System.out.println(result);
	}
}
