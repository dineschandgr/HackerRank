package io.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchProblem {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		try {
			int num1 = s.nextInt();
			int num2 = s.nextInt();
		
		
			int quotient = num1/num2;
			System.out.println(quotient);
		}catch (ArithmeticException | InputMismatchException ex) {
			System.out.println(ex.getClass().getName());
		} 
		finally{
			s.close();
		}
	}
    
}
