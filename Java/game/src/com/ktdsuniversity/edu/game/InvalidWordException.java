package com.ktdsuniversity.edu.game;
/**
 * 3자리 미만의 단어를 입력했을 경우 던질 예외
 * @author User
 *
 */
public class InvalidWordException extends RuntimeException{

	private static final long serialVersionUID = 6332300988141330482L;
	
	public InvalidWordException() {
		super();
	}
	
	
}
