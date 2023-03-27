package com.hello.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.member.dao.MemberDAO;
import com.hello.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public boolean createNewMember(MemberVO memberVO) {
		// 1. email이 DB에 존재하는 지 확인
		int emailCount = memberDAO.readCountMemberByEmail(memberVO.getEmail());
		
		int insertCount = 0;
		// 2. 없다면 DB에 insert를 요청한다.
		if(emailCount == 0) {
			insertCount = memberDAO.createNewMember(memberVO);
		}
		
		// 3. 있다면 false를 리턴한다
		return insertCount > 0;
	}

	@Override
	public MemberVO readOneMemberByEmailAndPassword(MemberVO memberVO) {
		return memberDAO.readOneMemberByEmailAndPassword(memberVO);
	}

}
