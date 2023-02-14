package com.ktdsuniversity.edu.exceptions;

public class NullPointerExceptionTest {
	
	public static void main(String[] args) {
	
		String name = null;
		boolean isAStart = name.startsWith("A");
		System.out.println(isAStart);
		
	}
}
