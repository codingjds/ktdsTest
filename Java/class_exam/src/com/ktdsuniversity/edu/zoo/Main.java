package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Animal;
import com.ktdsuniversity.edu.zoo.inf.Crawlable;
import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Runable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Main {
	
	public static void run(Animal animal) {
		animal.eat();
		animal.bark();
		if(animal instanceof Walkable) {
			((Walkable) animal).walk();
		}
		if(animal instanceof Runable) {
			((Runable) animal).run();			
		}
		if(animal instanceof Flyable) {
			((Flyable) animal).fly();
		}
		if(animal instanceof Swimable) {
			((Swimable) animal).swim();
		}
		if(animal instanceof Crawlable) {
			((Crawlable) animal).crawl();
		}
	}
	
	public static void main(String[] args) {
		Animal lion = new Lion("메리");
		run(lion);
		Animal duck = new Duck("꽥꽥이");
		run(duck);
		Animal eagle = new Eagle("독수리");
		run(eagle);
//		//인터페이스에 여러개의 상속을 했을 때
//		Animal lion = new Lion("메리");
//		Walkable wLion = new Lion("초코");
//		Runable rLion = new Lion("복실이");
//		Swimable sLion = new Lion("ㅇㅇ");
//		
//		lion.eat();
//		lion.bark();
//		wLion.walk();
//		rLion.run();
//		sLion.swim();
	}
}
