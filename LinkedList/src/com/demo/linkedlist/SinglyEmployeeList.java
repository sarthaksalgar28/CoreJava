package com.demo.linkedlist;
import com.demo.beans.Employee;

public class SinglyEmployeeList {
	Node Head;
	class Node{
		Employee data;
		Node Next;
		public Node(Employee data) {
			super();
			this.data = data;
			Next = null;
		}
		
		
	}
	public SinglyEmployeeList() {
		super();
		this.Head = null;
	}
	public void addNode(Employee ob) {
		Node newnode= new Node(ob);
		if (Head==null) {
			Head=newnode;
			
		}
		else {
			Node temp=Head;
			 while (temp.Next!=null) {
				 temp=temp.Next;
				 
			
			}
			 temp.Next=newnode;
		}

	}
	
	public void deleteById(int id) {
		Node temp=Head;
		if(Head.data.getEid()==id){
			Head=temp.Next;
			temp.Next=null;
			temp=null;
			
		}else {
			Node prev=null;
			while (temp!=null && temp.data.getEid()!=id) {
				prev=temp;
				temp=temp.Next;
				
			}if(temp.data.getEid()==id){
				prev.Next=temp.Next;
				temp.Next=null;
				temp=null;
				
			}else {
				System.out.println("Woh IET MEIN NAI PADHATA" + " "+ id);
			}
		}
	}
	
	public void SearchById(int id) {
		
		Node temp=Head;
		while(temp!=null  &&  temp.data.getEid()!=id) {
			temp=temp.Next;
		}
		if(temp!=null  &&  temp.data.getEid()==id) {
			System.out.println("---------------------------------------------");
			System.out.println(temp.data);
			System.out.println("---------------------------------------------");
		}else {
			System.out.println("---------------------------------------------");
			System.out.println("id not found : "+ " "+id);
			
		}
		
		
	}
	
//	public void MidElement() {
//		int t=list.size;
//		
//	}
	public void displayData() {
		Node temp=Head;
		if(Head!=null) {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.Next;
			}
		}
	}

}
