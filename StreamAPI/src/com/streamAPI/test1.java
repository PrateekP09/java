package com.streamAPI;

@FunctionalInterface
interface A{
	//void m1();
	//void m2(); only one abstract method is used in func interface
	String getUpperCase(String str);
}
public class test1 {

	public static void main(String[] args) {
		//A obj = ()-> {System.out.println("Hello");};
		//obj.m1();
		
		A obj =(str)-> {return str.toUpperCase();};
		System.out.println(obj.getUpperCase("java"));
	}

}
