package com.demo.linkedlist;

public class SinglyLinkedList {

	class Node {
		int data;
		Node Next;

		public Node(int data) {
			super();
			this.data = data;
			this.Next = null;
		}

	}

	Node head;
	public SinglyLinkedList() {
		head = null;
	}

	public void addNode(int val) {
	Node newNode = new Node(val);

	if (head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while (temp.Next != null) {
			temp = temp.Next;
			}
			temp.Next = newNode;
		}

	}
	public int searchbyvalue(int val) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node temp=head;
			int pos=0;
			while(temp!=null && temp.data!=val) {
				temp=temp.Next;
				pos++;
			}
			if(temp!=null) {
				return pos;
			}
			
		}
		return -1;
	}
//	public int cnt(int next) {
//		
//		if(head!=null) {
//			return 0;
//			
//		}return 1+cnt(head.next);
//	}
//	
	public void addByPosition(int val,int pos) {
		if(head==null && pos>1) {
			System.out.println("list is empty");
		}else {
			Node newnode=new Node(val);
			
			if(pos==1) {
				newnode.Next=head;
				head=newnode;
			}else {
				Node temp=head;
				
				for(int i=0;temp!=null && i<=pos-1;i++) {
					temp=temp.Next;
				}
				if(temp!=null) {
					newnode.Next=temp.Next;
					temp.Next=newnode;
				}else {
					System.out.println("The given position beyond the limit of list");
				}
			}
		}
	}

	public void displaydata() {
		if (head == null) {
			System.out.println("List Is EmptY");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data + "  ");
				temp = temp.Next;

			}

		}

	}
}
