package com.demo.queue;

public class MyListQueue {
	node front,rear;
	class node {
		int data;
		node next;
		public node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	
		
	}
	public MyListQueue() {
		super();
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return front==null && rear==null;
	}
	public void enqueue(int x) {
		node newnode = new node (x);
		if (isEmpty()) {
			front=newnode;
			rear=newnode;
			
		} else {
			rear.next=newnode;
			rear=newnode;

		}
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			
		} else {
			System.out.println("In Dequeue : " +" " +front.data);
			node temp=front;
			front=temp.next ;
			if (front==null) 
				rear=null;
				temp.next=null;
				return temp.data ;
				
			
			
		}
		return -1;
	}
}
