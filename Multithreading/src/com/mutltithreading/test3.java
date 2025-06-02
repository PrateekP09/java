package com.mutltithreading;

class c extends Thread{
	public void run() {
		System.out.println("Task completed");
	}
}
public class test3 {

	public static void main(String[] args) {
		c t1 = new c();
		t1.start();
	}

}
