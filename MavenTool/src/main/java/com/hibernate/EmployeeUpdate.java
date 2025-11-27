package com.hibernate;

 import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class EmployeeUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//Method1  based on primary key, slow but uses cascade rule
//		 Employee emp = session.get(Employee.class,101);//select * from employeeinfo where empId=101;
//		emp.setSalary(8500.0);
//		session.merge(emp); //session.update(emp); deprecated in Hibernate 6
		 
		 
		//Method2 - Using HQL (Hibernate Query Language) - applied on Model (POJO class), not on table. based on query, fast but no cascade rule is used
		int updated = session.createMutationQuery("update Employee set salary=:sal where empId>=:empId") 
				.setParameter("sal",7000.0) 
				.setParameter("empId",105) 
				.executeUpdate();
		System.out.println(updated);
		
		tx.commit();
		session.close();
	}

}