package com.demo.stack;

public class MyListStack {
	node top;
	class node{
		
		int data;
		node next;
		public node(int val) {
			
			this.data = val;
			this.next = null;
		}
		
	
	}
	public MyListStack( ) {
		
		this.top = null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	 public void push(int n) {
		 node newnode=new node(n);
		 if(top==null) {
			 top=newnode;
		 }else {
			 newnode.next=top;
			 top=newnode;
		 }
	 }
	 
	 public int pop() {
		 if(isEmpty()) {
			 System.out.println("list is empty");
		 }else {
			 node current=top;
			 top=current.next;
			 current.next=null;
			 return current.data;
		 }
		 return -1;
	 }
	

}
