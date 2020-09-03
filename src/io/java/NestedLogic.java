package io.java;

import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int dayActual = in.nextInt();
        int monthActual = in.nextInt();
        int yearActual = in.nextInt();
        int dayExpected = in.nextInt();
        int monthExpected = in.nextInt();
        int yearExpected = in.nextInt();

        int fine = 0;


        if(yearActual - yearExpected > 0)
            fine = 10000;
        else if(yearActual == yearExpected && monthActual > monthExpected)
            fine = 500 * (monthActual - monthExpected);
        else if(monthActual == monthExpected && dayActual > dayExpected)
            fine = 15 * (dayActual - dayExpected);

        System.out.println(fine);

    }
}
