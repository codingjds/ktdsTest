package com.ktdsuniversity.edu.service;

import java.util.List;

import com.ktdsuniversity.edu.dao.ListMemberDAOImpl;
import com.ktdsuniversity.edu.dao.MemberDAO;
import com.ktdsuniversity.edu.vo.MemberVO;

public class SecondMemberServiceImpl implements MemberService {
	
	private MemberDAO memberDAO;
	
	public SecondMemberServiceImpl() {
		//memberDAO = new MapMemberDAOImpl(); //Map,List 왔다갔다 가능
		memberDAO = new ListMemberDAOImpl();
	}
	
	@Override
	public boolean create(MemberVO memberVO) {
		System.out.println("SecondMembeServiceImpl.create");
		return memberDAO.create(memberVO)>0;
	}
	@Override
	public List<MemberVO> readAll() {
		System.out.println("SecondMembeServiceImpl.readAll");
		return memberDAO.readAll();
	}
	@Override
	public MemberVO read(int key) {
		// TODO Auto-generated method stub
		return memberDAO.read(key);
	}
	@Override
	public MemberVO read(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
