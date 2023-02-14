package com.ktdsuniversity.edu.coupling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//처음에 멤버서비스 이용하는 줄알았으나 임플로이서비스쓰는걸 알았을때
//		EmployeeService memberService = new EmployeeService();
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
		
//		EmployeeService memberService = new EmployeeService();
//		memberService.create();
//		memberService.update();
//		memberService.delete();
	
//		EmployeeService memberService = new EmployeeService();
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
		
//		MemberService memberService = new MemberService();
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
		
		Iterable<String> iterable = new ArrayList<>();
//		iterable.get(0);
		iterable.forEach(null);
		
		Collection<Integer> collection = new ArrayList<>();
//		collection.get(0);없음
		collection.forEach(null);
		
		List<String> list = new ArrayList<>();
		list.get(0);
		list.forEach(null);
		// 슈퍼클래스 = 생성자 서브클래스 가능!!
		// Sub class is a Super class 반드시 기억!!ㄴ
		// Super classs isn't a Sub class 규칙
		//memberService의 슈퍼클래스 부모클래스는 MemberManagement이니깐 적용해보기
//		MemberManagement memberService = new MemberService();
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
	
		MemberManagement memberService = new EmployeeService();
		memberService.regist();
		memberService.unregist();
		memberService.updateMyInfo();
		
		
		
	}
	
}
