package com.ktdsuniversity.edu.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriter {

	public static File createNewFile() throws IOException {
//		File textFile = new File("C:\\logs", "test.txt");
		
		File textFile = new File("C:\\logaaas", "test.txt");
		textFile.createNewFile();
		return textFile;
		} //언젠가 File을 불러올애가 trycatch하도록 떠넘김 ==>throws  : Exception 일때만! RuntimeException일때는 안쓰는게 낫다
	
	//4 throws 안하고 Exception을 RuntimeException으로 바꿔서 던지기 BUT JVM에게 에러가 전달된다
	//throws 지금단계에서 멀할지 모르겠으니깐 너가 가져다 쓸때 해봐
	public static File createNewFileThrowsRuntimeException() {
		File textFile = new File("C:\\logsss", "test.txt");
		try {
			textFile.createNewFile();
		} catch (IOException ioe) {
			//throw new RuntimeException(ioe.getMessage(),ioe);
			throw new RuntimeException(ioe.getMessage());
		}
		return textFile;
	}
	
	public static void main(String[] args) {
//6		File textFile= new File("C:\\logs", "text.txt");
		File textFile= new File("C:\\logs");	//7
		// 			존재여부			파일형식 일치여부
		if(textFile.isDirectory()) {	//7
//5		if(textFile.exists() && textFile.isFile()) {
				//java.io.OutputStream
				//java.io.FileOutputStream
			OutputStream fos = null;
			try {
				fos = new FileOutputStream(textFile);
//8				OutputStream fos = new FileOutputStream(textFile);
				fos.write("파일 내용을 씁니다".getBytes());//byte만 들어가더라도 String.getBytes()로 넣으면 들어가진다.
				fos.flush();
				fos.close();
			} catch (FileNotFoundException e) {
//				e.printStackTrace();
			} catch (IOException e) {
//				e.printStackTrace();
			}
			finally {
				if(fos != null) {	//9
					try {
						fos.close(); //무조건 Null체크해야한다 9
					} catch (IOException e) {
					}
				}
			}//8
		}//7 
//5		}
		
//4		createNewFileThrowsRuntimeException(); 
		
//3		try {
//			createNewFile();
//		} catch (IOException ioe) {
//			System.out.println("에러가 발생했습니다."+ ioe.getMessage());
//		}
	
	
//2	public static void main(String[] args) throws IOException {
//		createNewFile();		//main에서 또 넘김 throws ==>JVM한테 니가해라 하지만 JVM은 안한다! 프로그램을 kill시킴
		
//1		//File textFile = new File("C:\\logs"); 폴더 정의
//		File textFile = new File("C:\\logs", "test.txt"); //파일을 정의
//		try {
//			textFile.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		//IOException(Exception) SecurityException(RuntimeException) 둘다 throws해야하지만 IOE만 trycatch 필수
	}
}
