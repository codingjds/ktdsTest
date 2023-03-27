package com.ktuniversity.edu.todo.vo;

public class TodoVO {
	
	//멤버변수
	private String itemName;
	private boolean isSuccess;
	
	//생성자
	public TodoVO(String itemName) {
		setItemName(itemName);
	}
	
	//getter/setter
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
}
