package com.spring.service.impl;

import com.spring.service.IQuestionService;

public class SpringQuestionServiceImpl implements IQuestionService{

	@Override
	public String askQuestion() {
		return "What is Spring framework?";
	}

}
