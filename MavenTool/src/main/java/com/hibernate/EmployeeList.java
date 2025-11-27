package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

public class EmployeeList {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Employee>  empList = session.createSelectionQuery("from Employee",Employee.class) 
								 .list();
//		for(Employee emp : empList)
//			System.out.println(emp);
		empList.forEach(System.out::println);
		session.close();

	}

}