package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		Product prod = new Product();
		// prod.setProductId(111);  automatically generated if annotations is provided
//		prod.setProductName("mobile");
//		prod.setPrice(7000);
//		session.persist(prod);
 	 
//		Product prod = session.get(Product.class,3);
//		session.remove(prod);
 	
		List<Product> products = session.createSelectionQuery("from Product where productName = :p ", Product.class)
									.setParameter("p", "headphone")
									.list();
		for (Product prod : products) 
		    session.remove(prod);   // cascade and callbacks applied
		
		tx.commit();
		session.close();
	}

}