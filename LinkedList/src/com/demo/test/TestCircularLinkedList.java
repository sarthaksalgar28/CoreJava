package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.addnode(2);
		list.addnode(3);
		list.addnode(14);
		list.addnode(5);
		list.addnode(18);
		list.addnode(20);
	    list.displayData();
	    list.addByPosition(50, 5);
	    list.displayData();
	    list.addnode(64);
	    list.displayData();
	    
	
	}

}
