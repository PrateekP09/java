package com.mutltithreading;

class A1 extends Thread{
	public void run(){
		for (int i=1; i<=5; i++) {
			System.out.println("current running thread -"+ Thread.currentThread().getName()+" - "+ i);
			
		}
	}
}
public class test4 {

	public static void main(String[] args) {
		A1 t = new A1();
		A1 t2 = new A1();
		t.setName("A");
		t.setName("B");
		t.start();
		t2.start();
	}

}
