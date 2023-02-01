package lotto;

public class Lotto {
	
	public static void main(String[] args) {
		
		int [] lottoArray = new int[7];
		lottoArray[0]= 5;
		lottoArray[1]= 15;
		lottoArray[2]= 27;
		lottoArray[3]= 34;
		lottoArray[4]= 36;
		lottoArray[5]= 41;
		lottoArray[6]= 42;
		
		/* 
		 * 똑같은 문장 패턴을 가지고 반복 ==> 반복문
		 * System.out.println(lottoArray[0]); System.out.println(lottoArray[1]);
		 * System.out.println(lottoArray[2]); System.out.println(lottoArray[3]);
		 * System.out.println(lottoArray[4]); System.out.println(lottoArray[5]);
		 */
		
		// 전통적인 for
		for(int index=0 ; index < lottoArray.length ; index += 1) {
			//반복 문장
			System.out.println("index: "+index+ " => "+lottoArray[index]);
			//System.out.printf("index: %d => %d  \n",index,lottoArray[index]);
		
		}
		// 성능이 빠른 foreach
		//  int number:lottoArray ==> lottoArray에 있는 것을 하나씩 순서대로 꺼내어 number에 가져온다
		//  index가 없으므로 index 정보 필요없을때 사용
		for(int number : lottoArray) {
			System.out.println("번호는 "+ number);
		}
		
		
		
		String string ="여기에 당장 입을 옷들만 넣어두었고 한동안 여기서 자고 출근했다. \r\n"
				+ "[출처] 8.내 집을 갖기까지- 안방과 드레스룸|작성자 수정";
			
		String[] wordArray = string.split(" "); //split 리턴타입 : 배열 []
		System.out.println(wordArray.length);
		
		for(int i=0 ; i<wordArray.length ; i++) {			
			//네글자 이상만 출력할때
			int len = wordArray[i].length();
			if(len > 3) {
				System.out.println("인덱스:"+i+"  "+wordArray[i]);				
			}
		}
		
		for(String text : wordArray) {
			System.out.println(text);
		}
		
		
		
		
		
		/*
		 * int i=0; while(i<lottoArray.length) { System.out.println("index: "+ i +
		 * " = "+ lottoArray[i]); i +=1; }
		 */
		
		// 0~100사이 홀수만 출력
		/*
		 * for(int index=0; index<50; index++) { System.out.println("index: "+ index
		 * +"=>"+ lottoArray[2*index+1]); }
		 */
		
		/*
		 * //홀수 for(int i = 0 ; i < 100; i+= 1) { if(i % 2 == 1) {
		 * System.out.println("홀수: " + i); } } //짝수 for(int i = 0 ; i < 100; i+= 1) {
		 * if(i % 2 == 0) { System.out.println("짝수: " + i); } }
		 */
			
		
		
	}
	
}
