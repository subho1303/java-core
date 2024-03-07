package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int n1=sc.nextInt();
		System.out.println("Enter the 2st number:");
		int n2=sc.nextInt();
		System.out.println("Enter the operator:");
		char operator =sc.next().charAt(0);
		int addition =n1+n2;
		int substract =n1-n2;
		int divide =n1%n2;
		int multiply =n1*n2;
		switch(operator){
		case '+':
			System.out.println("The answer is:"+addition);
			break;
		case '-':
			System.out.println("The answer is:"+substract);
			break;
		case '%':
			System.out.println("The answer is:"+divide);
			break;
		case '*':
			System.out.println("The answer is:"+multiply);
			break;
		} 
		
	}
	
	

}
