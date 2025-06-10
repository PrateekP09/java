package com.comparableInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
	private int productId;
	private String productname;
	private int productprice;
	public Product(int productId, String productname, int productprice) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.productprice = productprice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", productprice=" + productprice
				+ "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class test1 {

	public static void main(String[] args) {
		Product p1 = new Product(2,"laptop", 56000);
		Product p2 = new Product(3,"mobile", 66000);
		Product p3 = new Product(1,"Tv", 59000);
		
		List<Product> list = Arrays.asList(p1,p2,p3);
		System.out.println(list);
		Collections.sort(list);

		System.out.println(list);
	}

}
