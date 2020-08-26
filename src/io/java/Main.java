package io.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {

	public static final String[] strings = {
	        "Up",
	        "Down"	        
	    };
	
	public static void main(String a[]) {
		
		System.out.println(fibonacci(2));
		Random random = new Random();
		float bidPrice = random.nextInt(100) + random.nextFloat();
		float askPrice = random.nextInt(100) + random.nextFloat();
		
		float marketPrice = (bidPrice + askPrice) /2;
		 System.out.printf("Value: %1.2f", marketPrice);
		 
		 System.out.println("divisor sum is "+divisorSum(6));
		 
			String randomString = strings[random.nextInt(strings.length)];
			System.out.println(randomString);
	}
	
	
	 static int fibonacci(int n) {

	        if(n==1)
	           return n;
	        return n + fibonacci(n-1);
	    }

	 public static int divisorSum(int n) {

	        int sum = 0;
	        for(int i =1;i<=n;i++){
	            if(n%i == 0){
	                sum = sum + i;
	            } 
	        }
	        return sum;
	    }
}
