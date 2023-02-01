package com.ktdsuniversity.edu.ext;

public class ExtendsTest {
	
	public static void print(Address address) {
		System.out.println(address.getName());
		System.out.println(address.getPhoneNumber());
		System.out.println(address.getAddress());
		
		//타입캐스팅 , instanceof 등으로 birthday볼수있음
		if(address instanceof Friends) {
			Friends friend = (Friends) address;
			System.out.println(friend.getBirthDay());
		}
	}
	
	public static void main(String[] args) {
		Friends friend = new Friends();
		friend.setName("정덕수");
		friend.setBirthDay("2000-11-11");
		
		//System.out.println(friend.getBirthDay());
		//System.out.println(friend.getName());
		
		print(friend);
		
	}
}
