package io.java;

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.lang.reflect.Method;

class Printer<T>
{
   public void printArray(T[] t){
	   
	   for(T i : t)
           System.out.println(i);
		/*
		 * if(t instanceof Integer[]){ for(T i : t) System.out.println(i); }else if(t
		 * instanceof String[]){ for(T i : t) System.out.println(i);
		 * 
		 * }
		 */
   }
}

public class GenericsProblem {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}