package com.demo.test;

import com.demo.stack.MyListStack;

public class TestMyListStack {
		public static void main(String[] args) {
			MyListStack ls=new MyListStack();
			ls.push(22);
			ls.push(15);
			ls.push(12);
			ls.push(2);
			ls.push(1);
			
			while (!ls.isEmpty()) {
				System.out.println(ls.pop());
			}ls.pop();
			
		}

}
