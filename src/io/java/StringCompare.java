package io.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcometojava";
		getSmallestAndLargest(s,3);
	}

    public static void getSmallestAndLargest(String s, int k) {
    	   String sequence = s.substring(0, k);
    	    String smallest = sequence;
    	    String largest = sequence;

    	    // Complete the function

    	    for(int i = 1; i <= (s.length() - k); i++){
    	        sequence = s.substring(i, (i + k));

    	        if(sequence.compareTo(smallest) < 0){
    	            smallest = sequence;
    	        }
    	        if(sequence.compareTo(largest) > 0){
    	            largest = sequence;
    	        }            
    	    }
    	    	System.out.println(smallest);
    	    	System.out.println(largest);
    }
}
