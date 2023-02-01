package com.ktdsuniversity.edu.vo;

public class MemberVO extends AbstractVO {
	/**
	 * 회원 아이디
	 */
	private String id;
	/**
	 * 회원 비밀번호
	 */
	private String password;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
