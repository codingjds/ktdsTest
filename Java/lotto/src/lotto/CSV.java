package lotto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSV {
	
	public static void main(String[] args) {
		
		//파일을 읽어온다.
		try {
			List<String> csv = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\점수표.csv"));
//*			for(String line : csv) {
			for(int i=0 ; i<csv.size() ; i+=1) {
				if(i==0) {
					continue; //i가 0이면 내려가지말고 바로 위로 다시 올라가라
					//break;  중단하고 끝내버려라
				}
			//라인별로 반복한다.
				//System.out.println(line);
					
				// 라인을 ","로 분리한다.
					String[] strArr = csv.get(i).split(","); //* line.split(",");
				/*
				 * strArr[0] = Java 
				 * strArr[1] = 100
				 * strArr[2] = A+
				 */
				// 분리된 텍스트를 반복하여 출력한다.
//*				for(String word : strArr) {
//*					System.out.println(word);
//*				}
				System.out.println( strArr[0] + " 과목의 점수는  " 
								  + strArr[1] + "점이고 등급은 "
								  + strArr[2] + "입니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
