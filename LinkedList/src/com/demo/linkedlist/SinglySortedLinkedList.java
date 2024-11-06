package com.demo.linkedlist;

public class SinglySortedLinkedList {
	
	class Node{
		int data;
		Node Next;
		public Node(int data) {
			super();
			this.data = data;
			this.Next = null;
		}
		
		}
	    Node Head;
		
		public SinglySortedLinkedList() {
		Head = null;
		
		}
		
		public void addInSortedOrder(int val) {
			Node newnode=new Node(val);
			if(Head==null) {
				Head=newnode;
			}
			else {
				Node temp=Head,prev=null;
				if(Head.data>val) {
					newnode.Next=Head;
					Head=newnode;
				}else {
					while(temp!=null && temp.data<val) {
						prev=temp;
						temp=temp.Next;
					}
					newnode.Next=prev.Next;
					prev.Next=newnode;
				}
			}
			
			
		
		}

		public void displayData() {
			if(Head==null) {
				System.out.println("list is empty");
			}else {
				Node temp=Head;
				while(temp!=null) {
					System.out.println(temp.data + " ");
					temp=temp.Next;
				}
			}
			
		}

}
