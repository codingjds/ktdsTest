package com.ktdsuniversity.edu.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.vo.MemberVO;

public class MapMemberDAOImpl implements MemberDAO{

	private Map<String, MemberVO> dataSource;
	
	public MapMemberDAOImpl() {
		dataSource = new HashMap<>();
	}
	
	@Override
	public int create(MemberVO memberVO) {
		 dataSource.put(memberVO.getId(), memberVO);
		 return 1;
	}

	@Override
	public List<MemberVO> readAll() {
		return dataSource.entrySet()
						.stream()
						.map(entry -> entry.getValue())
						.collect(Collectors.toList());
	}
	
	@Override
	public MemberVO read(String id) {
		return dataSource.get(id);
	}
	//MemberDAO에서 read메소드를 public defalt 해서 바디{}를 생성하면
	//오버라이딩할떄 불필요한 메소드가 줄어든다
	
	
//	@Override
//	public MemberVO read(String id) {
//		return dataSource.get(id);
//	}
//	@Override
//	public MemberVO read(int key) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
