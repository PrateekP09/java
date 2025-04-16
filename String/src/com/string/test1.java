package com.string;

public class test1 {

	public static void main(String[] args) {
	 String str= "java";
	 System.out.println(str);
	 System.out.println(str.hashCode());// hashcode is used to get id 
	 
	 System.out.println("__________________");
	 str.concat("code");
	 System.out.println(str);
	 System.out.println(str.hashCode());
	 
	 
	 System.out.println("__________________");
	 str=str.concat("world");
	 System.out.println(str);
	 System.out.println(str.hashCode());
	 
	 System.out.println(str.concat("program"));
	}

}
