package com.ktdsuniversity.edu.reference;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	
		List<Integer> intList = new ArrayList<>();
		
		ListHelper listHelper = new ListHelper();
		listHelper.setIntList(intList);
		
		listHelper.addInteger(1);
		listHelper.addInteger(2);
		listHelper.addInteger(3);
		listHelper.addInteger(4);
		listHelper.addInteger(5);
		listHelper.addInteger(6);
		
		//메모리주소를 가져왔다
		List<Integer> list = listHelper.getIntList();
		list.add(7);
		list.add(8);
		list.add(9);
		
		int size = listHelper.getSize();
		System.out.println(size);
		
	}
}
