package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeInsert {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(107);
		emp.setEmpName("tukia");
		emp.setSalary(10000.0);
		session.persist(emp);//insert into EmployeeInfo values (?,?,?)
		//session.save(emp);//deprecated in Hibernate 6
		Employee emp1 = new Employee();
		emp1.setEmpId(106);
		emp1.setEmpName("Anita");
		emp1.setSalary(7000.0);
		session.persist(emp1);
		tx.commit();
		session.close();
	}

}