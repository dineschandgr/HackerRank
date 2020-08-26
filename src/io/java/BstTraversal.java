package io.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BstTraversal{

static void levelOrder(Node1 root){
	Queue<Node1> queue = new LinkedList<>();
	    if (root != null) {
	        queue.add(root);
	    }
	    while ( ! queue.isEmpty()) {
	        Node1 n = queue.remove();
	        System.out.print(n.data + " ");
	        if (n.left != null) {
	            queue.add(n.left);
	        }
	        if (n.right != null) {
	            queue.add(n.right);
	        }
	    }
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
            levelOrder(root);
        }	
}