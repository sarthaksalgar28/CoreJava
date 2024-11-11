package com.demo.test;

import com.demo.trees.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.insertValue(15);
		bst.insertValue(20);
		bst.insertValue(5);
		bst.insertValue(7);
		bst.insertValue(71);
		bst.insertValue(84);
		bst.insertValue(62);
		
		bst.inorder();
		bst.preOrder();
		bst.postOrder();
		
		if (bst.binarySearchValue(62)) {
			System.out.println("data found");
		} else {
			System.out.println("data not found");

		}
		
		
		if (bst.binarySearchValue(624)) {
			System.out.println("data found");
		} else {
			System.out.println("data not found");

		}

	}

}
