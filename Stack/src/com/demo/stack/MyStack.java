package com.demo.stack;

public class MyStack {

	private char[] arr;
	private int top = -1;

	public MyStack() {
		this.arr = new char[10];
	}

	public MyStack(int size) {
		this.arr = new char[size];
	}
	
	public boolean isEmpty() {
		return this.top==-1;
	}
	
	public boolean isFull() {
		return this.top==this.arr.length-1;
	}
	
	public void push(char val) {
		if(this.isFull()) {
			System.out.println("stack is full");
		}else {
			++this.top;
			this.arr[this.top]=val;
		}
	}
	
	public char pop()
	{
		if(this.isEmpty()) {
			System.out.println("stack is empty");
			return '$';
		}
		else {
			char n=this.arr[this.top];
			--this.top;
			return n;
		}
	}
}
