package com.demo.test;

import java.util.Scanner;

import com.demo.hashing.MyHashingLinkedList;

public class TestMyHashingLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=7;
		MyHashingLinkedList [] hashtable=new MyHashingLinkedList[num];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i]=new MyHashingLinkedList();
		}
		displayhashtable(hashtable);
		int choice=0;
		do {
			
			System.out.println("1.Add data /n 2.Search Data /n 3.Delete Data /n 4.Display Data");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1 ->{
				System.out.println("enter a number");
				int val=sc.nextInt();
				addDataHashtable(hashtable,val);
				displayhashtable(hashtable);
				
			}
			case 2 ->{
				 
				System.out.println("enter a number");
				int val=sc.nextInt();
				boolean status=searchData(hashtable,val);
				if(status) {
					System.out.println("element found");
				}else {
					System.out.println("element not found");
				}
				
			}
			case 3 ->{
				System.out.println("enter a number");
				int val=sc.nextInt();
				boolean status=deleteData(hashtable,val);
				if(status) {
					System.out.println("element deleted");
				}else {
					System.out.println("element not deleted");
				}
				displayhashtable(hashtable);
			}
			case 4 ->{
				System.out.println("thank you for hashing");
				sc.close();
			}
			
			
			
			
			default ->System.out.println("wwrong choice");
			
			}
		} while (choice!=4);

	}

	private static boolean deleteData(MyHashingLinkedList[] hashtable, int val) {
		int bucket=val%hashtable.length;
		
		return hashtable[bucket].delete(val);
	}

	private static boolean searchData(MyHashingLinkedList[] hashtable, int val) {
		int bucket=val%hashtable.length;
		
		return hashtable[bucket].search(val);
	}

	private static void addDataHashtable(MyHashingLinkedList[] hashtable, int val) {
		
		int bucket=val%hashtable.length;
		hashtable[bucket].addValue(val);
		

	}
        
	private static void displayhashtable(MyHashingLinkedList[] hashtable) {
		
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(i+"------>");
			hashtable[i].displayData();
			System.out.println();
		}
		System.out.println("----------------------->");		
	}

}
