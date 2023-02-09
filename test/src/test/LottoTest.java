package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		//1~44 사이의 랜덤 값 가져오기
		Random random = new Random();
//		int randomNumber = random.nextInt(45)+1; // random.nextInt(45) = 0부터 44까지 무작위 숫자
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45)+1;
		
		List<Integer> lotto = new ArrayList<>();
		
//		lotto.add(random.nextInt(45)+1);
//		lotto.add(random.nextInt(45)+1);
//		lotto.add(random.nextInt(45)+1);
//		lotto.add(random.nextInt(45)+1);
//		lotto.add(random.nextInt(45)+1);
//		lotto.add(random.nextInt(45)+1); ==> 중복값이 나올수 있다
				
//stream에서도 list에서도 .contains() 있다  ==> 중복값없이 만들기
		int randomNumber = random.nextInt(45)+1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45)+1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45)+1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45)+1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45)+1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45)+1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		//중복된 값이 나오면 생성되는 데이터개수가 적어질 수 도 있다
		System.out.println("=========================");
		if(lotto.size()>0) {
			System.out.println(lotto.get(0));
		}
		if(lotto.size()>1) {
			System.out.println(lotto.get(1));
		}
		if(lotto.size()>2) {
			System.out.println(lotto.get(2));
		}
		if(lotto.size()>3) {
			System.out.println(lotto.get(3));
		}
		if(lotto.size()>4) {
			System.out.println(lotto.get(4));
		}
		if(lotto.size()>5) {
			System.out.println(lotto.get(5));
		}
		if(lotto.size()>6) {
			System.out.println(lotto.get(6));
		}
//		System.out.println(lotto.get(0));
//		System.out.println(lotto.get(1));
//		System.out.println(lotto.get(2));
//		System.out.println(lotto.get(3));
//		System.out.println(lotto.get(4));
//		System.out.println(lotto.get(5));
		
		
		
		
	}
	
	
}












