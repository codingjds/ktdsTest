package com.ktdsuniversity.edu.exceptions;

public class NumberFormatExceptionTest {
	
	public static boolean isInteger(String string) {
		if (string == null) {
			return false;
		}
		
		return string.matches("^[0-9]+$");
		//"^ 무언가로 시작한다 / $""무언가로 끝난다 / [0-9]+ 숫자로 계속된다
	}
	
	public static void main(String[] args) {
		
		System.out.println(isInteger("12345"));
		System.out.println(isInteger("1234 5"));
		System.out.println(isInteger("123.45"));
		System.out.println(isInteger("123. 45"));
		System.out.println(isInteger("ABC"));
		
		String str = "123dd4";
		if (isInteger(str)) {
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		try {
			Integer.parseInt("adfa");
		}
		catch(NumberFormatException nfe){
			System.out.println("변환할 수 없습니다.");
		}
		
//		Integer.parseInt("abc");
	}
}


