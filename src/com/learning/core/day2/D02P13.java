package com.learning.core.day2;

import java.util.Scanner;

public class D02P013 {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		long fact = 1;
		for(int i = 1 ; i <= number ; i++)
		{
			fact *= i;
		}
		
		System.out.println("Factorial:"+fact);
	}
}
