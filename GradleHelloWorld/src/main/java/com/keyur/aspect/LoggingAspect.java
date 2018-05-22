package com.keyur.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	
	@Pointcut("execution(public String getMessage())")
	public void getNamePointcut(){}
	
	@Before("getNamePointcut()")
	public void startLog() {
		System.out.println("Enter into Method");
	}
	
	@After("execution(public String getMessage())")
	public void endLog() {
		System.out.println("Exit From Method");
	}
	
	@Around("execution(* com.keyur.bean.*.setMessage(..))")
	public void changeMessageAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("@Around: Before calculation-"+ new Date());
		Object args[] = joinPoint.getArgs();
		System.out.println(args[0]+" ==========");
		joinPoint.proceed(args);		
		args[0] = "sachin";
		System.out.println("@Around: After calculation-"+ new Date());
		System.out.println(args[0]);
	}
	
}
