package io.java;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BinaryNumbers {

	  private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int count = 0;
	        String binaryString = Integer.toBinaryString(n);
	        String[] arrbinary = binaryString.split("0");
	        
		        for(String s : arrbinary) {
		        	if(s.length() > count)
		        		count = s.length();
		        }
	        
	        System.out.println(count);
	        scanner.close();
	    }
	

}
