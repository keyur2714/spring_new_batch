package com.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.ExamService;

public class ClientAction {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbeans.xml");
		
		ExamService examService = applicationContext.getBean("examService",ExamService.class);
		
		examService.startExam();
		
	}

}
