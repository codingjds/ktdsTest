package com.ktdsuniversity.edu.exceptions;
/**
 * 사용자 예외는 반드시 RuntimeException을 상속받는다
 * @author User
 *
 */
public class DuplicateMemberIDException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 300748820639462251L;
	//클럽스퍼링?? 객체가 가지는 고유의 아이디
	
	//사용자 예외는 필요에 따라 생성자를 Overriding 한다
	
	public DuplicateMemberIDException(String memberID) {
		super(memberID); //부모생성자 호출
	}
	
	
}










