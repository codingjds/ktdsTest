package com.ktdsuniversity.edu.exceptions;

public class ArrayIndexOutOfBoundsExceptionTest {
	
	
	
	public static void main(String[] args) {
		
		String[] nameArr = new String[3];
		nameArr[0] = "조태용";
		nameArr[1] = "정덕수";
		nameArr[2] = "이유나";
		
		String name = nameArr[0];
		System.out.println(name);
		name = nameArr[1];
		System.out.println(name);
		name = nameArr[2];
		System.out.println(name);
		
		if(nameArr.length > 3) {
			name = nameArr[3];
			System.out.println(name);			
		}
		
		
		String string = "썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다. 현재는 OpenJDK는 GPL2이나 오라클이 배포하는 Oracle JDK는 상업라이선스로 2019년 1월부터 유료화정책을 강화하고 있다. Java EE는 이클립스 재단의 소유이다. Java 언어는 J2SE 1.4부터는 Java Community Process (JCP)에서 개발을 주도하고 있다.";
		String[] wordArray = string.split(" ");
		if(wordArray.length > 50) {
			String word = wordArray[50];
			System.out.println(word);			
		}
		//stream할때 자주 일어나는 에러다.
		try {
			String word = wordArray[50];
			System.out.println(word);						
		}
		catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("그런 인덱스는 없습니다.");
		}
	}
	
}
















