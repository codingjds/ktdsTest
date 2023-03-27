package com.ktdsuniversity.edu.method;

import java.lang.reflect.Array;

public class Main {
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(0);
		calc.sum(0L);
		calc.sum(0, 0);
		calc.sum(0, 0, 0);
		
		Welcome welcome = new Welcome() ;
		String greeting = welcome.greeting();
		System.out.println(greeting);
		
		greeting = welcome.greeting("정덕수");
		System.out.println(greeting);
		
		greeting = welcome.greeting("정덕수", "안녕?");
		System.out.println(greeting);
		
//		greeting = welcome.greeting("정덕수","홍길동");=> 파라미터수가 오버로딩된 메소드와 같으면 그 메소드가 실행된다.
		greeting = welcome.greeting("정덕수","홍길동","장발장","김유신");
//		greeting = welcome.greetings("정덕수","홍길동","장발장","김유신"); => 파라미터 타입이 배열이니깐 배열이 아니므로 에러뜸
		System.out.println(greeting);
		
		//배열 파라미터 Case 1
		greeting = welcome.greetings(new String[] {"장민창","조태용","이동학"});
		System.out.println(greeting);
		//파라미터를 가변인자로 받는경우는 드물고 배열로 받는 경우가 더러 있다
	
	}
}
