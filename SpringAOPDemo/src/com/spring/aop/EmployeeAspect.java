package com.spring.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class EmployeeAspect {
	
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getName() Method");
	}
	
	@Before("execution(* com.spring.service.*.save*(..))")
	public void getAllAdvice(){
		System.out.println("Service method called");
	}
		
}
