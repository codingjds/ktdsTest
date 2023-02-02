package com.ktdsuniversity.edu.dao;

import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public interface MemberDAO {
	
	public int create(MemberVO memberVO);
	
	public List<MemberVO> readAll();

	//public default void 였으면 문제없지만 리턴타입이 MemberVO이기 떄문에 적어야한다
		public default MemberVO read(int index) {
			return null;
		}
		public default MemberVO read(String id) {
			return null;
		}
		
		
//	public MemberVO read(int key);
//	public MemberVO read(String id);
	
	
	

}
