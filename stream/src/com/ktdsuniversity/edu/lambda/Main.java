package com.ktdsuniversity.edu.lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
	//리턴값이 void인 Printable.print
	public static void print(Printable printable) {
		printable.print("정덕수");
	}
	//리턴값이 int인 Computable.sum
	public static void printSumResult(Computable computable) {
		
		int sumResult = computable.sum(10, 30);
		System.out.println(sumResult);
	}
	
	public static void main(String[] args) {
		//이 코드를 1.익명클래스 / 2.람다식 두방법으로 만들어봄
		//1.익명클래스
		printSumResult(new Computable() {
			@Override
			public int sum(int numberOne, int numberTwo) {
				return numberOne + numberTwo;
			}
		});
		
		//2.람다 (구현되지않은 메소드가 1개일때만 가능)
		printSumResult((num1, num2)->num1+num2); //리턴생략
		printSumResult((num1, num2)->{			//{}를 쓰면 무조건 리턴 써줘야함 - 보통 람다바디가 여러줄일때 {}필수
			return num1 +num2;
		});
		
//		print((data) -> data + "입니다");//data(void) ->String으로 리턴하려니깐 에러뜸==>리턴타입이 같아야한다.
		print(data -> System.out.println(data + "입니다"));//println은 리턴값이 void   cf)파라미터가 하나일땐 ()없어도 괜찮다
		print((data) -> System.out.println(data + "입니다"));//println은 리턴값이 void
		print((data) -> {
			System.out.println(data+ "입니다.");
		});
		print(System.out::println); //전달받은 데이터만 바로 출력됨 ex)Foreach문에서 자주사용
		
		List <Integer> intList = List.of(10,20,30,40,50); //자바9부터 생김 List.of 간단하게 리스트만듬
		List <Integer> intList2 = Arrays.asList(10,20,30,40,50); //자바 8미만
		
		intList.forEach(System.out::println);
		intList2.forEach(System.out::println);
		
		
		
////		Computable calc = new Computable();//인터페이스--인스턴스화 할수없음 
////		Computable calc = new Computable(){};	//()뒤에 {} 추가하면 익명클래스 생성됨
//		Computable calc = new Computable() { // 객체지향 방식에서는 비선호하는 방법 but 이벤트드라이빙 프로그램에서는 선호하는 방식
//
//			@Override
//			public int sum(int numberOne, int numberTwo) {
//				return numberOne + numberTwo;
//			}
//
//			@Override
//			public int minus(int numberOne, int numberTwo) {
//				return numberOne - numberTwo;
//			}
//		};
//
//		System.out.println(calc.sum(10, 20));
//		System.out.println(calc.minus(10, 50));
//

	}
}
