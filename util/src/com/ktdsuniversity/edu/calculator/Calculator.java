package com.ktdsuniversity.edu.calculator;

import java.util.Scanner;

import com.ktdsuniversity.edu.exceptions.NotSupportAgeException;
import com.ktdsuniversity.edu.util.NumberUtil;

public class Calculator {
	public static void checkAge(int age) {
		if(age>150) {
			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다.");		
		}
		
	}
	public static void main(String[] args) {
		checkAge(10);//Runtime이니깐 trycatch안해도되긴함
		try {
		checkAge(200);
		}
		catch(NotSupportAgeException nsae){
			System.out.println(nsae.getMessage());
		}
//		int age = 200;
//		if(age>150) {
////			throw new NotSupportAgeException();
//			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다.");		
//		}
//		//사용자 예외 Exception 클래스
		
		System.out.println("바이트로 변환할 값을 입력하시오:");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
//		String nullString = null;
		
		
		//byte로 변경
//		byte b = NumberUtil.toByte(string);
		byte b = NumberUtil.toByte(string, (byte)444);
		System.out.println("byte 변환값: " +b);
		
		//short로 변경
//		short s = NumberUtil.toShort(string);
		short s = NumberUtil.toShort(string, (short)444);
		System.out.println("short 변환값: " +s);
			
		//int로 변경
//		int i = NumberUtil.toInt(string);
		int i = NumberUtil.toInt(string, (int)444);
		System.out.println("int 변환값: " +i);
		
		//long로 변경
//		long l = NumberUtil.toLong(string);
		long l = NumberUtil.toLong(string, (long)444);
		System.out.println("long 변환값: " +l);
		
		//float로 변경
//		float f = NumberUtil.toFloat(string);
		float f = NumberUtil.toFloat(string, (float)444);
		System.out.println("float 변환값: " +f);
		
		//double로 변경
//		double d = NumberUtil.toDouble(string);
		double d = NumberUtil.toDouble(string, (double)1000);
		System.out.println("double 변환값: " +d);
		
		
		
		
//		try {
//			boolean isEquals = nullString.equals("A");
//			
//			System.out.println("변환시작");
//			b = Byte.parseByte(string);
//			System.out.println("정상적으로 변환됨");
//		}
//		catch(NullPointerException npe){
//			b=0;
//			System.out.println("무언가가 null 임"); //출력되지 않음==>try{}안에 NullPointerException이 발생할 코드가 없엇따
//												// NullPointerException 발생하게끔 boolean~~넣으면 npe만 실행된다
//												// 이렇게 예외처리하기위해서 try{}안에 많이 넣으면 성능이 떨어진다 ==>try코드는 짧게 하는게 좋다!
//		}
//		catch(NumberFormatException nfe) {
//			b=0;
//			System.out.println("변환 중 에러가 발생함");
//		}
//		finally{
//			System.out.println("무조건 실행되는 finally");
//		}
//		System.out.println(b);
	
		
		
	}
}
