package com.infotech.serviceImpl;

import java.util.List;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee getEmployeeInfoById(int employeeId) {
		return employeeDAO.getEmployeeDetailsById(employeeId);
	}

	@Override
	public void updateEmployeeEmailById(int employeeId, String newEmail) {
		employeeDAO.updateEmployeeEmailById(employeeId, newEmail);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeDAO.deleteEmployeeById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		return employeeDAO.getAllEmployeeDetails();
	}

}
