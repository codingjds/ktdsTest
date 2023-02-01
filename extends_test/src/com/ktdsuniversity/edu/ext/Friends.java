package com.ktdsuniversity.edu.ext;
//상속 extends 인터페이스는 implements
public class Friends extends Address {
	
	private String birthDay;
	
	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	//재정의 
	//인터페이스 흰색세모 구현되지않은것을 재정의
	//extends 녹색세모 구현된것을 재정의
	//솔리드 원칙에 위배(상속을 할때 원래 것을 건들이지마라) 하지만 개발하기위해선 어쩔수없음
	@Override
	public String getAddress() {
		return "내 친구 주소는 "+super.getAddress();
	}
	
	@Override
	public String getName() {
		return "내 친구 이름은 "+super.getName();
	}
	
	@Override
	public String getPhoneNumber() {
		return "내 친구 전화번호는 "+super.getPhoneNumber();
	}
}
