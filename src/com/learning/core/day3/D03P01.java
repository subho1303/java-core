package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		
		String reverse = "";
		String str = scanner.nextLine();
		int size = str.length();
		System.out.println("Length of String: "+size);
		
		
		System.out.println("Upper case:"+str.toUpperCase() );
		
		for(int i  = (size-1) ; i >= 0 ; --i) {
			reverse = reverse + str.charAt(i);
			
		}
		
		if(str.equals(reverse)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
		
	}

		
		
	}



