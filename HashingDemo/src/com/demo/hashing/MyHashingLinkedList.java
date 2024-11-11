package com.demo.hashing;

public class MyHashingLinkedList {
	
	class node{
		int data;
		node next;
		public node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	node head;
	public MyHashingLinkedList() {
		super();
		this.head = null;
	}
	
	public void addValue(int val) {
		node newnode=new node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
			
		}
	}
	
	public boolean search(int val) {
		if (head==null) {
			return false;
		}else {
			node temp=head;
			while (temp!=null && temp.data!=val) {
				temp=temp.next;
				
			}if (temp!=null && temp.data==val) {
				return true;
				
				
			} else {
				return false;
			}
		}
		
		
	}

	public boolean delete(int val) {
		
		if(head==null) {
			return false;
		}
		else {
			node temp=head;
			if(head.data==val) {
				head=head.next;
				
			}
			else {
				node prev=null;
				while(temp!=null && temp.data!=val) {
					prev =temp;
					temp=temp.next;
				}if (temp.data==val) {
					prev.next=temp.next;
				} else {
					return  false;
				}
			}
			temp.next=null;
			temp=null;
			return true;
			
		}
		
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			node temp=head;
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	

}

