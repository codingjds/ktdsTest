package com.ktdsuniversity.edu.ext;

/**
 * 주소 관리 클래스
 * @author User
 *
 */
public class Address {
	private String name;
	private String phoneNumber;
	private String address;
	
	public String getName() {
		return name;
	}
	//private defalt protected(상속일때 가능한 접근제한자, 동일패키지안에서만) public
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
