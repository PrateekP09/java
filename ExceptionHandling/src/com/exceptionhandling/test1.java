package com.exceptionhandling;

public class test1 {

	public static void m1() {
		System.out.println("statement 1");
		System.out.println(12/0);// runtime exception or unchecked
		System.out.println("statement 3");
		System.out.println("statement 4");
	}
	public static void main(String[] args) {
		m1();
	}
	
}
