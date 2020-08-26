package io.java;

import java.util.Scanner;

public class Palindrome {

	    public static void main(String[] args) {
	        System.out.println("Enter the String");
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        
	        boolean isPalindrome = false;
	        outerscope:
	        for(int i=1;i<=A.length();i++){
	            for(int j = A.length()-i;j<=i; j--){
	                if(A.charAt(i-1) == A.charAt(j)){
	                	isPalindrome = true;
	                    break;
	                }else {
	                	isPalindrome = false;
	                	break  outerscope;
	                }

	            }
	             
	        }
	        System.out.println(isPalindrome);
	        //solve(10.25,17,5);
	        solve(12.00,20,8);
	    }
	    
	    static void solve(double meal_cost, int tip_percent, int tax_percent) {
	        double tipAmount  = (meal_cost * ((double)tip_percent / 100));
	        double taxAmount  = ( meal_cost * ((double)tax_percent / 100));
	        double totalCost = ( meal_cost + tipAmount + taxAmount);
	        System.out.println("totalCost "+totalCost);
	        System.out.println((int)Math.round(totalCost));
	    }
	}
