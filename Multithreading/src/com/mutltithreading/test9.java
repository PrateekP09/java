package com.mutltithreading;


class Table {
	public static synchronized void print(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
}

class T extends Thread {
	Table t;

	T(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(2);
	}
}

class T5 extends Thread {
	Table t;

	T5(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(5);
	}
}

public class test9 {
	public static void main(String[] args) {
		Table t = new Table();
		T th = new T(t);
		T5 t3 = new T5(t);
		th.start();
		t3.start();
	}
}
