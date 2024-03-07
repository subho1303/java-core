package com.learning.core.day2;

import java.util.Scanner;

public class D02P06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ch= new Scanner(System.in);
		
		System.out.println("Enter a number to know which day");
		int number=ch.nextInt();
		
		if(number==1)
		{
			System.out.println("Monday");
		}
		else if(number==2)
		{
			System.out.println("Tuesday");

		}
		else if(number==3)
		{
			System.out.println("Wednesday");

		}
		else if(number==4)
		{
			System.out.println("Thursday");

		}
		else if(number==5)
		{
			System.out.println("Friday");

		}
		else if(number==6)
		{
			System.out.println("Saturday");

		}
		else if(number==7)
		{
			System.out.println("Sunday");

		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}


