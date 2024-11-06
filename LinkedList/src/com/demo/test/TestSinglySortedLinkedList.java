package com.demo.test;

import com.demo.linkedlist.SinglySortedLinkedList;

public class TestSinglySortedLinkedList {
	public static void main(String[] args) {
		SinglySortedLinkedList lst=new SinglySortedLinkedList();
		lst.addInSortedOrder(12);
		lst.addInSortedOrder(5);
		lst.addInSortedOrder(388);
		lst.addInSortedOrder(69);
		lst.displayData();
		
	}

	

}
