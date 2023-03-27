package com.ktdsuniversity.edu.member;

public class Main {
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.setUserName("정덕수");
		String userName = memberService.getUserName();
		System.out.println(userName);
		memberService.join();
		memberService.login();//private하면 여기서 호출이 안됨
		memberService.quit();
		
	}
}
