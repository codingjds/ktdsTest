package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BigdataStream1 {
	public static List<TextVO> readTextFile(){
		String filePath = "C:\\Devs\\data\\bigdata\\10K.ID.CONTENTS";
		try {
			List<TextVO> list = Files.readAllLines(Paths.get(filePath))
									 .parallelStream()
									 .map( (line) -> {
										 String[] strArr = line.split("\t");
										 TextVO vo = new TextVO();
										 vo.setKey(strArr[0].trim());
										 if(strArr.length>=2) {
											 vo.setValue(strArr[1].trim());
										 }
										 return vo;
									 })
									 .collect(Collectors.toList());
			return list;
		}
		catch(IOException ioe){
			return new ArrayList<>();
		}
	}
	public static void main(String[] args) {
		List<TextVO> textList = readTextFile();
		System.out.println(textList.size());
		
		long startTime = System.currentTimeMillis();
		//코드작성.
		//8-1. 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		Optional<String> contents = textList.stream()
									  .filter(vo -> vo.getKey().equals("12370584"))
									  .map(vo -> vo.getValue())
									  .findFirst();
		System.out.println(contents.orElse("없음"));
		System.out.println("8-1  실행시간: "+(System.currentTimeMillis()-startTime));
		
		//8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		
		startTime = System.currentTimeMillis();
		
		contents = readTextFile().parallelStream()
							.filter(vo -> vo.getKey().equals("12370584"))
							.map(vo -> vo.getValue())
							.findFirst();
		System.out.println(contents.orElse("없음"));
		System.out.println("8-2  실행시간: "+(System.currentTimeMillis()-startTime));
						   
		
		//9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇개의 단어가 있는지 출력
		startTime = System.currentTimeMillis();
		
		Optional<Integer> content = readTextFile().parallelStream()
											.filter(vo -> vo.getKey().equals("7670637"))
											.map(vo -> vo.getValue().split(" ").length)
											.findAny();			
		System.out.println(content);
		System.out.println("9  실행시간: "+(System.currentTimeMillis()-startTime));
		
/*		String abc = null;
 * 		abc = null =>true
 * 		abc = "" => true
 * 		abc = " " => false
 * 		abc = "aaa" => false
 * 		boolean isEmpty = abc ==null || abc.length() == 0;
 *   	abc = null =>true
 * 		abc = "" => true
 * 		abc = " " => true
 * 		abc = "aaa" => false
*		boolean isEmpty = abc ==null || abc.trim().length() == 0;
*/
		//10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇개인지 출력
		startTime = System.currentTimeMillis();
		long contents1 = readTextFile().parallelStream()
												.filter( vo -> vo.getValue() == null || vo.getValue().trim().length() == 0)
												.map( vo -> vo.getKey())
												.count();										
		System.out.println(contents1);
		System.out.println("10  실행시간: "+(System.currentTimeMillis()-startTime));
		
		//11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇개인지 출력
		startTime = System.currentTimeMillis();
				contents1 = readTextFile().parallelStream()
										  .filter( vo -> !(vo.getValue() == null || vo.getValue().trim().length() == 0))
										  .filter( vo -> vo.getValue().split(" ").length == 2 )
										  .map( vo -> vo.getKey())
										  .count();
		System.out.println(contents1);
		System.out.println("11  실행시간: "+(System.currentTimeMillis()-startTime));
		
		//12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 내용에 "that"이 포함된 글은 몇개인지 출력 (indexof ,contains)
		startTime = System.currentTimeMillis();
		contents1 = readTextFile().parallelStream()
								  .filter( vo -> !(vo.getValue() == null || vo.getValue().trim().length() == 0))
								  .filter( vo -> vo.getValue().contains("that"))
								  .map( vo -> vo.getKey())
								  .count();
		System.out.println(contents1);
		System.out.println("12  실행시간: "+(System.currentTimeMillis()-startTime));
		
		//13. (병렬) 10K.ID.CONTENTS 파일에서 글번호가 6자리인 것은 몇개인지 출력 (문자열의 길이)
		contents1 = readTextFile().parallelStream()
								  .filter( vo -> !(vo.getValue() == null || vo.getValue().trim().length() == 0))
								  .filter( vo -> vo.getKey().length() == 6)
								  .map( vo -> vo.getKey())
								  .count();
		System.out.println(contents1);
		System.out.println("13  실행시간: "+(System.currentTimeMillis()-startTime));
		
		//14. (병렬) 10K.ID.CONTENTS 파일에서 글번호가 7자리인 것은 몇개인지 출력
		contents1 = readTextFile().parallelStream()
//				  .filter( vo -> !(vo.getValue() == null || vo.getValue().trim().length() == 0))
				  .filter( vo -> vo.getKey().length() == 7)
				  .map( vo -> vo.getKey())
				  .count();
		System.out.println(contents1);
		System.out.println("14  실행시간: "+(System.currentTimeMillis()-startTime));
		
		//15. (병렬) 10K.ID.CONTENTS 파일에서 글번호가 9로 시작하는 모든 글들의 첫번째 단어만 출력
		List<String> contents2 = readTextFile().parallelStream()
					.filter(vo -> vo.getKey().startsWith("9"))
					.map( vo -> vo.getValue() == null ? "" : vo.getValue())
					.map( desc -> desc.trim().contains(" ") ? desc.split(" ")[0] : "")
					.collect(Collectors.toList());
//					forEach(word -> {
//						 System.out.println("15-1. ["+word+"]");
//					});
		contents2.forEach(System.out::println);
		
//		readTextFile().parallelStream()
//		.filter(vo -> vo.getKey().startsWith("9"))
//		.map( vo -> vo.getValue() == null ? "" : vo.getValue())
//		.map( desc -> desc.trim().contains(" ") ? desc.split(" ")[0] : "")
//		.forEach(word -> {
//			 System.out.println("15-1. ["+word+"]");
//		});
		
//		readTextFile().parallelStream()	
//				.filter(vo -> vo.getKey().startsWith("9"))
//				.map(vo ->{
//					if(vo.getValue() == null) {
//						return "";
//					}
//					return vo.getValue().trim();
//				})
//				.map(desc -> {
//					if(desc.trim().contains(" ")) {
//						return desc.trim().split(" ")[0];
//					}
//					return "";
//				})
//				.forEach(word -> {
//					System.out.println("15-2. ["+ word + "]");
//				});
		
//		readTextFile().parallelStream()	
//		.filter(vo -> vo.getKey().startsWith("9"))
//		.map(vo ->{
//			if(vo.getValue() != null && vo.getValue().trim().length()>0) {
//				return vo.getValue().trim().split(" ")[0];
//			}
//			return "";
//		})
//		.forEach(word -> {
//			System.out.println("15-3. ["+ word + "]");
//		});
		
		
		System.out.println("15  실행시간: "+(System.currentTimeMillis()-startTime));
		
		
		//16. (병렬) 10K.ID.CONTENTS 파일에서 내용이 있으면 글번호가 7로 시작하는 모든 글들의 첫번쨰 단어만 출력
		List<String> contents3 = readTextFile().parallelStream()
									.filter( vo -> !(vo.getValue() == null || vo.getValue().trim().length() == 0))
									.filter( vo -> vo.getKey().startsWith("7"))
									.map( vo -> vo.getValue().substring(0, vo.getValue().indexOf(" ")+1))//indexof 없으면 -1
									.collect(Collectors.toList());
		System.out.println(contents3);
		System.out.println("16  실행시간: "+(System.currentTimeMillis()-startTime));
		
	}
}



































