package com.ktdsuniversity.edu.controller;

import java.util.List;

import com.ktdsuniversity.edu.service.MemberService;
import com.ktdsuniversity.edu.service.MemberServiceImpl;
import com.ktdsuniversity.edu.service.SecondMemberServiceImpl;
import com.ktdsuniversity.edu.vo.MemberVO;

public class MemberController {
		
	public static void main(String[] args) {
		
		MemberService service = new MemberServiceImpl();
		//MemberService service = new SecondMemberServiceImpl();
		MemberVO member = new MemberVO();
		member.setId("id1");
		member.setPassword("pwd1");
		member.setReadNumber(1);
		member.setPageNumber(0);
		service.create(member);

		member = new MemberVO();
		member.setId("id2");
		member.setPassword("pwd2");
		member.setReadNumber(2);
		member.setPageNumber(0);
		service.create(member);
		
		member = new MemberVO();
		member.setId("id3");
		member.setPassword("pwd3");
		member.setReadNumber(3);
		member.setPageNumber(0);
		service.create(member);
		
		List<MemberVO> memberList = service.readAll();
		for(MemberVO eachMember : memberList) {
			System.out.println(eachMember.getId());
			System.out.println(eachMember.getPassword());
			System.out.println(eachMember.getReadNumber());
			System.out.println(eachMember.getPageNumber());
		}
		
		MemberVO aa = service.read("id2");
		System.out.println(aa.getId());
		System.out.println(aa.getPassword());
		System.out.println(aa.getReadNumber());
		System.out.println(aa.getPageNumber());
		//02.01 과제
		//memberService memberDAO | List,Map 둘다 호환되면서 read() 하나만 조회하는거 만들기 
		//==> Method Overloading : 똑같은 메소드인데 파라미터만 다른 거임
		
	}
	
	
}
