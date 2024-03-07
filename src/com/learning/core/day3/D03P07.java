package com.learning.core.day3;

import java.util.Scanner;

public class D03P07
{
		
	    static void printAllSubsequence(String input_str, String output_str){
	        if (input_str.length()==0) {
	            System.out.println( output_str );
	            return;
	        }
	        printAllSubsequence(input_str.substring(1), output_str + input_str.charAt(0));
	    
	        printAllSubsequence(input_str.substring(1), output_str);
	    }
	    
	    public static void main(String args[]){
	    	Scanner sc= new Scanner(System.in);
	        String output_str = "";
	        System.out.println("Enter the String:");
	        String input_str = sc.nextLine();
	        printAllSubsequence(input_str, output_str);
	    }
	}


