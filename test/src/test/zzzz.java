package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class zzzz {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> num = new ArrayList<>();
		
		for(int i=0 ; i<50 ; i++) {
			num.add(random.nextInt(50));
		}
		int max = num.get(0);
		int min = num.get(0);
		//최대값
		for(int i=0 ; i< num.size() ; i++) {
			if(num.get(i) >= max) {
				max = num.get(i);
			}
		}
		System.out.println(max);
		
		//최소값
		for(int i=0; i<num.size() ;i++) {
			if(num.get(i) <= min) {
				min = num.get(i);
			}
		}
		System.out.println(min);
		
		//평균값 같은 값을 숫자하나 출력 없으면 0출력
		int sum = 0;
		for( int i=0 ;i<num.size() ; i++) {
			sum += num.get(i);
		}
		int avg = sum/num.size();
		System.out.println(avg);
		for( int i=0 ;i<num.size() ; i++) {
			if(num.get(i)==avg) {
				
				System.out.println(num.get(i)+ " -> "+i );
			}
		}
		
	}
}
