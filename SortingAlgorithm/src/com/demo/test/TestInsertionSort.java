package com.demo.test;
import java.util.Arrays;

public class TestInsertionSort {
	
	public static void main(String[] args) {
		int [] arr= {25,66,47,9,12,65,9};
		System.out.println("BEFORE SORTING: ");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("AFTER SORTING");
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
			}	
			arr[j+1]=key;
			System.out.println("number of iterations"+i);
			System.out.println(Arrays.toString(arr));
			
		}
		
	}
	

}
