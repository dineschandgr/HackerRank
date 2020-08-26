package io.java;

import java.util.*;
import java.io.*;
private class Node{
    Node1 left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{

	public static int getHeight(Node1 root){
      //Write your code here
      Node1 current = root;
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

    public static Node1 insert(Node1 root,int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
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
        Node1 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}