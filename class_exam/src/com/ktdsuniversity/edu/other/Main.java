package com.ktdsuniversity.edu.other;

import com.ktdsuniversity.edu.member.MemberService;

public class Main {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.setUserName("정덕수");
		String userName = memberService.getUserName();
		System.out.println(userName);
		memberService.join();
		memberService.login();
//		memberService.quit();//접근제한자가 default이면 다른 패키지일떄 에러발생==>현업에서 default 절대 안씀
	
		
	}
}
