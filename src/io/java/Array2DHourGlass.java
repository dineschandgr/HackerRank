package io.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Array2DHourGlass {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int[][] arr = new int[6][6];
		  for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }
		  
		  int result = hourglassSum(arr);


	        scanner.close();
		  System.out.println("length "+result);
	}

	
	  static int hourglassSum(int[][] arr) {
		  int maxSum = -63;	
		  int sum = 0;
		  for(int i = 0;i<4;i++) {
			  for(int j = 0;j<4;j++) {
				  sum = 0;
				  sum = sum + arr[i][j] + arr[i][j+1] + arr[i][j+2];
				  sum = sum + arr[i+1][j+1];
				  sum = sum + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];		  
				  
					  if(sum > maxSum)
						  maxSum = sum;					
			  }			  
		  }
		  return maxSum;
	  
	  }
	 
}
