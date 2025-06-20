package com.queue;

public class test1 {
	private int front, rear, size;
	private int[] queue;

	public test1(int maxsize) {
		front = 0;
		rear = -1;
		size = 0;
		queue = new int[maxsize];
	}

	public void enqueue(int ele) {
		if (size == queue.length) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % queue.length;
		queue[rear] = ele;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int removedElement = queue[front];
		front = (front + 1) % queue.length;
		size--;
		return removedElement;
	}

	public void traverse() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = 0; i < size; i++) {
			int index = (front + i) % queue.length;
			System.out.print(queue[index] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		test1 q = new test1(6);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);

		q.traverse();

		q.dequeue();// deleting
		q.dequeue();// deleting

		q.traverse();
	}
}