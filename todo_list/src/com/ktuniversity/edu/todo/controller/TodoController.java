package com.ktuniversity.edu.todo.controller;

import java.util.List;
import java.util.Scanner;

import com.ktuniversity.edu.todo.service.TodoService;
import com.ktuniversity.edu.todo.vo.TodoVO;

public class TodoController {
	
	//dsdsd
	
	public static void main(String[] args) {
		
		TodoService service = new TodoService();
		
		/**
		 * 1.등록
		 * 2.조회(1건)
		 * 3.조회(모든 건)
		 * 4.수정
		 * 5.삭제(1건)
		 * 6.삭제(모든건)
		 * 7.종료
		 */
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("=============");
			System.out.println("1. 등록");
			System.out.println("2. 선택조회");
			System.out.println("3. 전부조회");
			System.out.println("4. 수정");
			System.out.println("5. 선택삭제");
			System.out.println("6. 전부삭제");
			System.out.println("7. 종료");
			System.out.println("=============");
			System.out.println("메뉴를 입력하세요:");
		
			int menu = scan.nextInt();
			scan.nextLine();
			
			if(menu == 1) {
				System.out.println("TODO 명을 입력하세요.");
				String todo = scan.nextLine();
				if(service.create(todo)) {
					System.out.println("아이템이 등록되었습니다.");
				}
			}
			else if(menu == 2) {
				System.out.println("조회할 TODO key를 입력하세요.");
				int key = scan.nextInt();
				scan.nextLine();
				TodoVO todoVO = service.read(key);
				//TODO 출력문 쓸자리
			}
			else if(menu == 3) {
				List<TodoVO> todoList = service.readAll();
				//TODO 출력문 자리
			}
			else if(menu == 4) {
				System.out.println("수정할 TODO key를 입력하세요.");
				int key = scan.nextInt();
				scan.nextLine();
				
				TodoVO todo = service.read(key);
				if(todo == null) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					
					boolean isSuccess = false;
					
					if(todo.isSuccess()) {
						//이미 완료된 건
						System.out.println("이미 완료된 건입니다. 미완료로 변경할까요? (Y/N)");
						String yn = scan.nextLine();
						if(yn.equalsIgnoreCase("Y")) {
							isSuccess = service.update(key, false);
						}
					}
					else {
						//완료되지 않은 건
						System.out.println("미완료된 건입니다. 완료로 변경할까요? (Y/N)");
						String yn = scan.nextLine();
						if(yn.equalsIgnoreCase("Y")) {
							isSuccess = service.update(key, true);
						}
					}
					if(isSuccess) {
						System.out.println("처리되었습니다.");
					}	
				}//수정여부확인
			}//menu==4
			else if(menu == 5) {
				System.out.println("삭제할 TODO key를 입력하세요.");
				int key = scan.nextInt();
				scan.nextLine();
			}
			else if(menu == 6) {
					
			}
			else if(menu == 7) {
					System.out.println("종료되었습니다.");
			}
		}
	}
}
