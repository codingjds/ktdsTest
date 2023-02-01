package board;

import java.util.ArrayList;
import java.util.List;

/**
 * 게시판 기능 서비스
 * @author User
 *
 */
public class BoardServiceTeacher {

	/**
	 * 게시글 목록
	 */
	private List<BoardVOTeacher> boardList = new ArrayList<>();
	
	/**
	 * 게시글 등록
	 * 순번은 boardList 의 size로 생성을 하고
	 * 조회수는 0으로 초기화 한다.
	 * @param subject 제목
	 * @param writer 작성자
	 */
	public void create(String subject, String writer) {
		BoardVOTeacher boardVOTeacher = new BoardVOTeacher();
		boardVOTeacher.setNumber(boardList.size());
		boardVOTeacher.setSubject(subject);
		boardVOTeacher.setWriter(writer);
		boardVOTeacher.setReadCount(0);
		boardList.add(boardVOTeacher);
	}
	
	/**
	 * 게시글 수정
	 * 제목만 수정할 수 있다.
	 * @param index 게시글의 인덱스
	 * @param subject 제목
	 */
	//index ==> 순번 중복을 막기위해 고유번호를 따로 생성
	public void update(int index, String subject) {
		BoardVOTeacher boardVOTeacher = boardList.get(index);
		boardVOTeacher.setSubject(subject);
	}
	
	/**
	 * 게시글 삭제
	 * 한 건의 게시글만 삭제할 수 있다.
	 * @param index 삭제하려는 게시글의 인덱스
	 */
	//index ==> 순번 중복을 막기위해 고유번호를 따로 생성
	public void delete(int index) {
		boardList.remove(index);
	}
	
	/**
	 * 게시글 조회
	 * @param index 조회하려는 게시글의 인덱스
	 */
	//index ==> 순번 중복을 막기위해 고유번호를 따로 생성
	public void read(int index) {
		
		if (boardList.size() <= index) {
			System.out.println(index + "번 게시글은 존재하지 않습니다.");
			return;
		}
		
		BoardVOTeacher boardVOTeacher = boardList.get(index);
		int readCount = boardVOTeacher.getReadCount();
		readCount += 1;
		//readCount++;
		boardVOTeacher.setReadCount(readCount);
		
		System.out.println("순번: " + boardVOTeacher.getNumber());
		System.out.println("제목: " + boardVOTeacher.getSubject());
		System.out.println("작성자: " + boardVOTeacher.getWriter());
		System.out.println("조회수: " + boardVOTeacher.getReadCount());
	}
	
	public static void main(String[] args) {
		BoardService boardService = new BoardService();
		boardService.create("첫 번째 게시글", "장민창");
		boardService.create("두 번째 게시글", "장민창");
		boardService.create("세 번째 게시글", "장민창");
		boardService.create("네 번째 게시글", "장민창");
		boardService.create("다섯 번째 게시글", "장민창");
		boardService.create("여섯 번째 게시글", "장민창");
		
		boardService.read(0);
		boardService.read(1);
		boardService.read(2);
		boardService.read(3);
		boardService.read(4);
		boardService.read(5);
		
		boardService.update(1, "수정한 게시글 원래는 두 번째 게시글");
		boardService.read(1);
		
		boardService.delete(5);
		
		boardService.read(0);
		boardService.read(1);
		boardService.read(2);
		boardService.read(3);
		boardService.read(4);
		boardService.read(5);
	}
}