package com.spring.service.impl;

import com.spring.service.IQuestionService;

public class BigDataQuestionServiceImpl implements IQuestionService{

	@Override
	public String askQuestion() {
		return "What is Hadoop?";
	}

}
