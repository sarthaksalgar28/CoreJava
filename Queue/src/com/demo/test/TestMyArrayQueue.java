package com.demo.test;

import com.demo.queue.MyArrayQueue;

public class TestMyArrayQueue {
	public static void main(String[] args) {
		MyArrayQueue list = new MyArrayQueue(5);
		
		list.enqueue(12);
		list.enqueue(13);
		list.enqueue(15);
		list.enqueue(17);
		list.enqueue(19);
		
		while (!list.isEmpty()) {
			System.out.println(list.dequeue());
		}
		System.out.println(list.dequeue());
		list.enqueue(16);
		
	}
}