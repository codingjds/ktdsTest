package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive {
	//StackOverflowError 
	public void recursive() {
		System.out.println("실행중.....");
		recursive();
	}
	
	public void readFile(File file) {
		
		File[] fileList = file.listFiles();		//"C:\\Devs"에 있는 폴더,파일들을 쫙 가져온다
		for (File file2 : fileList) {
			System.out.println(file2.getAbsolutePath());
			if(file2.isDirectory()) {		
				readFile(file2);				//재귀호출 ==> 웹에서 잘 안쓰임 
			}
			
//2			System.out.println("========================");
//			//System.out.println(file2.getName());
//			System.out.println(file2.getAbsolutePath());
//			if(file2.isDirectory()) {			//file2가 폴더라면
//				
//				File[] fileList2= file2.listFiles();
//				for (File file3 : fileList) {
//					//System.out.println(file3.getName()); 1
//					System.out.println("------------------------");
//					System.out.println(file3.getAbsolutePath());
//					
//				} //재귀호출 없이 일일이 폴더 안에 폴더 들어가는 코드 == 쓰기 끝이 없다
			
		}
		
	}
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
//		try {
//			recursive.recursive();
//		}
//		catch(StackOverflowError sofw){
//			
//		} 소용없음
//		recursive.recursive();
		
		recursive.readFile(new File("C:\\Devs"));
	}
}
