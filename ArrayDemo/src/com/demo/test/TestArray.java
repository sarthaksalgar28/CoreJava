package com.demo.test;

import java.util.Scanner;

import com.demo.service.ArrayService;

public class TestArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] arr= {11,12,10,8,6,4,2};
	int max=ArrayService.findMax(arr);
	System.out.println("Max Element in Array"+ max);
	
	
	int min=ArrayService.findMin(arr);
	System.out.println("Min Element in Array"+min);
	
	int Smax=ArrayService.findSmax(arr);
	System.out.println("Second Highest Element in Array"+Smax);
	
	int prime=ArrayService.findPrime(arr);
	System.out.println("sum of all prime number in Array"+prime);
	
	System.out.println("Enter Value To Find Pos In Array");
	int val=sc.nextInt();
	int pos=ArrayService.SeqArray(arr,val);
	  if(pos!=-1) {
      	System.out.println("number found at : "+ pos);
      }else {
      	System.out.println("not found");
      }
	}
	
	

}
