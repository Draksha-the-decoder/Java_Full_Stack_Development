package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");//load jdbc configurationfile
		EmployeeDao dao = (EmployeeDao) context.getBean("employee");
//		dao.insertEmployee(101,"Raj",2000);
//		dao.updateEmployee(101,2200);
//		dao.deleteEmployee(101);
		List<Map<String,Object>> empList = dao.listEmployee(); 
		for(Map emp : empList)
		{
			System.out.println(emp.get("empId")+" "+emp.get("empName")+" "+emp.get("emp_salary"));
		}
	}

}