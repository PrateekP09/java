package com.mutltithreading;

// 1,extending thread class

class A extends Thread{
	public void m1() {
		System.out.println("m1() method executed by :"+ Thread.currentThread().getName());
	}
	
	public void run(){
		m1();
	}
}
public class test1 {

	public static void main(String[] args) {
		System.out.println("main() executed by :"+ Thread.currentThread().getName());
		A t1= new A();
		t1.start();
		System.out.println("main() completed by :"+ Thread.currentThread().getName());
	}

}
