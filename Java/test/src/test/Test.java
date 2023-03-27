package test;

public class Test {
	public static void main(String[] args) {
		
		
//		int number = Integer.parseInt("ABC");
//		System.out.println(number); //NumberFormatException 발생 ==> catch에 적어준다
		
		try {
			int number = Integer.parseInt("ABC");
		}catch(NumberFormatException e) {
			System.out.println("에러가 발생했습니다."+e.getMessage());//오류의 원인을 이해하기 쉬운형태로 리턴
			e.printStackTrace();//이 에러가 어디에서 발생했고 실행순서를 출력
		}
		System.out.println("ㅋㅋㅋㅋ"); // 에러가 발생했지만 JVM이 자바프로그램을 안죽였다
		//try~catch없으면 프로그램이 죽음
		
//		try{에러가 일어날 가능성이 있는 코드}
//		catch{에러가 났을떄 실행되는 코드}
//		finaly{에러가 났을 떄 || 에러가 안났을떄 실행되는 코드}		
//		연결을해서 데이터를 흘려주는것 = Stream(file)/Connection(DB)				
//		언제 finally를 쓰는가 ==>연결을 끊기 위해, 안끝으면 메모리가 계속 쌓인다
//		finally 안쓰고 return으로 끊으면 되지않냐 ==>return이 있어서 항상 finally는 실행된다
//		return 데이터를 반환한다 or 진행을 멈춘다		
		
		
		
	}
}
