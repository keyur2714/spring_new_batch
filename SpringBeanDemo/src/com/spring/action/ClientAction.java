package com.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.MessageBean;

public class ClientAction {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean messageBean = (MessageBean) applicationContext.getBean("messageBean");
		
		System.out.println(messageBean.getMessage());
		
		messageBean.setMessage("Hi..");
		
		MessageBean messageBean1 = (MessageBean) applicationContext.getBean("messageBean");
		
		System.out.println(messageBean1.getMessage());
		
		MessageBean messageBean2 = (MessageBean) applicationContext.getBean("messageBean");
		
		System.out.println(messageBean2.getMessage());
		
		applicationContext.registerShutdownHook();
	}

}
