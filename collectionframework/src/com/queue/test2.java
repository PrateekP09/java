package com.queue;

import java.util.PriorityQueue;

public class test2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> Queue = new PriorityQueue<>();
		Queue.offer(10);
		Queue.offer(20);
		Queue.offer(30);
		Queue.offer(-1);
		
		System.out.println(Queue.peek());
		System.out.println(Queue.poll());
		System.out.println(Queue.peek());
	}

}
