package com.learning.core.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class D03P09 {

    public static void main(String[] args) 
    {
    	Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        System.out.println("Output: " + (Circle(strings) ? "Yes" : "No"));

        scanner.close();
    }

    public static boolean Circle(String[] strings) 
    {
        if (strings == null || strings.length == 0) {
            return false;
        }

        Map<Character, List<String>> adjacencyList = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, Integer> outDegree = new HashMap<>();

        for (String str : strings) 
        {
            char startChar = str.charAt(0);
            char endChar = str.charAt(str.length() - 1);

            if (!adjacencyList.containsKey(startChar)) 
            {
                adjacencyList.put(startChar, new ArrayList<>());
                inDegree.put(startChar, 0);
                outDegree.put(startChar, 0);
            }

            if (!adjacencyList.containsKey(endChar)) 
            {
                adjacencyList.put(endChar, new ArrayList<>());
                inDegree.put(endChar, 0);
                outDegree.put(endChar, 0);
            }

            adjacencyList.get(startChar).add(str);
            outDegree.put(startChar, outDegree.get(startChar) + 1);
            inDegree.put(endChar, inDegree.get(endChar) + 1);
        }

        int startCharCount = 0;
        int endCharCount = 0;

        for (char ch : adjacencyList.keySet()) 
        {
            int diff = outDegree.get(ch) - inDegree.get(ch);
            if (Math.abs(diff) > 1) 
            {
                return false;
            } 
            else if (diff == 1) 
            {
                startCharCount++;
            } 
            else if (diff == -1) 
            {
                endCharCount++;
            }
        }

        return (startCharCount == 1 && endCharCount == 1) || (startCharCount == 0 && endCharCount == 0);
    }
}