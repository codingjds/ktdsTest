package com.ktdsuniversity.edu.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		String nullString = null;
		
		
		//byte로 변경
		byte b = 0;
		try {
			boolean isEquals = nullString.equals("A");
			
			System.out.println("변환시작");
			b = Byte.parseByte(string);
			System.out.println("정상적으로 변환됨");
		}
		catch(NullPointerException npe){
			b=0;
			System.out.println("무언가가 null 임"); //출력되지 않음==>try{}안에 NullPointerException이 발생할 코드가 없엇따
												// NullPointerException 발생하게끔 boolean~~넣으면 npe만 실행된다
												// 이렇게 예외처리하기위해서 try{}안에 많이 넣으면 성능이 떨어진다 ==>try코드는 짧게 하는게 좋다!
		}
		catch(NumberFormatException nfe) {
			b=0;
			System.out.println("변환 중 에러가 발생함");
		}
		finally{
			System.out.println("무조건 실행되는 finally");
		}
		System.out.println(b);
		
		int a=11;
		//int로 변경
		
		//byte로 변경
		
		//byte로 변경
		
		//byte로 변경
		
		
		
	}
}
