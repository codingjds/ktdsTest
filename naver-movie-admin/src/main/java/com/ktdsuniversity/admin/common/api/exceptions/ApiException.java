package com.ktdsuniversity.admin.common.api.exceptions;

public class ApiException extends RuntimeException {

	private static final long serialVersionUID = -2824305763005783485L;
	
	private String errorCode;
	
	public ApiException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
}
