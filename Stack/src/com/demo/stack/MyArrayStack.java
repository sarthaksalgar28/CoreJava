package com.demo.stack;

public class MyArrayStack {
	int[] arr;
	int top = -1;

	public MyArrayStack() {

		this.arr = new int[10];

	}

	public MyArrayStack(int size) {
		this.arr = new int[size];
	}

	public boolean isEmpty() {
		return this.top == -1;

	}

	public boolean isFull() {
		return this.top == this.arr.length - 1;
	}
	
	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack Is Full");
			
		}else {
			top++;
			arr[top]=val;
		}
	
	}public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			
		}else {
			int n=arr[top];
			top--;
			return n;
			
		}return '$';
		
	}

}
