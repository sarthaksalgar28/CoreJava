package com.demo.queue;

public class MyArrayQueue {
	int [] arr;
	int front,rear;
	public MyArrayQueue() {
		super();
		this.arr = new int [10];
		this.front = 0;
		this.rear = 0;
	}
	public MyArrayQueue(int size) {
		super();
		this.arr =  new int [size];
		this.front = 0;
		this.rear = 0;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull()
	{
		return rear==arr.length;
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
		     arr[rear]=val;
		     rear++;
		}
		
	}
	
	public int dequeue(){
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			int n=arr[front];
			front++;
			return n;
		}
		return -1;
	}
	
	
	
	
}

