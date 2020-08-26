package io.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SparseArray {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	int[] matchingStrCount = new int[queries.length];

        HashMap<String,Integer> map = new HashMap<>();

        //O(n)
        for(String str : strings){
            int count = map.get(str)!= null ? map.get(str) : 0;
            map.put(str,++count);
        }

        int index = 0;
        //O(n)
        for(String query : queries){
            int count = map.get(query) != null ? map.get(query) : 0;
            matchingStrCount[index++] = count;
        }

        return matchingStrCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(String.valueOf(res[i]));
        }



        scanner.close();
    }
}
