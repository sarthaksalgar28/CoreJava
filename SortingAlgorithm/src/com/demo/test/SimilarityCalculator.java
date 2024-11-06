package com.demo.test;

import java.util.Scanner;

public class SimilarityCalculator {
	 public static int calculateSimilarity(String s) {
	        int totalSimilarity = 0;
	        int n = s.length();

	       
	        for (int i = 0; i < n; i++) {
	            String suffix = s.substring(i); 
	            int similarity = 0;

	            
	            for (int j = 0; j < suffix.length(); j++) {
	                if (j < n && s.charAt(j) == suffix.charAt(j)) {
	                    similarity++;
	                } else {
	                    break;
	                }
	            }

	            totalSimilarity += similarity;
	        }

	        return totalSimilarity;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = Integer.parseInt(scanner.nextLine()); 

	        for (int i = 0; i < t; i++) {
	            String s = scanner.nextLine(); 
	            int result = calculateSimilarity(s);
	            System.out.println(result);

	        scanner.close();
	    }
}
}