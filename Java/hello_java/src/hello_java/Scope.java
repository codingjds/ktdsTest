package hello_java;

import java.util.Scanner;// ctrl+shift+대문자o
/**
 * 변수 범위 학습한 파일
 * @author User
 * @since 2023.01.18
 */
public class Scope {
	/**
	 *  무언가를 입력받을 수 있는 변수
	 */
	static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Java Program의 시작 부분
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		//문자열 입력
		System.out.println("나이를 입력하세요.");
		int age = scanner.nextInt();
		//숫자 입력
		System.out.println("사는 곳을 입력하세요.");
		scanner.nextLine();//***추가하는 이유=> nextInt가 입력받는거를 종료해버는 버그
		String address = scanner.nextLine();
		
		/*
		 * 문자열과 변수를 이어붙일 때에는 + 연산을 사용한다.
		 * 문자열과 숫자를 이어붙이면 문자열이 된다.
		 */
		System.out.println("이름은 "+ name + "입니다.");
		System.out.println("나이는 "+ age + "세 입니다.");
		System.out.println("사는 곳은 "+ address +"입니다.");
	}
}
