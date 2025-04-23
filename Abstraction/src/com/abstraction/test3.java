package com.abstraction;

 final class X{// inheritence / or class cannot be extended from class X if it is final class
	 final int a=10;// intialization of int is mandatory during declaration, or else it compile time error
	int data=20;
	public  void m1() {
		System.out.println("m1() called");
	}
}

//class Y extends X{
	
//}
public class test3 {

	public static void main(String[] args) {
			X obj = new X();
			obj.data =100;// if class is declared as final it can be re assigned
	}

}
