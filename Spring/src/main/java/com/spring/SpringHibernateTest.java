package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		ProductDao dao = context.getBean("product",ProductDao.class);
		
//		 Product prod = new Product();
//		prod.setProductId(101);
//		prod.setProductName("Monitor");
//		prod.setProductPrice(5000);
//		dao.insertProduct(prod); 
		
//		 Product prod = dao.getProductById(101);
//		prod.setProductPrice(6000);
//		dao.updateProduct(prod); 
		
//		 dao.deleteProductById(101);
		
//		 Product prod = dao.getProductById(101);
//		dao.deleteProduct(prod); 
		
		List<Product> prodList = dao.getAllProducts();
		for(Product prod : prodList)
			System.out.println(prod);
		System.out.println("Using Method Reference");
		prodList.forEach(System.out::println);
	}

}