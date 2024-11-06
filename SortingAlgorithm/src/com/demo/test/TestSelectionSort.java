package com.demo.test;
import java.util.Arrays;

public class TestSelectionSort {
	public static void main(String[] args) {
		int [] arr= {23,5,66,87,4,66,54,9};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void SelectionSort(int[] arr) {
		 for (int i = 0; i < arr.length-1; i++) {
			 
			 int min_ind=i;
			 for (int j = i+1; j < arr.length; j++) {
				 if (arr[j]<arr[min_ind]) {
					 min_ind=j;
					
				} 
				 
				
			}
			 int temp=arr[i];
			 arr[i]=arr[min_ind];
			 arr[min_ind]=temp;
			System.out.println("Minimum number "+arr[i]+"==="+arr[min_ind]);
			 System.out.println(Arrays.toString(arr));
			
		}
		
	}
}
