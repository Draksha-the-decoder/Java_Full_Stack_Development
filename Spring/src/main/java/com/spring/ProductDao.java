package com.spring;

import java.util.List;

public interface ProductDao {
	public int insertProduct(Product prod);
	public void deleteProductById(int productId);
	public void deleteProduct(Product prod);
	public void updateProduct(Product prod);
	public Product getProductById(int productId);
	public List<Product> getAllProducts();
}