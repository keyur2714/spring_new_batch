package com.spring.bean;

public class MessageBean {

	private String message;

	public MessageBean(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void initialize() {
		System.out.println("Initialize Message Bean.");
	}
	
	public void destroy() {
		System.out.println("Good Bye...");
	}
}
