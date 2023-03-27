package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Duck implements Walkable, Flyable, Swimable{
	
	private String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 이 먹는다.");
	}

	@Override
	public void bark() {
		System.out.println(name + " 가 꽥꽥.");
	}

	@Override
	public void swim() {
		System.out.println(name+ " 수영");
	}

	@Override
	public void fly() {
		System.out.println(name + " 난다");
	}

	@Override
	public void walk() {
		System.out.println(name + " 걷는다");
	}
	
}
