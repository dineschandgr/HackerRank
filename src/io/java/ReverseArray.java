package io.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int rotations = 4;
		int rotatedArray[] = null;
		for(int i= 0;i<rotations;i++)
			rotatedArray = rotateArray(a);
		
			Arrays.stream(rotatedArray).forEach(e -> System.out.print(e + " "));
			
			for(int i = 0;i<a.length-1;i++)
				System.out.println(a [ ( i + rotations ) %a.length ]);

		
	}

	static int[] rotateArray(int[] a) {
		//1 2 3 4 5
		//0 1 2 3 4
		//2 3 4 5 1
		
		int first = 0;
		int i = 0;
		while(i<a.length-1) {
			if(i==0)
			 first = a[0];
			 a[i] = a[i+1];
			i++;
		}
		a[i] = first;
		return a;
		
    }
}
