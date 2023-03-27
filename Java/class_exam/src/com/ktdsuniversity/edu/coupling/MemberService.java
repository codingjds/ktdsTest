package com.ktdsuniversity.edu.coupling;

public class MemberService implements MemberManagement{
	
	//옆에 세모 모양은 오버라이팅했다는 뜻 =재구현 -> @Override로 적어줘야한다 성능상 문제
	@Override
	public void regist() {
		System.out.println("회원 가입합니다.");
	}
	
	@Override
	public void unregist() {
		System.out.println("회원 탈퇴합니다.");
	}
	
	@Override
	public void updateMyInfo() {
		System.out.println("내 정보를 수정합니다.");
	}
	
	
	
	
}
