package todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoItemService {
	//상수
	//변수
	private List<TodoItemVO> todoItemList; // = new ArrayList<>();
	//생성자
//	public TodoItemService() {
//	}  ==> defalt생성자(기본생성자) ==>다른생성자를 만들면 사라지기때문에 주의! 
	// 매개변수가 달린 생성자를 선언할 때 기본생성자를 따로 적어주는게 좋다
	public TodoItemService() {
		todoItemList = new ArrayList<>(); //초기화는 생성자 안에서 해야한다..why?
	}
	//GetterSetter
	public List<TodoItemVO> getTodoItemList() {
		return todoItemList;
	}
	public void setTodoItemList(List<TodoItemVO> todoItemList) {
		this.todoItemList = todoItemList;
	}
	//Method
	//main
	
	
	/**
	 * 등록
	 * @param name 아이템명
	 */
	public void create(String name) {
		//TodoItemVO todoItem = new TodoItemVO(name);
		//todoItem.setName(name); ==> VO에서 하므로 필요가 없다
		//todoItemList.add(todoItem);
		todoItemList.add(new TodoItemVO(name));
	}
	/**
	 * 수정
	 * @param index 수정할 List Index
	 * @param check 완료여부
	 */
	public void update(int index, boolean check) {
		TodoItemVO todoItem = todoItemList.get(index);
		todoItem.setCheck(check);
//		if(check) {
//			
//			System.out.println("["+"]"+todoItem.getName() + "이 완료되었습니다.");
//		}
//		else {
//			System.out.println(todoItem.getName() + "이 미완료되었습니다.");
//		}
	}
	/**
	 * 삭제
	 * @param index 삭제할 List Index
	 */
	public void delete(int index) {
		TodoItemVO todoItem = todoItemList.get(index);
		if(index>= todoItemList.size()) {
			System.out.println("아이템이 존재하지 않습니다.");
		}
		else {
			todoItemList.remove(index);
			System.out.println("아이템이 삭제되었습니다.");
		}
		//todoItemList.remove(index);
	}
	/**
	 * 조회 (모든 아이템을 조회한다.)
	 */
	public void readAll() {
		for(int i = 0 ; i < todoItemList.size() ; i+=1) {
			TodoItemVO todoItem = todoItemList.get(i);
			if(todoItem.isCheck()) {
				System.out.println("[Y] 아이템명: "+ todoItem.getName());
			}
			else {
				System.out.println("[ ] 아이템명: "+ todoItem.getName());
			}
		}
//강사님	for(TodoItemVO todoItem : todoItemList) {
//방법1		String successSymbol = " " ;
//			if(todoItem.isCheck()){
//				successSymbol = "X";
//			}
//방법2(3항)	String successSymbol = todoItem.isCheck() ? "X" : " " ;		
//			System.out.println("["+successSymbol+"]"+ todoItem.getName());	
//		}
		System.out.println("총"+ todoItemList.size()+ "개의 아이템이 조회되었습니다.");
	}
	
	public static void main(String[] args) {
		TodoItemService todoItemService = new TodoItemService(); //인스턴스화
		//ctrl+ shift + O
		Scanner scan = new Scanner(System.in);

		System.out.println("Todo List");
		while(true) {
			System.out.println("=============");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			System.out.println("=============");
			System.out.println("메뉴를 입력하세요:");
			
			int menu = scan.nextInt();
			scan.nextLine(); //nexInt 다음에 항상 nextLine을 적어서 엔터를 무시하는 코드
			
			if(menu==1) {
				//등록
				System.out.println("TODO 명을 입력하세요.");
				String name = scan.nextLine();		
				todoItemService.create(name);
				System.out.println("아이템이 등록되었습니다.");
			}
			else if(menu==2) {
				//수정
				System.out.println("수정할 아이템 번호를 입력하세요.");
				int index = scan.nextInt();	
				scan.nextLine();
//				todoItemService.todoItemList.get(index);
//강사님					
				int listLength = todoItemService.getTodoItemList().size();
				if(todoItemService.getTodoItemList().isEmpty() || listLength <= index) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					System.out.println("아이템이 완료되었다면 \"Y\"를 입력하세요:");
					String yn = scan.nextLine();
					boolean isY = yn.equalsIgnoreCase("Y");
					todoItemService.update(index, isY);
					//todoItemService.update(index, yn.equlsIgnoreCase("Y")); 대소문자 구분X
					//todoItemService.update(index, yn.toUpperCase.equals("Y")); 전부 대분자로 치환
					//todoItemService.update(index, yn.toLowerCase.equals("Y")); 전부 소문자로 치환
					TodoItemVO todoItem = todoItemService.getTodoItemList().get(index);
					if(isY) {
					
					System.out.println("["+todoItem.getName() + "] 이 완료되었습니다.");
					}
					else {
					System.out.println("["+todoItem.getName() + "] 이 미완료되었습니다.");
					}
				}
				
//				System.out.println("아이템이 완료되었다면 Y를 입력하세요");
//				String check = scan.nextLine();	
//				todoItemService.update(index,true);
				
			}
			else if(menu==3) {
				//삭제			
				System.out.println("삭제할 아이템 번호를 입력하세요.");
				int index = scan.nextInt();	
				scan.nextLine();
				
				int listLength = todoItemService.getTodoItemList().size();
				if(listLength <= index) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					todoItemService.delete(index);
					System.out.println("아이템이 삭제되었습니다.");
				}
			}
			else if(menu==4) {
				//조회
				todoItemService.readAll();
				System.out.println("모든 게시글을 조회했습니다.");
			}
			else {
				//종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}
}
