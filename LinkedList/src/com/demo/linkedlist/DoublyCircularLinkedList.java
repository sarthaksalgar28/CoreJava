package com.demo.linkedlist;

public class DoublyCircularLinkedList {
	node head;
	class node{
		int data;
		node prev;
		node next;
		public node(int data) {
			super();
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
	}
	public DoublyCircularLinkedList() {
		super();
		this.head = null;
	}
	public void append(int data) {
		node newnode= new node(data); 
		
		if (head==null) {
			head=newnode;
			newnode.next=newnode;
			newnode.prev=newnode;
			
			
		}else {
			
			node tail=head.prev;
			tail.next=newnode;
			newnode.prev=tail;
			newnode.next=head;
			head.prev=newnode;
		}
	}
	public void displayData() {
		if(head==null) 
			return;
			node current=head;
			
			do {
				System.out.println(current.data);
				current=current.next;
				
			} while (current!=head);
			System.out.println("bol bhai");
	}

}
