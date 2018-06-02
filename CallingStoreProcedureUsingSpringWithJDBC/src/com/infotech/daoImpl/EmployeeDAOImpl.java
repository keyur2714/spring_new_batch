package com.infotech.daoImpl;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;

	private SimpleJdbcCall simpleJdbcCall = null;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource);
	}


	@Override
	public Employee getEmployeeDetailsById(int employeeId) {
		simpleJdbcCall.withProcedureName("getEmployeeInfoById");
		
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		parameterSource.addValue("emp_id", employeeId);
		
		Map<String, Object> ouputMap = simpleJdbcCall.execute(parameterSource);//Invoking stored proc.
		String empName =(String) ouputMap.get("emp_name");
		Double salary =(Double) ouputMap.get("emp_salary");
		
		Employee employee = new Employee();
		
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(empName);
		employee.setSalary(salary);
		
		return employee;
	}
}
