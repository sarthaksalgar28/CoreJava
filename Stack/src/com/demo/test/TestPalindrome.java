package com.demo.test;
import java.util.Stack;
import java.util.Scanner;

class TestPalindrome {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack st = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            st.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!st.isEmpty()) {
            reverseString = reverseString+st.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}