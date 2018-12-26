package com.ds.circularlinkedlist;

public class CircularLinkedList {
	Node tail;
	Node head;

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.number = data;
		if (isEmpty()) {
			tail = newNode;
			head = newNode;
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.number = data;
		if (isEmpty()) {
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = head;
		}
		head = newNode;

	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void traverseFront() {
		Node traverseNode;
		traverseNode = head;
		while (traverseNode != tail) {
			System.out.println(traverseNode.number);
			traverseNode = traverseNode.next;

		}
		System.out.println(traverseNode.number);

	}

}
