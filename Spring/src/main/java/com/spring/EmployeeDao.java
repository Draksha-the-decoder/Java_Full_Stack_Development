package com.spring;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
	public void insertEmployee(int empId, String empName, int emp_salary);
	public void updateEmployee(int empId, int emp_salary);
	public void deleteEmployee(int empId);
	public List<Map<String,Object>> listEmployee();

}
