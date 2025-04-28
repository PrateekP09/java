package com.StringBuffer;

public class test2 {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		//1. Append- used as concat but called as append
		sb.append("code");
		
		//2.indexOf
		System.out.println(sb.indexOf("c"));
		
		//3.last indexOf
		System.out.println(sb.lastIndexOf("c"));
		
		//4.insert
		sb.insert(0, "python");
		System.out.println(sb);
		
		//5.replace
		sb.replace(0,6, "java");
		System.out.println(sb);
		
		//6.delete
		sb.delete(0,4);
		System.out.println(sb);
		
		//7.reverse()
		sb.reverse();
		System.out.println(sb);
		
		//8.capacity()
		System.out.println(sb.capacity());// default capacity
		
		//9.length()
		System.out.println(sb.length()); // size/length of obj
		
		// to convert StringBuffer to string
		StringBuffer sb2= new StringBuffer("javaprogram");
		String string= sb2.toString();
		
		// to convert String to StringBuffer
		StringBuffer stringBuffer= new StringBuffer(string);
	}

}
