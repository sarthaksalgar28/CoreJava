package com.demo.test;

import com.demo.stack.MyArrayStack;

public class TestMyArrayStack {

	public static void main(String[] args) {
	 MyArrayStack as = new MyArrayStack();
	 
	 as.push(12);
	 as.push(10);
	 as.push(22);
	 as.push(2);
	 as.push(16);
	 as.pop();	
	 while (!as.isEmpty()) {
		 System.out.println(as.pop());
		
	}

	}

}
