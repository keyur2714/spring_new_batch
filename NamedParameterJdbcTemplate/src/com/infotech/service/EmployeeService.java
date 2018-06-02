package com.infotech.service;

import java.util.List;

import com.infotech.model.Employee;

public interface EmployeeService {
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeInfoById(int employeeId);
	public abstract void updateEmployeeEmailById(int employeeId,String newEmail);
	public abstract void deleteEmployeeById(int employeeId);
	public abstract List<Employee> getAllEmployeeInfo();

}
