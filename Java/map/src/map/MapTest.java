package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
//		List<String> a;
		//Map<String, Integer> map = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		map.put("Java", 100);
		map.put("C", 90);
		map.put("C#", 80);
		map.put("Python", 70);
		map.put("Languages", new ArrayList<>()); //value의 타입을 클래스로 넣고싶을때 Object로 하면 가능하다
		
		//map에 뭐가 있는지 확인용 keySet
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+"=>"+map.get(key));
		}
		
		
		System.out.println("java\t"+ map.get("Java"));
		System.out.println("C\t"+ map.get("C"));
		System.out.println("C#\t"+ map.get("C#"));
		System.out.println("Python\t"+ map.get("Python"));
		System.out.println("Languages\t"+ map.get("Languages"));
		System.out.println("Scala\t"+ map.get("Scala"));
		//!true == false
		//!false == true
		//containsKey 일치여부판단
		if(!map.containsKey("Python")) {
			map.put("Python", 100);			
		}
		System.out.println("Python\t"+ map.get("Python"));
		
		map.remove("C#");
		//map.remove(key, value); 둘다만족할떄 지워라--잘안씀
		System.out.println("C#\t"+ map.get("C#"));

		System.out.println(map.size());
		
		Map<Integer, List<String>> matrix= new HashMap<>();
		//텍스트 분석할때 주로 쓰이고 보통 안쓰임
		
		List<String> aList =new ArrayList<>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		
		matrix.put(0, aList);
		matrix.put(1, aList);
		matrix.put(2, aList);
		System.out.println(matrix.size());
		for(int i=0 ; i<3 ;i++) {
			System.out.println(matrix.get(i));	
		}
		System.out.println(matrix);
		
		//ctrl+shift+r : 파일찾기
		
	
	}
	
}
