package com.demo.test;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class TestMergeSort {
	public static void main(String[] args) {
		int [] arr= {45,23,88,1,47,9,3};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		MergeSort(arr,0,arr.length-1);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void MergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid=(start+end)/2;
			MergeSort(arr, start, mid);
			MergeSort(arr, mid+1, end);
			Merge(arr, start,mid, end);
		}
				
		
		
	}

	private static void Merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		int n1=mid-start+1;
		int n2=end-mid;
		
		int[] leftarray=new int[n1];
		int[] rightarray=new int[n2];

		
		i=0;
		for(int a=start;a<=mid;a++) {
			leftarray[i]=arr[a];
			i++;
				
		}
		
		j=0;
		for(int a=mid+1;a<=end;a++) {
			rightarray [j]=arr[a];
			j++;
		}
		
		System.out.println("leftarray"+ Arrays.toString(leftarray));
		System.out.println("rightarray"+Arrays.toString(rightarray));
		
		i=0;
		j=0;
		k=start;
		while(i<n1 && j<n2) {
			if (leftarray[i]<rightarray[j]) {
				arr[k]=leftarray[i];
				i++;
				k++;
				
			}else {
				arr[k]=rightarray[j] ;
			j++;
			k++;
				
			}
		}
		
		while(i<n1) {
			arr[k]=leftarray[i];
			i++;
			k++;
	}
		while(j<n2) {
			arr[k]=rightarray[j];
			j++;
			k++;
			
		}

			System.out.println("Array : "+Arrays.toString(arr));
	}
	
}
