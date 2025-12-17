 package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Product;

@Service
public class ProductService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void addProduct(Product prod)
	{
		String SQL = "insert into Product values (?,?,?)";
		jdbcTemplate.update(SQL,new Object[] {prod.getProductId(),prod.getProductName(),prod.getProductPrice()});
	}
}