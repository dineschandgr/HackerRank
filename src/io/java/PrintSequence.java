package io.java;

	import java.util.*;
	import java.io.*;

	class PrintSequence{
	    public static void main(String []argh){
	    	System.out.println("enter value");
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            compute(a,b,n);
	        }
	        in.close();
	    }

	    public static void compute(int a,int b ,int n){
	        int sum  = 0;
	        for(int i=0;i<n;i++){
	        
	            a+= ( Math.pow(2, i) * b );
	            System.out.printf("%s ",a);

	            if(i==9 || i == n-1){
	                System.out.println();
	                break;
	            }
	        }
	    }
 }
	

