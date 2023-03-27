package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BaseballStream1 {
	
	public static List <AllStarFullVO> readAllStarFull() {
		try {
			List<AllStarFullVO> list = Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\AllstarFull.csv"))
					.stream()
					.skip(1) //첫번째 라인은 건너뛰어라
//					.peek(System.out :: println) //에러라인 확인하기위해
					.map( (line) ->{
						String[] strArr = line.split(",");
						AllStarFullVO vo = new AllStarFullVO();
						vo.setPlayerID(strArr[0]);
						vo.setYear(strArr[1]);
						vo.setGameNum(Integer.parseInt(strArr[2]));
						vo.setGameID(strArr[3]);
						vo.setTeamID(strArr[4]);
						vo.setLgID(strArr[5]);
						vo.setGp(Integer.parseInt(strArr[6]));
						if(strArr.length == 8) {
							vo.setStartingPos(Integer.parseInt(strArr[7]));							
						}
						else {
							vo.setStartingPos(0);
						}
						return vo;
					})
					.collect(Collectors.toList());
			return list;
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			return new ArrayList<>();	//실무 스타일
//			return List.of();
		}
		
	}
	
	public static void main(String[] args) {
		List<AllStarFullVO>list = readAllStarFull();
//		System.out.println(list.size());
//forEach	(- consumer -void)	
		list.stream()
			.filter( (vo) -> vo.getYear().equals("1933") )	//filter - predicate - boolean
			.forEach( (vo) -> {
				System.out.println(vo.getPlayerID());
				System.out.println(vo.getYear());
			});
//collect		
		List <AllStarFullVO> playIn1933 = list.stream()
											  .filter( (vo) -> vo.getYear().equals("1933"))
											  .collect(Collectors.toList());
//findFirst
		AllStarFullVO vo1 = list.stream()
							   .filter( (vo) -> vo.getYear().equals("1933"))
							   .findFirst() //최종 연산
//							   .get();	//Optional의 메소드
							   .orElse(new AllStarFullVO()); //.orElse() == 데이터가 없으면 ()안에 값을 리턴해라
//NullPointeException 절대 발생 X, catch해서도 안됨
//Optional : null일수도 있고 아닐수도 있어 /안전하게 처리가능
		System.out.println(vo1.getPlayerID());

		
System.out.println("====선수이름 중복제거 .distinct() 정렬 .sorted================");
//선수이름 중복제거 .distinct()	정렬 .sorted
		List<String> playerNameList = list.stream()
										  .map( (allStarVO) -> allStarVO.getPlayerID() )
										  .distinct()
										  .sorted()
										  .collect(Collectors.toList());
//		playerNameList.forEach(System.out :: println);
		
		
System.out.println("====연도에 관계없이 이름이 f로 시작하는 데이터 모두 출력================");
//연도에 관계없이 이름이 f로 시작하는 데이터 모두 출력해보기	시작한다 문자열API
		list.stream()
			.filter( (allStarVO) -> allStarVO.getPlayerID().toUpperCase().startsWith("F"))
			//필터를 여러개 쓸수있다 ex)이중필터,삼중필터 ...
			.forEach( (allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
			});
		
		
System.out.println("====2004년도 경기중 팀명이 텍사스인것 만====");
//2004년도 경기중 팀명이 텍사스인것 만		
		list.stream()
			.filter( (allStarVO) -> allStarVO.getYear().equals("2004"))
			.filter( (allStarVO) -> allStarVO.getTeamID().equals("TEX"))
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			});
		
		
System.out.println("====연도와 팀관계없이 startingPos가 0인것만 출력====");		
//연도와 팀관계없이 startingPos가 0인것만 출력
		list.stream()
			.filter( (allStarVO) -> allStarVO.getStartingPos()==0)
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			});

System.out.println("==gp=0, 팀아이디는 NYA, 플레이아이디에 \"FO\"포함되어있으면 모두 출력===");		
//gp=0, 팀아이디는 NYA, 플레이아이디에 "FO"포함되어있으면 모두 출력	
		list.stream()
			.filter( (allStarVO) -> allStarVO.getTeamID().equals("NYA"))
			.filter((allStarVO) -> allStarVO.getPlayerID().toUpperCase().contains("FO"))
			.filter( (allStarVO) -> allStarVO.getGp()==0)
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
			});
		
System.out.println("==startingPos=4 인 플레이어 아이디만 추출 , 중복제거, 정렬	==");		
//startingPos=4 인 플레이어 아이디만 추출 , 중복제거, 정렬		
		list.stream()
			.filter((allStarVO) -> allStarVO.getStartingPos()==4)
			.map( (allStarVO) -> allStarVO.getPlayerID())
			.distinct()
			.sorted()
			.forEach((allStarVO)-> {
				System.out.println(allStarVO);
			});

