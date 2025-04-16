package com.string;

// non-primitive : ==(compare refernce), equals() imp**
public class test2 {

	public static void main(String[] args) {
		String str="hello";
		String str1="hello";
		String str2="Hello";
		if (str==str2) {
			System.out.println("point so same object");
		}
		else {
			System.out.println("points different obj");
		}
	}

}	
