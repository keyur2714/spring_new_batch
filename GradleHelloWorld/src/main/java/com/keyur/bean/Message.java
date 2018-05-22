package com.keyur.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	@Value("Good After noon..!")
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