//1.gameNum이 0이 아닌 것을 추출해 출력하세요		
//2.gameNum이 0인 것을 추출해 출력하세요		
		List <AllStarFullVO> zeroNum =list.stream()
			.filter((allStarVO)-> allStarVO.getGameNum()==0)
			.collect(Collectors.toList());
		zeroNum.forEach((allStarVO)->{
			System.out.println(allStarVO.getGameID());
		});
//3.1950년대에 플레이한 선수들의 이름을 출력하세요
		
//4.2000년대 BOS팀의 선수이름을 중복제거한 후 출력하세요
		list.stream()
			.filter(allStarVO->allStarVO.getYear().startsWith("200"))
			.map(allStarVO->allStarVO.getPlayerID())
			.distinct()
			.forEach(System.out::println);
//			.forEach(avo->{
//				System.out.println(avo +"====");
//			});
//5. 1937년 DET 팀의 선수중 첫번쨰 선수 이름을 출력하세요
System.out.println("========");
		AllStarFullVO detList = list.stream()
			.filter(allStarVO->allStarVO.getYear().equals("1937"))
			.filter(vo->vo.getTeamID().equals("DET"))
			.findFirst()
			.orElse(new AllStarFullVO());
		System.out.println(detList.getPlayerID());
//6.GP 1, startingPos가 3인 선수의 이름을 출력하세요
//7. BOS팀에 있는 선수는 총 몇명인가요?
//8. 이름이 foxx로 시작하는 선수의 플레이 연도를 중복제거한후 출력하세요
		list.stream()
			.filter( vo -> vo.getPlayerID().startsWith("foxx"))
			.map( vo -> vo.getYear())
			.distinct()
			.forEach(System.out::println);
//9. lombaer01 선수는 몇년도에 어는 팀에서 플레이했나요
		list.stream()
			.filter( vo -> vo.getPlayerID().equals("lombaer01"))
			.forEach(vo-> {
				System.out.println(vo.getYear()+vo.getTeamID());
			});
System.out.println("===========");			
		list.stream()
			.filter( vo -> vo.getPlayerID().equals("lombaer01"))
			.map(vo -> vo.getYear()+vo.getTeamID())
			.forEach(System.out::println);
//10.muncyma01 선수의 year, startingPos와 teamID 를 출력하세요
//11.2015년에 hernafe02 선수는 몇번 출전했나요?
		list.stream()
			.filter(vo -> vo.getYear().equals("2015"));
////			.filter(vo -> )
//12.ATL팀이 몇년도에 경기에 출전했나요?		
//		list.stream()
//			.filter(vo -> vo.getTeamID().equals("ATL"))
//			.map(vo -> vo.getYear())
//			.forEach( year -> System.out.println(year));

			
System.out.println("=========");			
//13. W로 시작하는 팀은 몇년도에 몇경기에 출전했나요?
//14. GP와 startingPos가 모두0인 선수 중 PHA팀에 소속했던 선수는 누구인가요?
//15. playerID의 자리수가 8자리인 선수의 활동연도를 중복제거하여 출력하세요
		list.stream()
			.filter(vo -> vo.getPlayerID().length()==8)
			.map(vo -> vo.getYear())
			.distinct()
			.forEach(System.out::println);
//16. playerID의 값이 02 또는 03으로 끝나는 선수의 팀코드를 중복제거하고 정렬하여 출력하세요			
		list.stream()
			.filter(vo -> vo.getPlayerID().endsWith("03")||vo.getPlayerID().endsWith("02"))
			.map(vo -> vo.getTeamID())
			.distinct()
			.sorted()
			.forEach(System.out::println);
			
//17. lgID의 값이 AL, GameID는 60으로 끝나며 소속팀은 DET, playerID는 f로 시작하며 첫번쨰 선수의 playerID출력하고
//만약 존재하지 않는다면 "없음"을 출력하세요
		Optional <String> fPlayer =list.stream()
										.filter( vo -> vo.getLgID().equals("AL"))
										.filter(vo -> vo.getGameID().endsWith("60"))
										.filter(vo -> vo.getTeamID().equals("DET"))
										.filter(vo -> vo.getPlayerID().startsWith("f"))
										.map(vo -> vo.getPlayerID())
										.findFirst();
System.out.println(fPlayer.orElse("없음"));

			
			
			
			
			
	}
	
}
