package com.demo.service;

public class ArrayService {
	
	public static int findMax(int [] arr) {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		return max;
		
	}

	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static int findSmax(int[] arr) {
		int Smax=arr[0],max=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]> Smax) {
				max=Smax;
				Smax=arr[i];
		
			}
			if (arr[i]>max && arr[i]<Smax) {
				max=arr[i];
				
			}
		}
		return max;
	}

	public static int findPrime(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if (isPrime(arr[i])) {
				sum=sum+arr[i];
				
			}
		}
		return sum;
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <=num/2; i++) {
			
		
		if(num%i==0) {
			return false;
		}
		}return true;
	}

	public static int SeqArray(int[] arr,int val) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==val) {
				return i;
			}
			
		}
		return -1;
	}

}
