package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {
	public static String replaceSpaces(String input) 
    {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) 
        {
            if (c == ' ') 
            {
                result.append("%20");
            } 
            else 
            {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) 
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the value: ");
        String input = sc.nextLine();
        String output = replaceSpaces(input);
        System.out.println(output); // 
    }
}

