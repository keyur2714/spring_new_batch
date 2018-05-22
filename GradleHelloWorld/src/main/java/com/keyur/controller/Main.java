package com.keyur.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.keyur.bean.Message;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Message message = applicationContext.getBean("message",Message.class);
		
		message.setMessage("Hi...");
		
		System.out.println(message.getMessage());
		
	}

}
