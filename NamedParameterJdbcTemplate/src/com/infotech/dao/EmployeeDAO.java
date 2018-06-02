package com.infotech.dao;

import java.util.List;

import com.infotech.model.Employee;

public interface EmployeeDAO {

	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeDetailsById(int employeeId);
	public abstract void updateEmployeeEmailById(int employeeId,String newEmail);
	public abstract void deleteEmployeeById(int employeeId);
	public abstract List<Employee> getAllEmployeeDetails();
}
