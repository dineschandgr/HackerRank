package io.java;

import java.util.Arrays;
import java.util.Scanner;

public class TimeComplexityPrimeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int totalNum = in.nextInt();

        for(int i = 0; i<totalNum; i++){
            int num = in.nextInt();
            checkIfPrime(num);
        }
        
        in.close();
    }

	private static void checkIfPrime(int num) {
		
			int sqrt = (int) Math.sqrt(num);
			boolean isPrime = num == 1 ? false : true;
			for(int  i = 2; i <= sqrt; i++) {
				
				if(num % i == 0 ) {
					isPrime = false;
					break;
				}
					
			}
			
			if(isPrime)
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	
	
}