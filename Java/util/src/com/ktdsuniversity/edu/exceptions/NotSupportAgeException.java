package com.ktdsuniversity.edu.exceptions;
/**
 * 사용자예외 클래스 ==RuntimeException
 * @author User
 *
 */
public class NotSupportAgeException extends RuntimeException{

	private static final long serialVersionUID = -3071941030476310489L;

	public NotSupportAgeException() {
		super();
	}
	public NotSupportAgeException(String message) {
		super(message);
	}
	
}
