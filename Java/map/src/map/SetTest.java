package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	//ctrl+shift+r : 파일찾기
	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<>();
		//같은거는 등록이 하나만 된다
		strSet.add("100");
		strSet.add("100");
		strSet.add("100");
		strSet.add("100");
		strSet.add("100");
		strSet.add("100");	//1개
		//등록
		strSet.add("100");
		strSet.add("101");
		strSet.add("102");
		strSet.add("103");
		strSet.add("104");
		strSet.add("105");	//6개

		//strSet.get
		//몇번째 인덱스 가져와라 => 불가능
		//foreach, while로만 가능하다! 뭐가 있는지만 볼수있고 한건한건만 볼수는 없다
//		for(String str:strSet) {
//			System.out.println(str);
//		}
		
		//strSet.iterator()  반복을 지원 , 다음꺼 있는지 물어볼수있다
		Iterator<String> iterStr = strSet.iterator() ;
		while(iterStr.hasNext()) {
			System.out.println(iterStr.next());
		}
		
//		if(iterStr.hasNext()) {
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());//if 에러발생 NoSuchElementException
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//			System.out.println(iterStr.next());
//		}//hasNext 다음거 있는지에 대한 boolean타입 T/F
		
		
		System.out.println(strSet.size());
	}
}
