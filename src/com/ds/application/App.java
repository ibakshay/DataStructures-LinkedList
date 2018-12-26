package com.ds.application;

import com.ds.circularlinkedlist.CircularLinkedList;
import com.ds.doublylinkedlist.DoublyLinkedList;
import com.ds.singlylinkedlist.SinglyLinkedList;

public class App {

	public static void main(String[] args) {
		
		//Singly Linked List
		SinglyLinkedList singleLinkedList = new SinglyLinkedList();
		singleLinkedList.insertLast(7);
		singleLinkedList.insertLast(88);
		singleLinkedList.insertFirst(3);
		singleLinkedList.insertLast(5);
		singleLinkedList.deleteAt(0);
		System.out.println("Singly Linked List");
		singleLinkedList.show();
		
		//Doubly Linked List
		
		DoublyLinkedList doubleLinkedList = new DoublyLinkedList(); 
		doubleLinkedList.insertLast(4);
		doubleLinkedList.insertLast(5);
		doubleLinkedList.insertLast(8);
		doubleLinkedList.insertFront(2);
		doubleLinkedList.insertLast(77);
		doubleLinkedList.deleteFirst();
		doubleLinkedList.deleteLast();
		System.out.println("Doubly  Linked List traverse front");
		doubleLinkedList.traverseFront();
		System.out.println("Doubly  Linked List traverse back");
		doubleLinkedList.traverseBack();
		
		//Circular Linked List
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.insertLast(4);
		circularLinkedList.insertFirst(3);
		circularLinkedList.insertFirst(9);
		circularLinkedList.insertLast(17);
		System.out.println("Circular Linked List");
		circularLinkedList.traverseFront();
		
		

	}

}