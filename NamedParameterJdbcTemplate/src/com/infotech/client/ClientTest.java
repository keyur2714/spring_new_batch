package com.infotech.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;
import com.infotech.serviceImpl.EmployeeServiceImpl;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		
		//createEmployeeCall(employeeService);
		//getEmployeeByIdCall(employeeService);
		//employeeService.updateEmployeeEmailById(2, "guru.cs@gmail.com");
		//employeeService.deleteEmployeeById(2);
		
		//getAllEmployeesInfoCall(employeeService);
		
		//employeeService.updateEmployeeEmailById(3, "rohit.cs2007@gmail.com");
		
		//employeeService.deleteEmployeeById(3);
		
		getAllEmployees(employeeService);
		context.close();
	
	}

	private static void getAllEmployees(EmployeeService employeeService) {
		List<Employee> empList = employeeService.getAllEmployeeInfo();
		
		for (Employee employee : empList) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getSalary()+"\t"+employee.getGender());
		}
	}

	private static void getAllEmployeesInfoCall(EmployeeService employeeService) {
		List<Employee> empList = employeeService.getAllEmployeeInfo();
		for (Employee employee : empList) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getSalary()+"\t"+employee.getGender());
		}
	}

	private static void getEmployeeByIdCall(EmployeeService employeeService) {
		Employee employee = employeeService.getEmployeeInfoById(1);
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getSalary()+"\t"+employee.getGender());
	}

	private static void createEmployeeCall(EmployeeService employeeService) {
		Employee employee = getEmployeeInfo();
		employeeService.createEmployee(employee);
	}

	private static Employee getEmployeeInfo() {
		Employee employee = new Employee();
		employee.setEmail("rohit@gmail.com");
		employee.setEmployeeName("Rohit");
		employee.setSalary(30000.00);
		employee.setGender("Male");
		return employee;
	}
}
