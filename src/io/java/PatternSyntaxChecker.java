package io.java;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "batcatpat(nat";
		
		try {
			Pattern.compile(pattern);
		}catch(Exception e){
			System.out.println("invalid");
		}
	}

}
