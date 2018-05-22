package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspectPointcut {
	
	@Before("getNamePointcut()")
	public void loggingAdvice(){
		System.out.println("Executing loggingAdvice on getName()");
	}
	
	@Before("getNamePointcut()")
	public void beforeSave() {
		System.out.println("Before Save");
	}
	
	@After("allMethodsPointcut()")
	public void allServiceMethodAdvice() {
		System.out.println("Execute After Each Method of Service is execute");
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut(){}
	
	@Pointcut("execution(public void save(..))")
	public void allMethodsPointcut(){}
}
