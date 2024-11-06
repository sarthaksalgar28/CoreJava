package com.demo.test;
import java.util.Arrays;

public class TestBubbleSort {
public static void main(String[] args) {
		int [] arr = {10,5,7,12,11,9};	
		System.out.println("Given Array " +Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted Array " + Arrays.toString(arr));
}

private static void bubbleSort(int[] arr) {
		int n = arr.length;
		int swapcnt=0;
		for (int i=0; i<n;i++) {
			for (int j=1;j<(n-i);j++) {
				if (arr[j-1]>arr[j] ) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapcnt++;
					}
				}
			
			System.out.println("iteration "+(i+1)+" Swapcount : "+swapcnt);
			System.out.println(Arrays.toString(arr));
			if(swapcnt==0) {
				break;
			}
			swapcnt=0;
		}
	}
}						