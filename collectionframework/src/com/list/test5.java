package com.list;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	public void addBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

public class test5 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addBeginning(30);
		list.addBeginning(20);
		list.addBeginning(10);

		System.out.println("Linked List after adding nodes at the beginning:");
		list.display();
	}
}