package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter Marks");
		int marks =  scanner.nextInt();
		
		if(marks >= 60) 
		{
			System.out.println("Grade A");
		}
		else if(marks >= 45) 
		{
			System.out.println("Grade B");
		}
		else if(marks >= 35) 
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
