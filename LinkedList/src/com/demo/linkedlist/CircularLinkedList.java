package com.demo.linkedlist;

import java.util.Iterator;

public class CircularLinkedList {
	node head,tail;
	class node{
		int data;
		node next;
		public node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	public CircularLinkedList() {
	
		this.head = null;
		this.tail = null;
	} 
	
	public void addnode(int val) {
		node newnode=new node(val);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}else {
			tail.next=newnode;
			tail=newnode;
			
		}
		tail.next=head;
	}
	
	public void addByPosition(int val,int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			node newnode=new node(val);
			if(pos==1) {
				newnode.next=head;
				head=newnode;
				tail.next= newnode;
			}else {
				node current=head;
				int i;
				for ( i = 1; current.next!=head && i <=  pos-2 ; i++) {
					current=current.next;

				}if (i > pos-2) {
					if (current.next==head) {
						tail=newnode;
						
					}newnode.next=current.next;
					current.next=newnode;
					
				}else{
					System.out.println("the list byeond the limit");
				}
			}
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			node current=head;
			while (current.next!=head) {
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println(current.data);

			
		}
	}
}
