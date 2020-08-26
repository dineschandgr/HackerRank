package io.java;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{

	public static int getHeight(Node root){
      //Write your code here
      Node current = root;
      int heightLeft = 0;
      while(current.left != null){
    	  heightLeft++;
        current = current.left;       
      }
      System.out.println("current is "+current.data);
      
      current = root;
      int heightRight = 0;
      while(current.right != null){
    	  heightRight++;
        current = current.right;       
      }
      
      if(heightLeft > heightRight)
    	  return heightLeft;
      
	return heightRight;
	
	
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}