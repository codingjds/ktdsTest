package com.ktdsuniversity.edu.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("잘못된 경로"));
		}
		catch(IOException ioe) {
			try {
				lines = Files.readAllLines(Paths.get("올바른 경로"));
			} catch (IOException e) {
				System.out.println("???");
			}			//해결코드가 또 안될 경우를 대비하여 한번더 try~catch 사용
		}
		System.out.println("숫자로 변환 시작");
		
		String str = "ABC";
		try {
			int number = Integer.parseInt(str);			
		}
		catch(NumberFormatException nfe){
			System.out.println("숫자로 변환 중에 에러가 발생했습니다." + nfe.getMessage());
		}
		
		System.out.println("숫자로 변환 종료");
		
		
	}
	
}


