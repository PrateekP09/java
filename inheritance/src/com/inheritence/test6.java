package com.inheritence;



class c{
	int data=200;
}
class D extends c{
	int data = 300;
	public void get() {
		int data=400;
		System.out.println(data);
		System.out.println(super.data);
		System.out.println(this.data);
	}
}
public class test6 {

	public static void main(String[] args) {
			D obj= new D();
			obj.get();
	}

}
