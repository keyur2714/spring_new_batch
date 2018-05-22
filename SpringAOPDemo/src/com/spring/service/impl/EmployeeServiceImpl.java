package com.spring.service.impl;

import org.springframework.stereotype.Service;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	public void save(Employee employee) {
		System.out.println(employee);
	}
	
}
