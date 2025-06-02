package com.mutltithreading;


class SharedResources{
 static	int counter= 0;
 
 public synchronized void incrementcounter() {
	 counter++;
 }
}
public class test8 {

	public static void main(String[] args) throws InterruptedException {
		SharedResources sr= new SharedResources();
		
		Thread t1= new Thread() {
			public void run() {
				for(int i=0;i<=1000;i++) {
					sr.incrementcounter();
				}
			}
		};
				Thread t2= new Thread() {
					public void run() {
						for(int i=0;i<=1000;i++) {
							sr.incrementcounter();
						}
			}
				
		};
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("final value of counter"+ SharedResources.counter);
		
	

}
}
