package io.java;

public class Tree {

	private class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	
	
	public void addElement(int element) {
		
		Node newNode = new Node(element);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node current = root;
		
		while(true) {
			if(element < current.data) {
				if(current.left == null) {
					current.left = newNode;
					break;
				}
				current = current.left;
			}else {
				if(current.right == null) {
					current.right = newNode;
					break;
				}
				current = current.right;
			}
		}
	}
	
	public boolean isBinarySearchTree() {
		return isBinarySearchTree(root);
	}
	
	private boolean isBinarySearchTree(Node root) {
		
		if(root == null)
			return true;
		
		if(root.left == null || root.right == null)
			return true;
		
		if(root.left.data > root.data || root.right.data < root.data)
			return false;
		
		isBinarySearchTree(root.left);
		isBinarySearchTree(root.right);
		
		return true;
		
	}
}
