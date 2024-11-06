package com.demo.linkedlist;

public class DoublyLinkedList {
	
	class node{
		int data;
		node next;
		node prev;
		public node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
		
	}
	node head;
	node tail;
	public DoublyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}
	
	public void traverseForward() {
		node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void traverseBackard() {
		node temp=tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}


	
	
		public void insertAtBeginning(int data) 
		{ 
			node temp = new node(data); 
			if (head == null) { 
				head = temp; 
				tail = temp; 
			} 
			else { 
				temp.next = head; 
				head.prev = temp; 
				head = temp; 
			} 
		} 

		public void insertAtEnd(int data) 
		{ 
			node temp = new node(data); 
			
			if (tail == null) { 
				head = temp; 
				tail = temp; 
			} 
			else { 
				tail.next = temp; 
				temp.prev = tail; 
				tail = temp; 
			}
			
		} 

		public void insertAtPosition(int data, int position) 
		{ 
			node temp = new node(data); 
			if (position == 1) { 
				insertAtBeginning(data); 
			} 
			else { 
				node current = head; 
				int currPosition = 1; 
				while (current != null
					&& currPosition < position) { 
					current = current.next; 
					currPosition++; 
				}
				if (current == null) { 
					insertAtEnd(data); 
				} 
				else { 
					temp.next = current; 
					temp.prev = current.prev; 
					current.prev.next = temp; 
					current.prev = temp; 
				} 
			} 
		} 

		public void deleteAtBeginning() 
		{ 
			if (head == null) { 
				return; 
			} 

			if (head == tail) { 
				head = null; 
				tail = null; 
				return; 
			} 

			node temp = head; 
			head = head.next; 
			head.prev = null; 
			temp.next = null; 
		} 

		public void deleteAtEnd() 
		{ 
			if (tail == null) { 
				return; 
			} 

			if (head == tail) { 
				head = null; 
				tail = null; 
				return; 
			} 

			node temp = tail; 
			tail = tail.prev; 
			tail.next = null; 
			temp.prev = null; 
		} 

		public void deleteAtSpecificPosition(int pos) 
		{ 
			if (head == null) { 
				return; 
			} 

			if (pos == 1) { 
				deleteAtBeginning(); 
				return; 
			} 

			node current = head; 
			int count = 1; 

			while (current != null && count != pos) { 
				current = current.next; 
				count++; 
			} 

			if (current == null) { 
				System.out.println("Position wrong"); 
				return; 
			} 

			if (current == tail) { 
				deleteAtEnd(); 
				return; 
			} 

			current.prev.next = current.next; 
			current.next.prev = current.prev; 
			current.prev = null; 
			current.next = null; 
		} 

		public void display() 
		{ 
			node temp = head; 
			while (temp != null) { 
				System.out.print(temp.data + " --> "); 
				temp = temp.next; 
			} 
			System.out.println("NULL"); 
		} 

	
	}
