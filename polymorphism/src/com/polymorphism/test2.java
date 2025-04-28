package com.polymorphism;



public class test2 {
	public static void m1(int a) {
		System.out.println("void m1()");
	}
	public static int m1(float n) { //  method overloading possible with diff parameter
		System.out.println("void m1()");
		return 0;
		
	}

	public static void main(String[] args) {
		m1(23);
	}

}
