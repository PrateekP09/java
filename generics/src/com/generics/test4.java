package com.generics;

public class test4 {
	public static <T extends Number> void add(T obj, T obj2) {
		double sum= 0.0;
		sum = obj.doubleValue() + obj2.doubleValue();
        System.out.println("Sum: " + sum);
	}
	public static void main(String[] args) {
		add(10,20);
		add(10.1,20.2);// double
		add(1.1f,3.1f);

	}
}
