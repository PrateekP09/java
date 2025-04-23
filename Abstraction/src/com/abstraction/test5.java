package com.abstraction;

interface C{
	int data =100;//public static, final
}
public class test5 {

	public static void main(String[] args) {
		System.out.println(C.data);
		//C.data =400;		
	}

}
