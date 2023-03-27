package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Eagle implements Flyable, Walkable{
	private String name;
	
	public Eagle(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + "이 먹는다");
	}

	@Override
	public void bark() {
		System.out.println(name + " 끼룩끼룩");
	}

	@Override
	public void walk() {
		System.out.println(name + " 걷는다");
	}

	@Override
	public void fly() {
		System.out.println(name + " 난다");
	}
	
}
