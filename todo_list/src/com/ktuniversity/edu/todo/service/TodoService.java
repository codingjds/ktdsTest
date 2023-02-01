package com.ktuniversity.edu.todo.service;

import java.util.List;

import com.ktuniversity.edu.todo.dao.TodoDAO;
import com.ktuniversity.edu.todo.vo.TodoVO;

public class TodoService {

	private TodoDAO todoDAO;
	
	public TodoService() {
		todoDAO = new TodoDAO();
	}
	
	//등록
	public boolean create(String itemName) {
		return todoDAO.create(itemName) > 0 ;
	}
	//조회1건
	public TodoVO read(int key) {
		return todoDAO.read(key);
	}
	//조회모든건
	public List<TodoVO> readAll(){
		return todoDAO.readAll();
	}
	//수정
	public boolean update(int key, boolean isSuccess) {
		return todoDAO.update(key, isSuccess) > 0;
	}
	//삭제1건
	public boolean delete(int key) {
		return todoDAO.delete(key) > 0;
	}
	//삭제모든건
	public boolean deleteAll() {
		return todoDAO.deleteAll() > 0;
	}
	
	
}
