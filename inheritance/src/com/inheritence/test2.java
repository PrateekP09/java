package com.inheritence;



class A{
	int data=100;
}
class B extends A{
	int data=200;
}

public class test2 {
	public static void main(String[] args) {
		A a = new A ();
		System.out.println(a.data);
		
		B b = new B();
		System.out.println(b.data);
		
		A a2= new B();// special case called dynamic dispatch
		System.out.println(a2.data);
		
		//b b2= new A();// child class refering parent class is not allowed
		
	}

}
