package com.ktuniversity.edu.todo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktuniversity.edu.todo.vo.TodoVO;

public class TodoDAO {
	
	//Map에서 데이터 삭제시 새로 등록되는 데이터가 번호가 중복되면 합쳐진다 
	//그런 문제점을 방지하기위해 공유메모리(static) 사용
	private static int count = 1;
	
	private Map<Integer, TodoVO> dataSource;
	//기본생성자
	public TodoDAO() {
		dataSource = new HashMap<>();
	}
	//메소드  DAO는 리턴할 타입이 정해져있다.
	//등록
	public int create(String itemName) {
		dataSource.put(count++, new TodoVO(itemName));
		return 1;
	}
	//조회(1건)
	public TodoVO read(int number) {
		return dataSource.get(number);
	}
	//조회(모든건)
	public List<TodoVO> readAll() {
		return dataSource.entrySet()
							.stream()
							.map(entry -> entry.getValue())
							.collect(Collectors.toList());
						//Spring FrameWork ==함수가 파라미터로 전달된다 함수지향언어(자바1.8~)
	}
	//수정(1건)
	public int update(int key, boolean isSuccess) {
		TodoVO todoVO = dataSource.get(key);
		todoVO.setSuccess(isSuccess);
		return 1;
	}
	//삭제(1건)
	public int delete(int key) {
		dataSource.remove(key);
		return 1;
	}
	//삭제(모든건)
	public int deleteAll() {
		int size = dataSource.size();
		dataSource.clear();
		return size;
	}
	
	
}
