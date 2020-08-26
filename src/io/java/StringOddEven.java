package io.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringOddEven {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
         int noOfLines = in.nextInt();
         in.nextLine();
         List<String> strList = new ArrayList<String>();
         //for(int j=0;j<noOfLines;j++) {
             while(in.hasNext()){
                String str = in.nextLine();              
                strList.add(str);                            
             }


             for(String str : strList){                 
                 StringBuilder even = new StringBuilder();
                 StringBuilder odd = new StringBuilder();
                 for(int i=0;i<str.length();i++){
                     if(i%2==0) {
                    	 even.append(str.charAt(i));
                     }else {
                    	 odd.append(str.charAt(i));
                     }
                 }
                 System.out.println(even);
                 System.out.println(odd);
             }
             StringBuilder str = new StringBuilder("Hello");
             System.out.println(str.reverse());
                
        }//    
    }
