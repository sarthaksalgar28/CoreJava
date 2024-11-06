package com.demo.beans;

public class SinglySortedList {
	
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
	public  SinglySortedList() {
		head=null;
	}
	public void addInSortedOrder(int val) {
		node newnode=new node(val);
		if (head==null) {
			head=newnode;
			
		} else {
			node temp=head,prev=null;
			if (head.data>val) {
				newnode.next=head;
				head=newnode;
				
			} else {
				while(temp!=null && temp.data<val) {
					prev=temp;
					temp=temp.next;
				}
				newnode.next=prev.next;
				prev.next=newnode;	

			}
			
		}
	}
	public void displayData() {
		// TODO Auto-generated method stub
		if(head==null) {
			System.out.println("list is empty");
		}else {
			node temp=head;
			while (temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
			System.out.println("---------------------------------");
		}
		
	}
}
