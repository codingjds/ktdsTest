package com.ktdsuniversity.edu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePlay {
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		List<String> wordList = new ArrayList <>();
		String startLetter = "";
		
		System.out.println("끝말잇기 시작");
		while(true) {
			if(startLetter.equals("")) {
				System.out.println("시작단어를 입력하시오.");
			}
			else {
				System.out.println("\""+startLetter + "\"로 시작하는 단어를 입력하세요.");
			}
			
			String word = scan.nextLine();
			word = word.trim();  			// "___a___b__"  => a___b
			word = word.replace(" ", "");	// 			     ==>"ab"
			
			if(word.length() < 3) {
				if(!word.startsWith(startLetter) || word.equals("포기")) {
					System.out.println("\""+ word + "\"를 입력하였습니다.");
					System.out.println("게임이 종료됩니다.");
					break;
				}
				System.out.println("\""+ word + "\"는" + word.length() +" 글자입니다. 3글자 이상 단어를 입력하세요.");
			}
			else if( ! word.startsWith(startLetter) || word.equals("포기")) {
				System.out.println("\""+ word + "\"를 입력하였습니다.");
				System.out.println("====게임이 종료됩니다.====");
				break;
			}
			else {
					wordList.add(word);
					startLetter = word.substring(word.length()-1); //(끝번호) =>시작부터 입력된 끝번호까지 가져와라
		//			startLetter = word.substring(2,4); // 2번index부터 4번index까지 가져와라
					//최소 8자리 최대19자리 날짜 시간 ==> substring을 많이 쓴다 20230203 223-02-03_09:37:58
			}
		}
		System.out.println("입력한 단어들은");
		int i=0;
		for(String word: wordList) {
			i+=1;
			if(i%2!=0) {
				System.out.println(i+" 선공 : "+word);	
			}
			else {
				System.out.println(i +" 후공 : "+word);									
			}
	
		}	
	}
}
