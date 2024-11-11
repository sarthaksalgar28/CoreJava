package com.demo.test;

import com.demo.queue.MyListQueue;

public class TestMyListQueue {

	public static void main(String[] args) {
		MyListQueue list=new MyListQueue();
		
		list.enqueue(15);
		list.enqueue(12);
		list.enqueue(10);
		list.enqueue(25);
		list.enqueue(85);
		System.out.println(list.dequeue());
		while (!list.isEmpty()) {
			System.out.println(list.dequeue());
		}
	}

}
