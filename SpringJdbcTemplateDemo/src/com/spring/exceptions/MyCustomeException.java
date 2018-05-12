package com.spring.exceptions;

public class MyCustomeException extends Exception{
	
	private String code;
	private String message;
	
	public MyCustomeException() {
		this.code = "101";
		this.message = "Invalid Id";
	}
	
	public String toString() {
		return  "MyCustomException: "+code+" : "+message;
	}

}
