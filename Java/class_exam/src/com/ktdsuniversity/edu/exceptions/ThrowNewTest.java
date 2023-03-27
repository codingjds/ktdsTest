package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ThrowNewTest {
	
	static Map<String, String> memberMap = new HashMap<>();
	
	public static boolean isCreate(String memberID) {
		
		if(memberMap.containsKey(memberID)) {
//			RuntimeException memberIdException = new DuplicateMemberIDException(memberID);
//			throw memberIdException;
	
			throw new DuplicateMemberIDException(memberID);	//사용자 예외 사용
//			throw new RuntimeException("이미 가입된 아이디입니다.");
		}
		
		memberMap.put(memberID, " 생성 "+ memberID);
		return memberMap.containsKey(memberID);
	}
	
	public static void main(String[] args) {
		boolean isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		System.out.println("회원가입이 완료되었습니다.");
	}
	
	
}
