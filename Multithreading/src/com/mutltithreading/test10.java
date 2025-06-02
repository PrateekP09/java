package com.mutltithreading;


class table {
	public static synchronized void print(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
}

class T2 extends Thread {
	table t;

	T2(table t) {
		this.t = t;
	}

	public void run() {
		synchronized(t) {
		t.print(2);
	}
}

class T51 extends Thread {
	table t;

	T51(table t) {
		this.t = t;
	}

	public void run() {
		synchronized(t) {
		t.print(5);
	}
}
}

public class test10 {
	public static void main(String[] args) {
		table t = new table();
		T2 th = new T2(t);
		T51 t3 = new T51(t);
		th.start();
		t3.start();
	}
}
}

