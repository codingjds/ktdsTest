package com.ktdsuniversity.edu.method;

public class Welcome {
	
//	public String greeting(String[] message) {
//		
//		return null;
//	} 가변인자와 배열은 받는게 같은 타입이라 오버로딩 불가능
	
	public String greetings(String[] message) {
		String welcomeMessage = "";
		for(String msg : message) {
			welcomeMessage += msg + " 님, ";
		}
		
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	} 
	
	//String... 은 무수히 많이 넣을 수 있다. = 배열 = 가변인자
	public String greeting(String...message) {
		String welcomeMessage = "";
		for(String msg : message) {
			welcomeMessage += msg + " 님, ";
		}
		
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}
	
	public String greeting() {
		return "안녕하세요?";
	}
	
	public String greeting(String name) {
		return name + "님, 안녕하세요";
	}
	
	public String greeting(String name, String message) {
		return name + "님, " + message;
	}
	
	
	
	
}
