package com.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;
import com.spring.service.impl.EmployeeServiceImpl;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeServiceImpl",EmployeeService.class);
		
		Employee employee = applicationContext.getBean("employee",Employee.class);
		
		employee.setName("Vinit");
		
		Employee employee1 = applicationContext.getBean("employee",Employee.class);
		
		System.out.println(employee1.getName());
		
		System.out.println(employee.getName());
		employeeService.save(employee);
		
	}

}
