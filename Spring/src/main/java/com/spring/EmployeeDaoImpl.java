package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void insertEmployee(int empId, String empName, int emp_salary) {
		// TODO Auto-generated method stub
		String SQL = "insert into EmployeeInfo values (?,?,?)";
		jdbcTemplate.update(SQL, empId, empName, emp_salary);
		System.out.println("EmployeeInfo Inserted");
		
	}
	@Override
	public void updateEmployee(int empId, int emp_salary) {
		// TODO Auto-generated method stub
		String SQL = "update EmployeeInfo set emp_salary=? where empId=?";
		jdbcTemplate.update(SQL,emp_salary,empId);
		System.out.println("EmployeeInfo Updated");
		
	}
	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		String SQL = "delete from EmployeeInfo where empId=?";
		jdbcTemplate.update(SQL,empId);
		System.out.println("EmployeeInfo Deleted");
		
	}
	@Override
	public List<Map<String, Object>> listEmployee() {
		// TODO Auto-generated method stub
		String SQL = "select * from EmployeeInfo";
		return jdbcTemplate.queryForList(SQL);
		 
	}
  
}
