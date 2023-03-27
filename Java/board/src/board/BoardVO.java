package board;

public class BoardVO {
	/*
	 * 과제
	 *    게시판 만들어보기
	 *       게시판의 항목
	 *          -1. 제목
	 *          -2. 작성자
	 *          -3. 순번
	 *          -4. 조회수
	 *       게시판의 기능
	 *          1. 등록
	 *             -제목, 작성자, 순번, 조회수 등록하기
	 *          2. 조회(순번으로 조회)
	 *             -게시글을 조회하면 조회수가 1 증가한다.
	 *             -제목, 작성자, 순번, 조회수 출력하기
	 *          3. 수정
	 *             - 제목만 수정할 수 있다
	 *          4. 삭제
	 *             - 한 게시글만 삭제할 수 있다
	 * 네이버 카페 가입해서 관리자 페이지에 머있는지 확인하기 
	 */
	/**
	 * 제목
	 */
	private String title;
	/**
	 * 작성자
	 */
	private String name;
	/**
	 * 순번
	 */
	private int number;
	/**
	 * 조회수
	 */
	private int view;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	
}

