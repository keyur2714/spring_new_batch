DROP PROCEDURE IF EXISTS springwithjdbc.getEmployeeInfoById;
CREATE PROCEDURE springwithjdbc.`getEmployeeInfoById`(IN emp_id INT,OUT emp_name VARCHAR(50),OUT emp_salary DOUBLE )
BEGIN

  SELECT employee_name,salary INTO emp_name,emp_salary  FROM employee_table WHERE employee_id=emp_id;
END;

===========================================================
SQL Command to call store proc from Toad..
call getEmployeeInfoById(4, @emp_name, @emp_salary);

SELECT @emp_name, @emp_salary;