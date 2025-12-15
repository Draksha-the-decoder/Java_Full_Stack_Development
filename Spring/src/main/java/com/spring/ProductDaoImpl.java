package com.spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class ProductDaoImpl implements ProductDao {
	@Autowired //no need for setter injection
	private HibernateTemplate hibernateTemplate;
	/*public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}*/
	@Override
	@Transactional
	public int insertProduct(Product prod) {
		return (int)hibernateTemplate.save(prod);
	}

	@Override
	@Transactional
	public void deleteProductById(int productId) {
		Product prod = hibernateTemplate.get(Product.class,productId);	
		hibernateTemplate.delete(prod);
	}

	@Override
	@Transactional
	public void deleteProduct(Product prod) {
		hibernateTemplate.delete(prod);		
	}

	@Override
	@Transactional
	public void updateProduct(Product prod) {
		hibernateTemplate.update(prod);		
	}

	@Override
	public Product getProductById(int productId) {
		return hibernateTemplate.get(Product.class,productId);
	}

	@Override
	public List<Product> getAllProducts() {
		return hibernateTemplate.loadAll(Product.class);
	}
	

}