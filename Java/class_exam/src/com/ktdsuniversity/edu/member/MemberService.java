package com.ktdsuniversity.edu.member;

public class MemberService {
	
	private String userName;
	//private한것을 public으로 getter setter만드냐
	//자바에서 관용적으로 모든 곳에 쓰여서 변수에 getter setter 무조건 생성해야함
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void join() {
		System.out.println("회원가입");
	}
	
	public void login() {
		System.out.println("로그인");
	}
	
	void quit() {
		System.out.println("탈퇴");
	}
	
}
