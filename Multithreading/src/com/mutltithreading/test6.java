package com.mutltithreading;


public class test6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread Main Started");
		Thread t1= new Thread() {
			public void run() {
				for(int i=1;i<=20;i++) {
					continue;
				}
				System.out.println("thread 1 completed");
			}
		};
		Thread t2= new Thread() {
			public void run() {
				for(int i=1;i<=20;i++) {
					continue;
				
			}
				System.out.println("thread 2 completed");
		}
	};
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	System.out.println("thread completed");

}
}
