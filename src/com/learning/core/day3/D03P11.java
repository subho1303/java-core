package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P11 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words in the dictionary: ");
        String[] dictionary = scanner.nextLine().split(" ");
        System.out.print("Enter the pattern to match: ");
        String pattern = scanner.nextLine();

        List<String> result = findMatchingStrings(dictionary, pattern);
        System.out.println("Output: " + String.join(" ", result));

        scanner.close();
    }

    public static List<String> findMatchingStrings(String[] dictionary, String pattern) 
    {
        List<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (word.length() == pattern.length() && matchesPattern(word, pattern)) 
            {
                result.add(word);
            }
        }
        return result;
    }

    public static boolean matchesPattern(String word, String pattern) 
    {
        char[] mapping = new char[26]; 

        for (int i = 0; i < word.length(); i++) 
        {
            char patternChar = pattern.charAt(i);
            char wordChar = word.charAt(i);

            if (mapping[patternChar - 'a'] == 0) 
            {
                mapping[patternChar - 'a'] = wordChar;
            } 
            else 
            {
                if (mapping[patternChar - 'a'] != wordChar) 
                {
                    return false;
                }
            }
        }
        return true;
    }
}
