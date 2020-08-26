package io.java;

public class ArrayComputeDifference {

	private static int maxDifference;
	
	public static void main(String[] args) {
		int[] a = {1,2,5,6,7,8,9};
		computeDifference(a);
		System.out.println(maxDifference);
	}

	public static void computeDifference(int[] elements){
		
		int min = elements[0];
		int max = elements[0];
		
		for(int i=0;i<elements.length;i++){
			if(elements[i] < min)
				min = elements[i];
			if(elements[i] > max)
				max = elements[i];
        }
		 
 		maxDifference = max - min;
        	
    }
}
