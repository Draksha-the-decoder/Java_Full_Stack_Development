package com.spring.boot.entity;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@ToString
public class Product {
	
	private int productId;
	private String productName;
	private int productPrice;
  
	public int getProductId() { return productId; }
	public void setProductId(int productId) { this.productId = productId; }
	public String getProductName() { return productName; }
	public void setProductName(String productName) { this.productName = productName; }
	public int getProductPrice() { return productPrice; }
	public void setProductPrice(int productPrice) { this.productPrice = productPrice; }

}