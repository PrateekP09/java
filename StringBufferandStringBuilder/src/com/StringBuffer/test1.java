package com.StringBuffer;

public class test1 {

	public static void main(String[] args) {
     StringBuffer sb = new StringBuffer("java");
     System.out.println(sb);
     System.out.println(sb.hashCode());
     
     sb.append("code");
     System.out.println(sb);
     System.out.println(sb.hashCode());
	}

}
