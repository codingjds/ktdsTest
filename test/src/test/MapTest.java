package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Java", 80);
		scores.put("C", 90);
		scores.put("C#", 97);
		scores.put("Python", 93);
		
		System.out.println(scores);
//		System.out.println(scores.containsKey("Java")); ==> true 불린형
		scores.put("Java", 90);
		System.out.println(scores);
		System.out.println(scores.get("Java"));
		System.out.println(scores.size());
		
		int javaScore = scores.get("Java");
		//반환타입 int				key의 제네릭타입만 가능
		System.out.println(javaScore);
		
		//없는 key값의 value를 가져다 할당했을 때
//		int fake = scores.get("f"); ==> NullPointException 발생 : Reference type인데 내부적으로 int로 변환하려다가 발생 
//		System.out.println(fake);
		
//		System.out.println(scores.get("f"));  ==> 에러발생X , 출력값 = null

		//이런 문제를 안전하게 처리하는 방법
		boolean isContains = scores.containsKey("F");
		System.out.println(isContains);
		
		int fScore=0;
		if(isContains) {
			fScore = scores.get("F");
		}
		System.out.println(fScore);
		
		scores.remove("C");
		System.out.println(scores);
		scores.remove("f");
		scores.clear();
		System.out.println(scores);
		
		
		
		
		
		
		
	}
}
