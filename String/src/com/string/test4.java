package com.string;

import java.util.Arrays;

public class test4 {

	public static void main(String[] args) {
		String str="java";
		
		//concat
		str.concat("world");
		
		//length
		System.out.println(str.length());
		
		//charAt(i)
		System.out.println(str.charAt(1));
		
		//indexOf()
		System.out.println(str.indexOf("a"));
		
		//last indexOf()
		System.out.println(str.lastIndexOf("a"));
		
		// == comparing the reference
		String s2="java";
		System.out.println(s2.equals(str));
		
		//equals()
		System.out.println(str.equals(str));
		
		// substring
		System.out.println(str.substring(1,3));
		
		//split
		String s3="java programming";
		String[]s= s3.split("");
		System.out.println(Arrays.toString(s));
		
		// toCharArray()
		System.out.println(Arrays.toString(s2.toCharArray()));
		
		// toUppercase
		// toLowercase
		
		//compare to
		String s4="hello";
		String s5="Hello";
		System.out.println(s4.compareTo(s5));
	}
	
	

}
