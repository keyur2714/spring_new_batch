package com.infotech.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public void createEmployee(Employee employee) {
			
		String SQL="INSERT INTO employee_table(employee_name,salary,email,gender) VALUES(:empName,:sal,:email,:gender)";
	
		Map<String,Object> inputMap = new HashMap<>();
		inputMap.put("empName", employee.getEmployeeName());
		inputMap.put("email", employee.getEmail());
		inputMap.put("sal", employee.getSalary());
		inputMap.put("gender", employee.getGender());
		
		int update = namedParameterJdbcTemplate.update(SQL, inputMap);
		
		if(update == 1){
				System.out.println("Employee is created");
			}
		}
		

	@Override
	public Employee getEmployeeDetailsById(int employeeId) {
		Map<String,Object> inputMap = new HashMap<>();
		inputMap.put("empId", employeeId);
		
		Employee employee = namedParameterJdbcTemplate.queryForObject("SELECT *FROM employee_table WHERE employee_id=:empId", inputMap, new EmployeeRowMapper());
		return employee;
	}

	@Override
	public void updateEmployeeEmailById(int employeeId, String newEmail) {
		String SQL="UPDATE employee_table set email=:newEmail WHERE employee_id=:emp_id";
		
		Map<String,Object> inputMap = new HashMap<>();
		inputMap.put("emp_id", employeeId);
		inputMap.put("newEmail", newEmail);
		
		int update = namedParameterJdbcTemplate.update(SQL, inputMap);
		if(update ==1)
			System.out.println("Email is updated");
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL ="DELETE FROM employee_table WHERE employee_id=:emp_id";
		
		Map<String,Object> inputMap = new HashMap<>();
		inputMap.put("emp_id", employeeId);
		int update = namedParameterJdbcTemplate.update(SQL, inputMap);
		if(update ==1)
			System.out.println("Employee is deleted with ID:"+employeeId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		String SQL="SELECT *FROM employee_table";
		List<Employee> employees = namedParameterJdbcTemplate.query(SQL, new EmployeeRowMapper());
		return employees;
	}

}
