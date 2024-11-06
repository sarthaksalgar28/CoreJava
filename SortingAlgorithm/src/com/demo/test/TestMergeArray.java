package com.demo.test;
import java.util.Arrays;

public class TestMergeArray {
	public static void main(String[] args) {
		int[] arr1 = { 5,8,12,15,45,88 };
		int[] arr2 = {10,20,30,40,50,60,70,80 };
		int[] arr3 = new int[arr1.length + arr2.length];
		merge(arr1, arr2, arr3);
		System.out.println(Arrays.toString(arr3));

	}

	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, k = 0;
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i<arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;

		}
		while (j<arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;

		}

	}
}
