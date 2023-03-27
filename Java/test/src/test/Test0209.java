package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Test0209 {
	public static void main(String[] args) {
		//4가지 과목의 평균을 구하시오
		//배열
		int[] scores = new int[4];
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 77;
		scores[3] = 96;
		
		int sum = scores[0] + scores[1] + scores[2] + scores[3];
		double avg = (double)sum / scores.length;
		System.out.println("배열 : "+avg);
	
		
		//list
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(77);
		scoreList.add(96);
		
		sum = scoreList.get(0) + scoreList.get(1) + scoreList.get(2) + scoreList.get(3);
		avg = (double)sum / scoreList.size();
		System.out.println("List : "+avg);
		
		
		//Map
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("수학", 90);
		scoreMap.put("물리", 80);
		scoreMap.put("영어", 77);
		scoreMap.put("프로그래밍", 96);
		
		sum = scoreMap.get("수학") + scoreMap.get("물리") + scoreMap.get("영어") + scoreMap.get("프로그래밍");
		avg = (double)sum / scoreMap.size();
		System.out.println("Map : "+avg);
		
		
		//제어문 
		int age = 30;
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년입니다.");
		}
		
		
		if (avg >= 90) {
			System.out.println("A");
		}
		else if (avg >= 80){
			System.out.println("B");
		}
		else if (avg >= 70){
			System.out.println("C");
		}
		else if (avg >= 60){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		String grade = "";
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80){
			grade = "B";
		}
		else if (avg >= 70){
			grade = "C";
		}
		else if (avg >= 60){
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println(grade);
		
		//A학점의 조건 1. 평균이 90이 넘어야한다 2. 지각 결석이 0회여야한다
		//평균-boolean , 지각결석 - boolean  &&
		int late = 0;
		boolean isAvg90 = avg > 90 ;
		boolean isLate0 = late == 0 ;
		System.out.println("A학점 조건은 평균 90이상 그리고 지각결석횟수 0회");
		if(isAvg90 && isLate0) {
			System.out.println(avg +"-> 학점 : A");
		}
		else {
			System.out.println("평균점수: " + avg + " 지각결석 횟수: " + late + "이므로 A학점이 아닙니다.");
		}
		
		//영화 18000 나이 12세 이상
		int price = 18000;
		age = 12;
		boolean fullPrice = price >= 18000;
		boolean isAgeOver12 = age >= 12; 
		if (fullPrice && isAgeOver12) {
			System.out.println("영화 관람이 가능합니다.");
		}
		
		//학점 기준 95이상 A+/90이상 A/85이상 B+/80이상 B/70이상 C/60이상 D/ F
		int score = 99;
		grade = "F";
		
		if (score <= 100 && score >=95) {
			grade = "A+";
		}
		else if(score < 95 && score >=90){
			grade = "A";
		}
		else if(score < 90 && score >=85){
			grade = "B+";
		}
		else if(score < 85 && score >=80){
			grade = "B";
		}
		else if(score < 80 && score >=70){
			grade = "C";
		}
		else if(score < 70 && score >=60){
			grade = "D";
		}
		
		//반복문
		int loopCount = 1;
		while (loopCount <= 3) {
			age = 17;
			if (age >= 19) {
				System.out.println("성인입니다.");
			}
			else {
				System.out.println("미성년입니다.");
			}
			loopCount += 1;	
		}
		//반복문에서 4개 과목 합계 구하기
		//반복문 밖에 평균, 학점
		List<Integer> gradeScore = new ArrayList<>();
		gradeScore.add(100);
		gradeScore.add(95);
		gradeScore.add(90);
		gradeScore.add(85);
		gradeScore.add(80);
		gradeScore.add(70);
		gradeScore.add(60);
		List<String> gradeType = new ArrayList<>();
		gradeType.add("A+");
		gradeType.add("A");
		gradeType.add("B+");
		gradeType.add("B");
		gradeType.add("C");
		gradeType.add("D");
		
		for(int i = 0 ; i < 6 ; i++) {
			if(score < gradeScore.get(i) && score >= gradeScore.get(i+1)) {
				System.out.println(gradeType.get(i));
			}			
		}
		
//		fourScoreList.add(80);
//		fourScoreList.add(90);
//		fourScoreList.add(100);
//		fourScoreList.add(80);
		
		List<Integer> fourScoreList = new ArrayList<>();
		Random random = new Random();		
		for (int i = 0 ; i < 4 ; i++) {
			fourScoreList.add(random.nextInt(101));
		}
		
		int sumScore = 0;
		for (int i = 0 ; i < fourScoreList.size() ; i++) {
			sumScore += fourScoreList.get(i) ;
		}
		double avgScore = (double)sumScore/fourScoreList.size(); 
		
		
//		if(score <= gradeScore.get(0) && score >= gradeScore.get(1)) {
//			System.out.println(gradeType.get(0));
//		}			
//		for(int i = 1 ; i < 5 ; i++) {
//			if(fourScoreList.get(i) < gradeScore.get(i) && fourScoreList.get(i) >= gradeScore.get(i+1)) {
//				System.out.println(gradeType.get(i));
//			}			
//		}
		
		//반복문에서 4개 과목 합계 구하기s
		//반복문 밖에 평균, 학점
		
//		int index=0;
//		while(index<100) {
//			System.out.println(index);
//			index+=1;
//		}
		
		for(int i = 0 ; i < 100 ; i++) {
			if (i % 5 == 0) {
				if(i != 5) {
					System.out.println(i);									
				}
			}	
		}
		for(int i = 0 ; i < 100 ; i++) {
			if( i == 0) {
				System.out.println(i+" 은 0입니다.");
			}
			else if(i % 2 == 0 ) {
				System.out.println(i+" 은 짝수입니다.");
			}
			else if(i % 2 == 1) {
				System.out.println(i+" 은 홀수입니다.");
			}
		}
		//정수형 배열 인덱스의 개수는 50개
		int[] number = new int[50];
		Random random2 = new Random();	
		//값을 할당
		for(int i = 0 ; i < 50 ; i++) {
			number[i] = random2.nextInt(50);
		}
		System.out.println("------------");
		//값을 참조
		for(int i = 0 ; i < 50 ; i++) {
//			System.out.println(number[i]);	
			if (((number[i] % 3) == 0 ) && (number[i] != 0)) {
				System.out.println(number[i]);
			}
		}
		
		
		
		
		
		
		
		
	}
}



























