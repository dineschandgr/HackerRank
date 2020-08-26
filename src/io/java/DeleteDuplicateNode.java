package io.java;

import java.util.Scanner;

class DeleteDuplicateNode
{
	private class Node{
		int data;
		Node next;
		Node(int d){
	        data=d;
	        next=null;
	    }
		
	}
	
    public Node removeDuplicates(Node head) {
    	Node start = head;
    	Node current = head;
    	while(current.next != null) {
    		current = start.next;
    		
    		if(start.data == current.data) {
    			start.next = current.next;
    			current = null;
    		}
    	}
		return head;
    }

	 public Node insert(Node head,int data)
     {
        Node p= new Node(data);		
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
        	DeleteDuplicateNode deleteDuplicateNode = new DeleteDuplicateNode();
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=deleteDuplicateNode.insert(head,ele);
              }
              head=deleteDuplicateNode.removeDuplicates(head);
              display(head);

       }
    }