package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtEnd(1); 
		list.insertAtEnd(2); 
		list.insertAtEnd(3); 
		list.insertAtEnd(4); 
		list.insertAtEnd(5); 
		list.display();
		System.out.println("--------------------------");
		list.deleteAtBeginning();
		list.display();
		System.out.println("--------------------------");
		list.deleteAtEnd();
		list.display();
		list.insertAtBeginning(10);
		list.display();
		System.out.println("--------------------------");

		list.insertAtPosition(12, 6);
		list.display();
		
		list.insertAtPosition(12, 9);
		list.display();
		


	}


}
