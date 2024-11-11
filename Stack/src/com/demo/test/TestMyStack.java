package com.demo.test;

import com.demo.stack.MyStack;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack st=new MyStack();
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		while(!st.isEmpty()) {
		System.out.println(st.pop());
		}
		
	}

}
