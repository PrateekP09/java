package com.list;


// to add a new node at the end of the linked list
class newNode {
	int data;
	Node next;

	newNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class link {
	Node head;

	public void addAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
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

public class test6 {
	public static void main(String[] args) {
		link list = new link();

		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);

		System.out.println("Linked List after adding nodes at the end:");
		list.display();
	}
}