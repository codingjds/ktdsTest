package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseballStream2 {
	
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
		
		//1. 1933년 NYA팀의 세번째 선수의 playerID 출력하기
//		Optional<String> playerId = list.stream()
//										.filter( vo -> vo.getYear().equals("1933"))
//										.filter( vo -> vo.getTeamID().equals("NYA"))
////										.peek(System.out::println)
//										.map(vo -> vo.getPlayerID())
//										.skip(2)
//										.limit(1)
//										.findFirst();
////		System.out.println(playerId.orElse("없음"));
		
		
		//2. 1700년 NYA팀의 세번쨰 선수의 playerID를 출력 (어떻게 변하는지보기위해 다쪼개기)
//		Stream<AllStarFullVO> listStream = list.stream();
//		Stream<AllStarFullVO> playersIn1700 = listStream.filter(vo -> vo.getYear().equals("1700"));
//		Stream<AllStarFullVO> playersInNYA = playersIn1700.filter(vo -> vo.getTeamID().equals("NYA"));
//		Stream<String> playersId = playersInNYA.map(vo -> vo.getPlayerID());
//		Stream<String> skipedPlayersId = playersId.skip(2);
//		Stream<String> limitedPlayersId = skipedPlayersId.limit(1);
//		Optional<String> playerId = limitedPlayersId.findFirst();
//		System.out.println(playerId.orElse("없음"));
//		
		
		//3. 1934년 CHA 팀에서 startingPos가 8인 선수의 playerID를 출력
		Optional<String> playerIdInCHA = list.stream()
										.filter( vo -> vo.getYear().equals("1934"))
										.filter( vo -> vo.getTeamID().equals("CHA"))
										.filter( vo -> vo.getStartingPos()==8)
										.map( vo -> vo.getPlayerID())
										.findFirst();
		System.out.println(playerIdInCHA.orElse("없음"));
										
		
		//4. 1934년 CHA 팀에서 startingPos가 8인 두번째 선수의 playerID를 출력
		Optional<String> playerIdInCHASecond = list.stream()
										.filter( vo -> vo.getYear().equals("1934"))
										.filter( vo -> vo.getTeamID().equals("CHA"))
										.filter( vo -> vo.getStartingPos()==8)
										.map( vo -> vo.getPlayerID())
										.skip(1)
										.findFirst();
		System.out.println(playerIdInCHASecond.orElse("없음"));
		
		//5. gomezle01 선수가 속한 팀의 매니저 playerID를 출력(flatMap)
		//맵 내부에서 stream을 리턴한다 ==> flatMap : 거의안쓰임
		Optional<String> managerId = list.stream()
										 .filter( vo -> vo.getPlayerID().equals("gomezle01"))
										 .map( vo -> vo.getTeamID())
										 .flatMap( teamId -> {
											 String path = "C:\\Devs\\data\\baseball\\core\\Managers.csv";
											 String searchTeamId = "," + teamId + ",";
											 try {
												 return Files.readAllLines(Paths.get(path))
														 	  .stream()
														 	  .filter( line -> line.contains(searchTeamId))
														 	  .map(line -> line.split(",")[0]);
											 }	catch(IOException e){
												 return Stream.empty();
											 }
										 })
										 .findFirst();
		System.out.println(managerId.orElse("없음"));
		
		//5-1. 1933년에 출전한 TeamID별 playerId를 모두 출력 (group)
		Map<String,List<AllStarFullVO>> teamMap1 = list.stream()
									.filter( vo -> vo.getYear().equals("1933"))
										.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
								//		.collect(Collectors.groupingBy(vo -> vo.getTeamID()));
//		System.out.println(teamMap1);	팀이름(key)별 선수이름들 포함 전부(value,List) 		

		teamMap1.forEach((teamId, players) -> {		
			//방법1 List니깐 stream으로 출력하기
			players.stream()
			.map( vo -> vo.getPlayerID())
			.forEach((playerId1) -> {
//				System.out.println("5-1. "+ teamId + " > " + playerId1);
			});
			//방법2 Map-forEach-Biconsumer 
			for (AllStarFullVO allStarFullVO : players) {
//				System.out.println("5-1. "+ teamId + " > " + allStarFullVO.getPlayerID());
			}
		});
		
		
		//5-2. 1933년에 출전한 TeamID별 playerId의 수를 모두 출력 (group)
		Map<String,List<AllStarFullVO>> teamMap2 = list.stream()
														.filter( vo -> vo.getYear().equals("1933"))
														.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
												//		.collect(Collectors.groupingBy(vo -> vo.getTeamID()));
		
		teamMap2.forEach((teamId, players) -> {			//map->forEach :BiConsumer 파라미터 2개
			
			for (AllStarFullVO allStarFullVO : players) {
//				System.out.println("5-1. "+ teamId + " > " + players.size());
			}
		});
		
		
		//6. TeamID별 출전 연도를 모두 출력 (group)
			/*
			 * 6. NYA > 1933
			 * 6. NYA > 1933
			 * 6. NYA > 1933
			 * 6. NYA > 1933
			 * 6. NYA > 1934
			 * 6. NYA > 1935
			 * 6. NYA > 1935
			 */
		Map<String,List<AllStarFullVO>> teamMap3 = list.stream()
													   .collect(Collectors.groupingBy( vo -> vo.getTeamID()));
		teamMap3.forEach((teamId, players) -> {			//map->forEach :BiConsumer 파라미터 2개
			//방법1. 중복제거할대 유용
			players.stream()
			.map( vo -> vo.getYear())
			.forEach( (year) -> {
				System.out.println("6. "+teamId + " > "+ year);
			});
			//방법2.
			for (AllStarFullVO allStarFullVO : players) {
//				System.out.println("6. "+ teamId + " > " + allStarFullVO.getYear());
			}
		});
		
		
/*		
		String teamMap3 = list.stream() ==> 이럴때 에러가 뜬곳에 커서두고 컨트롤+1 누르면 핫픽스된다 
				.collect(Collectors.groupingBy( vo -> vo.getTeamID()));
*/
		
		
		//7. TeamID별 출전 연도를 중복제거하여 모두 출력 (group)
		Map<Object, List<AllStarFullVO>> teamMap4 = list.stream()
														.collect(Collectors.groupingBy(vo -> vo.getTeamID()));
		//Map형식이 아닌 List형식 이용 -> distinct사용가능
		teamMap4.forEach((teamId, players) -> {			
			players.stream()
			.map( vo -> vo.getYear())
			.distinct()
			.forEach( (year) -> {
				System.out.println("6. "+teamId + " > "+ year);
			});
		});
		
		
		//8-1. 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		//8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		//9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇개의 단어가 있는지 출력
		//10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇개인지 출력
		//11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇개인지 출력
		//12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 내용에 "that"이 포함된 글은 몇개인지 출력
		//13. (병렬) 10K.ID.CONTENTS 파일에서 글번호가 6자리인 것은 몇개인지 출력
		//14. (병렬) 10K.ID.CONTENTS 파일에서 글번호가 7자리인 것은 몇개인지 출력
		//15. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		//16. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		//17. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		
		
	}
		
	
	
	
	
	
	
}
