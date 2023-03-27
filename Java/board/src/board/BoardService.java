package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
	 /*       게시판의 기능
	 *          1. 등록
	 *             -제목, 작성자, 순번, 조회수 등록하기
	 *          2. 조회(순번으로 조회)
	 *             -게시글을 조회하면 조회수가 1 증가한다.
	 *             -제목, 작성자, 순번, 조회수 출력하기
	 *          3. 수정
	 *             - 제목만 수정할 수 있다
	 *          4. 삭제
	 *             - 한 게시글만 삭제할 수 있다
	 */
	private List<BoardVO> boardList = new ArrayList<>();
	int i =1;
	/**
	 * 게시글 등록
	 * 순번은  boardList의 size로 생성하고
	 * 조회수는 0으로 초기화
	 * @param title
	 * @param name
	 */
	public void create(String title, String name) {
		BoardVO gag = new BoardVO();
		gag.setName(name);
		gag.setTitle(title);
		gag.setNumber(i++); //gag.setNumber(++i); == i=i+1;
		//++ -- 되도록 쓰지않고 i+=1 을 권장한다(강사님)
		//int view= boardVO.getView();
		gag.setView(0);
		boardList.add(gag);
		System.out.println("게시물이 생성되었습니다.");
	}
	//index ==> 순번 중복을 막기위해 고유번호를 따로 생성
	/**
	 * 게시물 조회
	 * @param number 조회하려는 게시글의 순번
	 */
	public void read(int number) {
		if(boardList.size() <= number) {
			System.out.println(number + "번 게시글은 존재하지 않습니다.");
			return;
		}
		BoardVO gag = boardList.get(number);
		gag.setView(gag.getView()+1);
		System.out.println("게시물을 불러왔습니다.");
		System.out.println("순번: "+ gag.getNumber());
		System.out.println("제목: "+ gag.getTitle());
		System.out.println("작성자: "+ gag.getName());
		System.out.println("조회수: "+ gag.getView()+"\n"); 
	}
	
	public void readAll() {
		for(int i = 0 ; i < boardList.size() ; i+=1) {
			BoardVO board = boardList.get(i);
			board.setView(board.getView()+1);
			System.out.println("순번: "+ board.getNumber());
			System.out.println("제목: "+ board.getTitle());
			System.out.println("작성자: "+ board.getName());
			System.out.println("조회수: "+ board.getView()+"\n");
			board.setView(board.getView()+1);
		}
	}
	
	public void readAllWithOutIndex() {
		for(BoardVO board : boardList) {
			System.out.println("순번: "+ board.getNumber());
			System.out.println("제목: "+ board.getTitle());
			System.out.println("작성자: "+ board.getName());
			System.out.println("조회수: "+ board.getView()+"\n");
			board.setView(board.getView()+1);
		}
	}
	/**
	 * 게시물 수정
	 * 제목만 수정할 수 있다.
	 * @param number 게시글의 순번
	 * @param title 제목
	 */
	public void update(int number, String title) {
		System.out.println("게시물이 수정되었습니다.");
		BoardVO gag = boardList.get(number); 
		gag.setTitle(title);
	}
	/**
	 * 게시물 삭제
	 * 한 건의 게시글만 삭제할 수 있다.
	 * @param number
	 */
	public void delete(int number) {
		boardList.remove(number);
	}
	
	public static void main(String[] args) {
		
		BoardService handler = new BoardService();
		//ctrl+ shift + O
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			
			int menu = scan.nextInt();
			scan.nextLine();
			
			if(menu==1) {
				//등록
				System.out.println("제목을 입력하세요.");
				String title = scan.nextLine();	
				System.out.println("작성자를 입력하세요.");
				String name = scan.nextLine();		
				
				handler.create(title,name);
				System.out.println("게시글이 등록되었습니다.");
			}
			else if(menu==2) {
				//수정
				System.out.println("수정할 게시글의 순번을 입력하세요.");
				int number = scan.nextInt();	
				scan.nextLine();
				System.out.println("수정할 제목을 입력하세요.");
				String title = scan.nextLine();	
				handler.update(number, title);
				
			}
			else if(menu==3) {
				//삭제			
				System.out.println("삭제할 게시글의 순번을 입력하세요.");
				int number = scan.nextInt();	
				handler.delete(number);
				System.out.println("삭제되었습니다.");
				
			}
			else if(menu==4) {
				//조회
				handler.readAll();
				System.out.println("모든 게시글을 조회했습니다.");
			}
			else {
				//종료
				System.out.println("종료합니다");
				break;
			}
			
		}
		
		
//		handler.create("웃긴 사진", "홍길동");
//		handler.create("웃긴 동영상", "이순신");
//		handler.create("웃긴 짤", "김유신");
//		
//		handler.read(2);
//		handler.read(2);
//		handler.update(2, "안웃긴 짤");
//		handler.read(2);
//		
//		handler.read(0);
//		handler.read(0);
//		handler.delete(2);
//		handler.read(2);
//		
//		System.out.println("===============");
//		System.out.println("FOR");
//		handler.readAll();
//		
//		System.out.println("===============");
//		System.out.println("FOR EACH");
//		handler.readAllWithOutIndex();
	}
	
}
