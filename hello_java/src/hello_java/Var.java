package hello_java;

public class Var {
	//자바파일의 실행지점
	public static void main(String[] args) {
	//변수를 정의 = 변수를 할당해서 사용;
		String name = "정덕수";
		
		 long x= 10;	//long x= 9_999_999L
		 int y= 5;
		 int z= 3;
		 //int a= (int)(x+z); //(4)(4byte+8byte) 강제로 8바이트를 4바이트로 하겠다=명시적 형변환
		 //int b= y-z; 		  //long x값을 크게하면 a는 음수값이 나온다
		 
		 System.out.println("철수는 사과를 " + x + "개를 가지고 있다.");
		 System.out.println("영희는 사과를 " + y + "개를 가지고 있다.");
		 System.out.println("철수가 영희에게 사과를 " + z + "개를 빌렸다.");
		 
		 x=x+z;
		 y=y-z;
		 
		 System.out.println("철수는 사과 " + x + "개를 가지고 있다.");
		 System.out.println("영희는 사과 " + y + "개를 가지고 있다."); 
	}
}
