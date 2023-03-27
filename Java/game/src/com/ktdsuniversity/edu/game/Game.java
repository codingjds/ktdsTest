package com.ktdsuniversity.edu.game;

import java.util.Arrays;
import java.util.List;
//자주쓰는 string API
public class Game {
	public static void main(String[] args) {
		
		String str = "        값 값 값         ";
		//문자열에서 좌우 공백 제거하기 .trim
		str = str.trim();
		System.out.println("변경된 값은 ["+str+"] 입니다."); //[값 값 값]
		
		//문자열에서 텍스트변경하기 .replace/.replaceAll 차이점:replaceAll만 정규지원식[]을 지원함
		str = str.replace(" ", "_");
		System.out.println("변경된 값은 ["+str+"] 입니다."); //[값_값_값]
		
		str = str.replaceAll("_", "-");
		System.out.println("변경된 값은 ["+str+"] 입니다."); //[값-값-값]
		//[ ] 범위지정자 , ^빼고 바꿔라
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[가-힣]", ""); //한글만 골라서 공백으로 바꿔라					
		System.out.println("변경된 값은 ["+str+"] 입니다."); //[<html>HTML  .</html>]
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[^가-힣]", ""); //한글만 빼고 공백으로 바꿔라	[문서를작성합니다]
		System.out.println("변경된 값은 ["+str+"] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[a-zA-Z]", ""); //엉어만 골라서 공백으로 바꿔라
		str = str.replaceAll("[^a-zA-Z]", ""); //엉어만 빼고 공백으로 바꿔라
		str = str.replaceAll("[a-zA-Z ]", ""); //엉어와 공백을 골라서 공백으로 바꿔라
		System.out.println("변경된 값은 ["+str+"] 입니다.");
		
		str = "핸드폰 번호는 010-1234-5678 입니다.";
//		str = str.replaceAll("[0-9]", ""); //숫자만 골라서 공백으로 바꿔라	[문서를작성합니다]
		str = str.replaceAll("[^0-9]", ""); //숫자만 빼고 공백으로 바꿔라	[문서를작성합니다]
		System.out.println("변경된 값은 ["+str+"] 입니다.");
		
		
		//문자열에서 특정 단어로 사직하는지 확인하기 .indexOf
		str = "자전거";
		System.out.println("자 의 자리: "+ str.indexOf("자"));	//0
		System.out.println("전 의 자리: "+ str.indexOf("전"));	//1
		System.out.println("거 의 자리: "+ str.indexOf("거"));	//2
		System.out.println("기 의 자리: "+ str.indexOf("기"));	//-1
		
		if(str.indexOf("자")==0) {
			System.out.println("자전거는 \"자\"로 시작합니다.");
		}	//자바 1.6 구버전 용 // 10버전에 추가된것은 .starWith .endWith .contains
		
		//문자열에서 특정 단어로 사직하는지 확인하기 .startWith
		System.out.println("자전거는 \"자\"로 시작하나요? "+ str.startsWith("자"));
		System.out.println("자전거는 \"전\"로 시작하나요? "+ str.startsWith("전"));
		System.out.println("자전거는 \"거\"로 시작하나요? "+ str.startsWith("거"));

		//문자열에서 특정 단어로 끝나는지 확인하기 .lastIndexOf
		str="기러기";
		System.out.println("기러기 \"기\"의 자리는? (indexOf) " + str.indexOf("기") );
		System.out.println("기러기 \"기\"의 자리는? (lastIndexOf) " + str.lastIndexOf("기") );
		System.out.println(str.length());
		System.out.println("기러기는 \"기\"로 끝나나요? "+ (str.lastIndexOf("기")==str.length()-1));
		
		//문자열에서 특정 단어로 끝나는지 확인하기 .endWith
		str="거중기";
		System.out.println("거중기 \"거\"로 끝나나요? " + str.endsWith("거") );
		System.out.println("거중기 \"중\"로 끝나나요? " + str.endsWith("중") );
		System.out.println("거중기 \"기\"로 끝나나요? " + str.endsWith("기") );
		
		
		//문자열에서 특정 단어 및 글자가 포함되어 있는 지 확인하기 .indexOf
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? "+ (str.indexOf("자") > -1));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? "+ (str.indexOf("전") > -1));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? "+ (str.indexOf("거") > -1));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? "+ (str.indexOf("기") > -1));
		
		//문자열에서 특정 단어 및 글자가 포함되어 있는 지 확인하기 .contains
		System.out.println("자전거는 \"자\"가 포함되어 있나요? "+ str.contains("자"));
		System.out.println("자전거는 \"전\"가 포함되어 있나요? "+ str.contains("전"));
		System.out.println("자전거는 \"거\"가 포함되어 있나요? "+ str.contains("거"));
		System.out.println("자전거는 \"기\"가 포함되어 있나요? "+ str.contains("기"));
		
		//문자열 자르기 .substring(p)
		str = "2023-02-03";
		String day = str.substring(5); //입력받은 index부터 끝까지 빼고 다 잘라라
		
		day = day.replace("-", "");
		System.out.println(day);
		
		day = str.substring(5);
		day = day.replaceAll("[^0-9]","");
		System.out.println(day);
		
		
		//문자열 자르기 .substring(p, p) // p(첫번째 인덱스),p(두번쨰 index의 +1)값을 입력해야한다 
		str = "2023-02-03 11:01:15";
		String year = str.substring(0, 4);
		String hour = str.substring(11, 13);
		String minute = str.substring(14, 16);
		String second = str.substring(17, 19);
		System.out.println("=============");
		System.out.println(year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		//문자열 특정 단어 및 기호 등으로 자르기  .split
		str = "자전거 , 거중기 , 기러기";
		List<String> wordList =Arrays.asList(str.split(",")); //split은 배열을 리턴함 //Arrays.asList() 배열이 리스트로 바뀐다.
		System.out.println("=============");
		for(String word : wordList) {
			System.out.println(word.trim());
		}
		str = "2023-02-03 11:22:34";
		List <String> dateList = Arrays.asList(str.split("[- :]"));
		System.out.println("=============");
		for(String dateItem : dateList) {
			System.out.println(dateItem);
		}
		
		System.out.println("=============");
		String url = "https://www.google.co.kr"; //split이 아니라 indexOf,substring으로만 각각 추출해보기
		
		System.out.println(url.indexOf("://"));
		
		String protocol = url.substring(0, url.indexOf("://"));
		System.out.println("Prptocol: "+ protocol);
		
		String subDomain = url.substring(url.indexOf("://")+"://".length(), url.indexOf("."));
		System.out.println("subDomain: "+subDomain);
		
		String domain = url.substring(url.indexOf(subDomain)+subDomain.length()+1);
		domain = domain.substring(0, domain.indexOf("."));
		System.out.println("domain: "+ domain);
		
		String companyCode = url.substring(url.indexOf(domain)+domain.length()+1);
		companyCode = companyCode.substring(0, companyCode.indexOf("."));
		System.out.println("companyCode: "+ companyCode);
		
		String nationCode = url.substring(url.lastIndexOf(".")+1);
		System.out.println("nationCode: "+nationCode);

		
//		내가 해본것
//		//substring
//		String a = url.substring(0, 5);
//		String b = url.substring(8, 11);
//		String c = url.substring(12, 18);
//		String d = url.substring(19, 21);
//		String e = url.substring(22, 24);
//
//		//indexOf(" ")해당 인덱스 불러오기 ==> 정확하게 그것만 가지고 오고 싶다 ->안댐 그건 split으로만!
//		a = url.substring(url.indexOf("h"), url.indexOf("s")+1);
//		b = url.substring(url.indexOf("w"), url.lastIndexOf("w")+1);
//		c = url.substring(url.indexOf("g"), url.indexOf("e")+1); 
//		d = url.substring(url.indexOf("c"), url.lastIndexOf("o")+1); 
//		e = url.substring(url.indexOf("k"), url.indexOf("r")+1); 
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		
		//문자열에서 좌우 공백 제거하기 .trim
				//문자열에서 텍스트변경하기 .replace/.replaceAll
				//문자열에서 특정 단어로 사직하는지 확인하기 .indexOf
				//문자열에서 특정 단어로 사직하는지 확인하기 .startWith
				//문자열에서 특정 단어로 끝나는지 확인하기 .lastIndexOf
				//문자열에서 특정 단어로 끝나는지 확인하기 .endWith
				//문자열에서 특정 단어 및 글자가 포함되어 있는 지 확인하기 .indexOf
				//문자열에서 특정 단어 및 글자가 포함되어 있는 지 확인하기 .contains
				//문자열 자르기 .substring(p)
				//문자열 자르기 .substring(p, p)
				//문자열 특정 단어 및 기호 드응로 자르기  .split
	}
}
