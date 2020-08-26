package io.java;

import java.util.Arrays;

public class BubbleSort {

	static int swaps;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,1,2};
		sortArray(a);
		System.out.println(Arrays.toString(a));
		System.out.println(swaps);
	}

	public static void sortArray(int a[]) {
		
	    // Track number of elements swapped during a single array traversal
		for (int i = 0; i < a.length; i++) {
		    // Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;
		    
		    for (int j = 0; j < a.length - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            swap(a, j);
		            numberOfSwaps++;
		            swaps++;
		        }
		    }
		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
	}

	private static void swap(int[] a, int j) {
		int temp = a[j];
		a[j] = a[j+1];
		a[j+1] = temp;
	}
	

}
