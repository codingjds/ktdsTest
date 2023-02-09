package com.ktdsuniversity.edu.lambda;

@FunctionalInterface	//람다식을 사용할수있는 함수형 인터페이스라고 정의 권장 ==성능증가
public interface Computable {
	
	//함수형 프로그래밍 관점에서는 인터페이스 하나만 있으면 되고 구현클래스를 개별로 만드는 것을 싫어함--> 실행부분에 그냥 만듬
	public int sum(int numberOne, int numberTwo);
//	public int minus(int numberOne, int numberTwo);  람다식 - 구현되지 않은 클래스가 1개 일때만 변환가능하다!, 함수형 인터페이스라고 정의 권장
	
	
	
}
