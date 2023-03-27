package test;

import java.util.ArrayList;
import java.util.List;

public class Test20208 {
	public static void main(String[] args) {
		//캐스팅해보기
		int subjectA = 80;
		int subjectB = 90;
		int subjectC = 73;
		int subjectD = 80;
		int sum = subjectA+subjectB + subjectC +subjectD;
//		double avg = (double)(subjectA+subjectB + subjectC +subjectD)/4;
		double avg = (double)(sum)/4;
		
		System.out.println("평균 점수는 "+ avg + " 점 입니다.");
		
		
		//배열만들기 
		int[] subject1 = new int[4];
		double [] sumAverage = new double[3];
		String[] subjectName = new String[5];
		
		subject1[0]=80;
		subject1[1]=90;
		subject1[2]=73;
		subject1[3]=80;
		sumAverage[0]=80.6;
		sumAverage[1]=70.9;
		sumAverage[2]=89.7;
		subjectName[0]="영어";
		subjectName[1]="수학";
		subjectName[2]="국어";
		subjectName[3]="물리";
		subjectName[4]="화학";
//		subjectName[-1]="화학";  ==> ArrayIndexOutOfBoundsException
//		subjectName[5]="화학"; ==> ArrayIndexOutOfBoundsException
		
		System.out.println(subject1);
		System.out.println(subject1.length);
		System.out.println(subject1[0]);
		System.out.println(subject1[1]);
		System.out.println(subject1[2]);
		System.out.println(subject1[3]);
		int total = subject1[0]+subject1[1]+subject1[2]+subject1[3];
		System.out.println(total);
		System.out.println(sumAverage);
		System.out.println(subjectName);
		
		
		//리스트 만들기
		List<Integer> subject2 = new ArrayList<>();
		subject2.add(80);
		subject2.add(90);
		subject2.add(73);
		subject2.add(80);
//		System.out.println(subject2.size());//=4
//		subject2.remove(4); ==> IndexOutOfBoundsException 발생
//		subject2.remove(2);
//		subject2.remove(3); ==> IOOBE 발생 List의 index는 빈곳을 채워 당겨지기 떄문
//		subject2.clear();  ==> 전부 삭제
		int result = subject2.get(0);
		result = subject2.get(0);
		result = subject2.get(1);
		result = subject2.get(2);
		System.out.println(result);
		result = subject2.get(3);
//		result = subject2.get(4); ==> IOOBE 발생
		System.out.println(subject2.get(0));
		System.out.println(subject2.size());
		
		
		
		
		
		
		
		
	}
}
