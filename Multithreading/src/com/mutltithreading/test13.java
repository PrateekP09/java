package com.mutltithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test13 implements Runnable{

	public static void main(String[] args) {
     ExecutorService executor = Executors.newSingleThreadExecutor();
     executor.execute(new test13());
     executor.shutdown();
	}

@Override
public void run() {
	System.out.println("task completed....");
}
}