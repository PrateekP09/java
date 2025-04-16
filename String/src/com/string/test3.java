package com.string;

public class test3 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "java";
		s1=s1.intern();
		System.out.println(s1==s2);
	}

}
