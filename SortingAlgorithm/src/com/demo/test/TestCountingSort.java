package com.demo.test;
import java.util.Arrays;

public class TestCountingSort {
    public static void main(String[] args) {
        int[] arr = {23, 5, 66, 87, 4, 66, 54, 9};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
        
        countingSort(arr);
        
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }

    private static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return; 
        }

        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

     
        int[] count = new int[max + 1];

        
        for (int num : arr) {
            count[num]++;
        }

      
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        
        int[] output = new int[arr.length];
        for (int j = arr.length - 1; j >= 0; j--) {
            output[count[arr[j]] - 1] = arr[j];
            count[arr[j]]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
       // System.arraycopy(output, 0, arr, 0, arr.length);
    }
    
}