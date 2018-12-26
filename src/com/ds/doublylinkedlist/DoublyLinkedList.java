package com.ds.doublylinkedlist;


public class DoublyLinkedList {
	Node head;
	Node tail;
	public void insertLast(int no)
	{
		Node newNode = new Node();
		newNode.number = no;
		if(isEmpty())
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}
	public void insertFront(int no)
	{
		Node newNode = new Node();
		newNode.number = no;
		if(isEmpty())
		{
			newNode = head ; 
			tail = newNode; 
		}
		else
		{
			head.previous = newNode; 
			newNode.next = head;
			head = newNode;
		}
	}
	public void traverseBack()
	{
		Node traverseNode; 
		traverseNode = tail; 
		while(traverseNode.previous != null)
		{
			System.out.println(traverseNode.number);
			traverseNode = traverseNode.previous;
		}
		System.out.println(traverseNode.number);
	}
	public void traverseFront()
	{
		Node traverseNode;
		traverseNode = head;
		while (traverseNode.next != null) {
			System.out.println(traverseNode.number);
			traverseNode = traverseNode.next;

		}
		System.out.println(traverseNode.number);
		
	}
	public void deleteFirst()
	{
		head = head.next;
		head.previous = null;
	}
	public void deleteLast()
	{
		tail = tail.previous;
		tail.next = null;
	}
	public boolean isEmpty()
	{
		return head == null ; 
	}


}
