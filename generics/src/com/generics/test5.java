package com.generics;

class product{
	
	int productprice;

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "product [productprice=" + productprice +"]";
	}
}
interface MyInterface<T> extends Comparator<T>{

	int compare(product o1, product o2);
	
		
	}

class MyInterfaceImpl<T> implements MyInterface<product>{
	
	@Override
	public int compare(product o1, product o2) {
		return o1.getproductprice() - 02.getproductprice();
		
	}
}

public class test5 {

	public static void main(String[] args) {
		
	}

}
