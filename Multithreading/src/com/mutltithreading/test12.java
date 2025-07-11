package com.mutltithreading;

class InterthreadCommunication {
	int i;
	boolean flag = false;

	public synchronized void deliverData(int i) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i = i;
		flag = true;
		System.out.println("Data Delivered " + i);
		notify();
	}

	public synchronized int receiveData() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Data Received: " + i);
		flag = false;
		notify();
		return i;
	}
}

class DeliverThread extends Thread {
	private InterthreadCommunication obj;

	DeliverThread(InterthreadCommunication obj) {
		this.obj = obj;
	}

	public void run() {
		for (int j = 1; j <= 5; j++) {
			obj.deliverData(j);
		}
	}
}

class ReceiverThread extends Thread {
	private InterthreadCommunication obj;

	public ReceiverThread(InterthreadCommunication obj) {
		this.obj = obj;
	}

	public void run() {
		for (int k = 0; k <= 5; k++) {
			obj.receiveData();
		}
	}
}

public class test12 {
	public static void main(String[] args) {
		InterthreadCommunication obj = new InterthreadCommunication();
		DeliverThread t1 = new DeliverThread(obj);
		ReceiverThread t2 = new ReceiverThread(obj);
		t1.start();
		t2.start();
	}
}
