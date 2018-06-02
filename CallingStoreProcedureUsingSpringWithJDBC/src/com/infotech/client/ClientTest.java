package com.infotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;
import com.infotech.serviceImpl.EmployeeServiceImpl;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		
		getEmployeeByIdCall(employeeService);
		context.close();
	
	}

	private static void getEmployeeByIdCall(EmployeeService employeeService) {
		Employee employee = employeeService.getEmployeeInfoById(1);
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getSalary()+"\t"+employee.getGender());
	}
}
