package io.java;

public class TreeDemo {

	public static void main(String[] args) {
		Tree tree1 = new Tree();
		tree1.addElement(7);
		tree1.addElement(29);
		tree1.addElement(9);
		tree1.addElement(1);
		tree1.addElement(6);
		tree1.addElement(8);
		tree1.addElement(10);
		System.out.println(tree1);
		System.out.println("is bst "+tree1.isBinarySearchTree());
	}

}
