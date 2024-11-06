package com.demo.test;

import com.demo.linkedlist.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {
	public static void main(String[] args) {
		DoublyCircularLinkedList dlis=new DoublyCircularLinkedList();
		dlis.append(2);
		dlis.append(6);
		dlis.append(24);
		dlis.append(12);
		dlis.append(21);
		dlis.append(20);
		dlis.displayData();
	}

}
