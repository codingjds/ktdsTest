package com.ktdsuniversity.edu.constructor;

public class Doctor {
	
	private String computer;
	private String tool;
	
	public Doctor() {
		this.computer = "없음";
		this.tool = "없음";
	}
	
	public  Doctor(String computer, String tool) {
		this.computer = computer;
		this.tool = tool;
	}
	
	public String examination() {	
		return "의사가 " + this.computer + "와 "+ this.tool + "으로 진찰합니다.";
	}
	
}
