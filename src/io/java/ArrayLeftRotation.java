package io.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
		int[] a = {2,6,9,1};
		
		Arrays.stream(reverseArray(a)).boxed().collect(Collectors.toList()).forEach(System.out::println);;
		
	}

	static int[] reverseArray(int[] a) {
		
		int length = a.length;
		int[] reverseArray = new int[length];
		for(int i=0 ; i<length; i++) {
			reverseArray[i] = a[length-i-1];
		}
		return reverseArray;
        

    }
}
