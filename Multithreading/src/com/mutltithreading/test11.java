package com.mutltithreading;

class writing{
	public static final String resource1= "pen";
	public static final String resource2= "paper";
}

class PenThread extends Thread{
	public void run() {
		synchronized (writing.resource1) {
			System.out.println("Acquired the lock of pen.Waiting for paper");
			synchronized (writing.resource2) {
				System.out.println("Task completed by PenThread");
			}
		}
	}
}

class PaperThread extends Thread{
	public void run() {
		synchronized (writing.resource2) {
			System.out.println("Acquired the lock of paper.waiting for pen");
			synchronized (writing.resource1) {
				System.out.println("Task completed by paperthread");
			}
		}
	}
}
public class test11 {

	public static void main(String[] args) throws InterruptedException{
		PenThread p1= new PenThread();
		PaperThread p2 = new PaperThread();
		p1.start();
		//p1.join();
		p2.start();
		//p2.join();;
		
	}

}
