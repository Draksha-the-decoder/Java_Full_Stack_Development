 package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Product;
import com.spring.boot.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/addproduct")
	public ModelAndView addProduct(@RequestParam("productId") int productId, @RequestParam("productName") String productName, @RequestParam("productPrice") int productPrice)
	{
		Product prod = new Product();
		prod.setProductId(productId);
		prod.setProductName(productName);
		prod.setProductPrice(productPrice);
		productService.addProduct(prod);//invoke Model/Service/Action class
		return new ModelAndView("successProduct.jsp");//invoke View
	}
}