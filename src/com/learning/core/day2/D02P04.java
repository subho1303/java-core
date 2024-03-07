package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3){
			System.out.println("The largest number is:"+n1);
			}
		else if(n2>n1 && n2>n3){
			System.out.println("The largest number is:"+n2);
		}
		else {
			System.out.println("The largest number is:"+n3);	
		}
		}
		
}
