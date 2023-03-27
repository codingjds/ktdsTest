package com.ktdsuniversity.edu.cafe.menu.mgnt.util;


public class NumberUtil {

	public boolean isNumber(String menu) {
			return menu.matches("[0-9]+");
	}
	
	public boolean isChar(String menu) {
		return menu.matches("[a-zA-Z]");
	}
	
	public boolean isNotNull(String menu) {
		return menu != null;
	}
	
	
}
