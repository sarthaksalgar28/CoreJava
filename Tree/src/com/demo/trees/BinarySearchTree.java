package com.demo.trees;

public class BinarySearchTree {
	
	class node{
		int data;
		node left;
		node right;
		public node(int val) {
			
			this.data = val;
			this.left = null;
			this.right = null;
		}
		
		
	}
	
	node root;

	public BinarySearchTree() {
		
		this.root = null;
	}
	
	public void insertValue(int val) {
		root=insertData(root,val);
	}

	private node insertData(node root, int val) {
		node newnode=new node(val);
		if(root==null) {
			root=newnode;
			return root;
		}
		else {
			if(val<root.data) {
				root.left= insertData(root.left, val);
			}else {
				root.right= insertData(root.right, val);

			}
		}
		return root;
		
	}
	
	public void inorder() {
		inorderTraversal(root);
		System.out.println("-----------------");
	}

	private void inorderTraversal(node root) {
		if (root!=null) {
			
		
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
		}
	}
	
	public void preOrder() {
		preorderTraversal(root);
		System.out.println("-----------------");
	}

	private void preorderTraversal(node root) {
		if (root!=null) {
		System.out.println(root.data);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		}
		
	}
	
	public void postOrder() {
		postorderTraversal(root);
		System.out.println("-----------------");
	}

	private void postorderTraversal(node root) {
		// TODO Auto-generated method stub
		if (root!=null) {
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data);
		}
		
	}
	
	public boolean binarySearchValue(int val) {
		return binarySearchData(root,val);
	}

	private boolean binarySearchData(node root, int val) {
		// TODO Auto-generated method stub
		if(root==null) 
			return false;
		
		if(root.data==val) {
			return true;
		}
		else if(val<root.data) {
			return binarySearchData(root.left, val);
		}
		else {
			return binarySearchData(root.right, val);

		}
	}

	

}





































// Total Traded Days : 37 
////Total Loss Days : 2 
//Total Traded Profit : 74K 
//Total Traded Loss : 23k + 14k = 37K
////Total : 37K
//Kite Loss : 6K
//Diwali : 8K
// Slice Emi :  2k
//shoes : 3k 
//daily expenditure : 6K
//Remaining : 12K 


