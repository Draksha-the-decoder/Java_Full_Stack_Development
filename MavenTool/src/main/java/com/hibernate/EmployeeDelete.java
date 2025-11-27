package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class EmployeeDelete {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//Method1  
		/*Employee emp = new Employee();
		emp.setEmpId(101);
		session.remove(emp);
		//session.delete(emp);//deprecated in Hibernate 6
		 
		 */
		//Method2
		/*Employee emp = session.get(Employee.class,102);
		session.remove(emp);*/
		//Method3 - Deleting multiple persistent objects, cascade delete supported, slow.
		List<Employee> empList = session.createSelectionQuery("from Employee where salary >= :salary",Employee.class) 
									.setParameter("salary",7000.0) 
									.list();
		for(Employee emp : empList)
			session.remove(emp);
		
		// Method 4 using hql cascade delete not supported, fast
//		int deleted = session.createMutationQuery("delete from Employee where salary >= :sal")
//						.setParameter("sal", 6000.0)
//						.executeUpdate();
//		System.out.println(deleted);
		tx.commit();
		session.close();
	}

}