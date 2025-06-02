package com.mutltithreading;

//2.Implementing runable interface

class B implements Runnable{
	public void m1() {
		System.out.println("m1() method executed by :"+ Thread.currentThread().getName());
	}

	@Override
	public void run() {
		m1();
	}
}
public class test2 {

	public static void main(String[] args) {
		//System.out.println("m1() method executed by :"+ Thread.currentThread().getName());
		B t1= new B();
		Thread th= new Thread(t1);
		th.start();
	}

}
