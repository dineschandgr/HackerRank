package io.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {
	public static void main(String args[]) {
				System.out.println("Enter the no");
		        Scanner in = new Scanner(System.in);
		        int noOfLines = in.nextInt();
		        ArrayList<ArrayList<Integer>> numberList = new ArrayList();
		        for(int i=0;i<noOfLines;i++){
		           ArrayList<Integer> innerList = new ArrayList<>();
		           while(in.hasNext()){     
		            int num = in.nextInt();             
		             innerList.add(num);             
		           }
		           
		        }
		        int noOfQueries = in.nextInt();
		         System.out.println(noOfQueries);
		         for(int j=0;j<noOfQueries;j++) {
		              while(in.hasNext()){
		                 int a = in.nextInt(); 
		                 int b = in.nextInt(); 
		                 ArrayList<Integer> innerList = numberList.get(a);
		                 System.out.println(innerList.get(b));
		              }
		         }
	    }
	
}
