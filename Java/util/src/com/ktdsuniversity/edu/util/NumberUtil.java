package com.ktdsuniversity.edu.util;
/**
 * 객체화못하게 추상클래스로 한다. 그래도 객체화 못하게 생성자도 private으로 한다
 * @author User
 *
 */
public abstract class NumberUtil {

	private NumberUtil() {}
	
	public static byte toByte(String string) {
		try {
			return Byte.parseByte(string);			
		}
		catch(NumberFormatException nfe){
			return 0;	//변환값을 바꿔야하는 경우 오버로딩메소드
		}
	}
	
	public static byte toByte(String string, byte defaultByte) {
		try {
			return Byte.parseByte(string);			
		}catch (NumberFormatException nfe) {
			return (byte)defaultByte;
		}
	} //변환하다가 실패하면 기본값으로 보내줘
	
	//catch에 절대 NullPointerExceptin 넣으면 안된다!! 오동작에 문제가 생김
	
	public static short toShort(String string) {
		try {
			return Short.parseShort(string);
		}
		catch(NumberFormatException nfe){
			return 0;
		}
	}
	public static short toShort(String string, short defaultValue) {
		try {
			return Short.parseShort(string);
		}
		catch(NumberFormatException nfe){
			return defaultValue;
		}
	}
	
	public static int toInt(String string) {
		try {
			return Integer.parseInt(string);
		}
		catch(NumberFormatException nfe){
			return 0;
		}
	}
	public static int toInt(String string, int defaultValue) {
		try {
			return Integer.parseInt(string);
		}
		catch(NumberFormatException nfe){
			return defaultValue;
		}
	}
	public static long toLong(String string) {
		try {
			return Long.parseLong(string);
		}
		catch(NumberFormatException nfe){
			return 0;
		}
	}
	public static long toLong(String string, long defaultValue) {
		try {
			return Long.parseLong(string);
		}
		catch(NumberFormatException nfe){
			return defaultValue;
		}
	}
	
	public static float toFloat(String string) {
		try {
			return Float.parseFloat(string);
		}
		catch(NumberFormatException nfe){
			return 0;
		}
	}
	public static float toFloat(String string, float defaultValue) {
		try {
			return Float.parseFloat(string);
		}
		catch(NumberFormatException nfe){
			return defaultValue;
		}
	}
	public static double toDouble(String string) {
		try {
			return Double.parseDouble(string);
		}
		catch(NumberFormatException nfe){
			return 0; // 0.0; ?
		}
	}
	public static double toDouble(String string, double defaultValue) {
		try {
			return Double.parseDouble(string);
		}
		catch(NumberFormatException nfe){
			return defaultValue;
		}
	}


}
