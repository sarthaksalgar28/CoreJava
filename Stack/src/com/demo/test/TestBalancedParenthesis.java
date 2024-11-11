package com.demo.test;

import com.demo.stack.MyStack;

public class TestBalancedParenthesis {
	public static void main(String[] args) {
		String str="{{{[](){}}}}";
		MyStack mk=new MyStack(20);
		boolean flag=isBalanced(mk,str);
		if(flag) {
			System.out.println("the string has balanced parenthesis");
		}else {
			System.out.println("the string has not  balanced parenthesis");
		}
	}

	private static boolean isBalanced(MyStack mk, String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(') {
				mk.push(ch);
			}else {
				if(!mk.isEmpty()) {
					char ch1=mk.pop();
					
					if((ch=='}' && ch1!='{') || (ch==']' && ch1!='[')|| (ch==')' && ch1!='(')) {
						return false;
						
					}
					}else {
						return false;
				}
			} 
			
		}if(mk.isEmpty()) {
			return true;
		}else {
			return false;
		}
	
	
	}
	
}

