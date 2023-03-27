package com.ktdsuniversity.edu.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {
	
	public static void main(String[] args) {
		String string = "썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다. 현재는 OpenJDK는 GPL2이나 오라클이 배포하는 Oracle JDK는 상업라이선스로 2019년 1월부터 유료화정책을 강화하고 있다. Java EE는 이클립스 재단의 소유이다. Java 언어는 J2SE 1.4부터는 Java Community Process (JCP)에서 개발을 주도하고 있다.";
								//Arrays.asList(배열) == 리스트
//		List<String> wordList = Arrays.asList(string.split(" ")); ==> ArrayIndexOutOfBoundsException
					//wordList = List.of(string.split(" ")); 조금은 다르다 ==> IndexOutOfBoundsException
		
		List<String> wordList = new ArrayList<>();
		wordList.addAll(Arrays.asList(string.split(" "))); // IndexOutOfBoundsException
		
		if(wordList.size() >50) {
			String word = wordList.get(50);
			System.out.println(word);			
		}
		
		//현업에서 리스트와 배열은 try~catch 안쓰고 길이 체크만 한다!
		try {
			String word = wordList.get(50);
			System.out.println(word);						
		}
		catch(IndexOutOfBoundsException ioobe){
			System.out.println("그런 인덱스는 없습니다.");
		}
		
	}
	
}



