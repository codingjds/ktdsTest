package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxMinAvg {
	public static void main(String[] args) {
		
		Random random = new Random();
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			num.add(random.nextInt(50));
		}
		int max = num.get(0);
		int min = num.get(0);
		
		//최댓값
		for(int i=0; i < num.size(); i++) {
			if(num.get(i) >= max) {
				max = num.get(i);
			}
		}
		System.out.println("최댓값: "+max);
		
		//최솟값
		for(int i = 0; i < num.size(); i++) {
			if (num.get(i) <= min) {
				min = num.get(i);
			}
		}
		System.out.println("최솟값: "+min);
		
		//평균값 같은 값을 숫자하나 출력 없으면 0출력
		int sum = 0;
		for(int i = 0; i < num.size(); i++) {
			sum += num.get(i);
		}
		
		int avg = sum/num.size();
		System.out.println(avg);
		
		if(!num.contains(avg)) {
			System.out.println("0");
		}
		else {
			for(int i = 0; i < num.size(); i++) {
				if (num.get(i) == avg) {		
					System.out.println("평균값과 같은 값은 "+num.get(i)+ " -> "+i +"번째 인덱스");
					break;
				}
			}			
		}
		
	}
}
