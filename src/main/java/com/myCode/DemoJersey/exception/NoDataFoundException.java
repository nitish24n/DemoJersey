package com.myCode.DemoJersey.exception;

public class NoDataFoundException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public NoDataFoundException(String str) {
		super(str);
	}

}
