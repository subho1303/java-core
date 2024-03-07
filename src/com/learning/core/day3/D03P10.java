package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {
	    public static int largestPrefixSuffix(String str)
	    {
	        int n = str.length();
	        	if (n < 2) {
	            return 0;
	        }
	 
	        int len = 0;
	       
	        int i = 0;
	        while (i < n / 2) {
	            int j1 = 0, j2 = (n - 1) - i;
	            boolean isPrefixSuffix = true;
	            while (j1 <= i) {
	                if (str.charAt(j1) != str.charAt(j2)) {
	                    isPrefixSuffix = false;
	                }
	                j1++;
	                j2++;
	            }
	            if (isPrefixSuffix)
	                len = i + 1;
	            i++;
	        }
	        return len;
	    }
	 
	    public static void main(String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter the String: ");
	        String s = sc.nextLine();
	        System.out.println(largestPrefixSuffix(s));
	    }
	}


