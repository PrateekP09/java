package com.list;

public class test10 {
	private int maxsize;
	private int[] stackarray;
	public int top;

	public test10(int size) {
		maxsize = size;
		stackarray = new int[maxsize];
		top = -1;
	}

	
	public void push(int data) {
		if (top == maxsize - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		stackarray[++top] = data;
		System.out.println("Push: " + data);
	}
	public int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int popValue = stackarray[top--];
		System.out.println("Pop: " + popValue);
		return popValue;
	}
	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.print("Stack: ");
		for (int i = top; i >= 0; i--) {
			System.out.print(stackarray[i] + " ");
		}
		System.out.println();
	}
	    
	public static void main(String[] args) {
		test10 stack = new test10(5);
		System.out.println(stack.top);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		
		stack.pop();
		stack.display();
	}
}
