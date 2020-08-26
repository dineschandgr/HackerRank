package io.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.print.attribute.HashAttributeSet;

public class StringRegexToken {

	public static void main(String[] args) {
		String str = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
		
		List<String> tokenList = Arrays.asList(str.trim().split("[ , !,?._'@]+"));
		long count = tokenList.stream().count();
		System.out.println(count);
		tokenList.forEach(System.out::println);
		//System.out.println(newStr);
		System.out.println("aaa "+isAnagram("madap","Madam"));
	}
	          
	static boolean isAnagram(String a, String b) {
        // Complete the function

        String str1 = a.toUpperCase();
        String str2 = b.toUpperCase();
        
        if(str1 == null || str2 == null || str1.length() != str2.length())
        	return false;
        
        Map<Character,Integer> countMap = new HashMap<>();
        
        for(int i = 0; i< str1.length();i++) {
        	int count = 1;
        	Character ch = str1.charAt(i);
        	if(countMap.get(ch) != null) {
        		count = countMap.get(ch);
        		count++;
        	}
        	countMap.put(ch, count);
        }
        
        for(int i = 0; i< str2.length();i++) {
        	int count = 1;
        	Character ch = str2.charAt(i);
        	System.out.println("ch "+ch);
        	if(countMap.get(ch) == null)
        		return false;
        	
        	Integer charCount = countMap.get(ch);
        	if(charCount == 0)
        		return false;
        	else { 
        		charCount--;
        		countMap.put(ch, charCount);
        		System.out.println("countMap 2 inserted");
        	}
        	
        }
        
        return true;
    }

}
