package com.ds.singlylinkedlist;

public class SinglyLinkedList {
	Node head;

	public void insertLast(int no) {
		Node newNode = new Node();
		newNode.number = no;
		newNode.next = null;
		if (isEmpty()) {
			head = newNode;
		} else {
			Node traverseNode;
			traverseNode = head;
			while (traverseNode.next != null) {
				traverseNode = traverseNode.next;

			}
			traverseNode.next = newNode;
		}

	}

	public void insertFirst(int no) {
		Node newNode = new Node();
		newNode.number = no;
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}



	public void show() {
		Node traverseNode;
		traverseNode = head;
		while (traverseNode.next != null) {
			System.out.println(traverseNode.number + " ");
			traverseNode = traverseNode.next;

		}
		System.out.println(traverseNode.number + " ");
	}

	public void deleteAt(int index) {
		Node traverseNode = head;
		int counter = 0;
		if (index == 0) {
			head = head.next;
		} else {
			while (counter < index - 1) {
				traverseNode = traverseNode.next;
				counter++;
			}
			Node tempNode = traverseNode;
			traverseNode = traverseNode.next;
			tempNode.next = traverseNode.next;
			traverseNode = null;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
}
