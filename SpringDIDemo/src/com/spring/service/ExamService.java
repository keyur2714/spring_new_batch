package com.spring.service;

public class ExamService {

	private IQuestionService questionService;

	public void setQuestionService(IQuestionService questionService) {
		System.out.println("Hi");
		this.questionService = questionService;
	}

	public void startExam() {
		System.out.println(questionService.askQuestion());
	}

}
