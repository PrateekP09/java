package com.abstraction;

interface M{
	void m1();
	
	public default void m2() {
		System.out.println("m2() implemented");
		
	}
	public static void m3() {
		System.out.println("m3() implemented");
	}
}

 class MImpl implements M{

	@Override
	public void m1() {
		System.out.println("m1() implemented");
	}
	public void m2() {
		System.out.println("m2() modified");
	}
	public static void m3() {
		System.out.println("");
	}
}
public class test4 {

	public static void main(String[] args) {
		M obj = new MImpl();
		obj.m1();
		obj.m2();
		M.m3();// we have to use interface name to access, but not obj
	}

}
