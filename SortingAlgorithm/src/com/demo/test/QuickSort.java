package com.demo.test;
import java.util.Arrays;

public class QuickSort{
	public static void main(String[] args) {
		int [] arr= {12,55,4,99,1,8,6};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		int n=arr.length-1;
		QuickSort(arr,0,n);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void QuickSort(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int pivot=first;
		int i=first;
		int j=last;
		
		if(i<j) {
			while(i<j) {
				while(arr[i]<=arr[pivot] && j>i) {
					i++;
				}
				while(arr[j]>arr[pivot] && j>pivot) {
					j--;
				}
				if(i<j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			int temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			
			System.out.println("pivot"+arr[j]+"-----"+j);
			System.out.println(Arrays.toString(arr));
			QuickSort(arr, first, j-1);
			QuickSort(arr, j+1, last);
			
		}
		
		
	}
}