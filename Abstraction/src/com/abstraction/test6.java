package com.abstraction;


interface D{
	void m1();
}
interface E{
	void m1();
}

interface F extends E,D{} // one interface can extend multiple interfaces
class Impl implements E,D{

	@Override
	public void m1() {
		System.out.println("calling from the implementing class");
	}

	
	
}
public class test6 {

	public static void main(String[] args) {
		D d= new Impl();
		d.m1();
	}

}
