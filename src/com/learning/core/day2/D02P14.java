package com.learning.core.day2;

import java.util.Scanner;

public class D02P014 {
	public static void main(String[] args) 
	{
		int i;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number =  scanner.nextInt();
			
		System.out.println("Enter power");
		int power =  scanner.nextInt();
		int result=1;
		
		for(i=1;i<=power;i++) {
			result=result*number;
		}
		System.out.println("The answer is:"+result);

}
}