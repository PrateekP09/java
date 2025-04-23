package com.polymorphism;


class parent{
	public void m1() {
		System.out.println("called from parent");
	}
	
}
 class child extends parent{
	@Override
	public void m1() {
		System.out.println("called from child");
	}
}
public class test3 {

	public static void main(String[] args) {
		parent p= new child();
		p.m1();
	}

}
