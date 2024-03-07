package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number from 1-40");
		int num1=sc.nextInt();
		System.out.println("Enter the second number from 1-40");
		int num2=sc.nextInt();
		int[] a=new int[5];
		System.out.println("Enter the elements in array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(" the elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		boolean ans1= false;
		boolean ans2=false;
		for(int i=0;i<a.length;i++) {
			if(num1 == a[i]) {
				ans1=true;
			}
			if(num2 == a[i]) {
				ans2=true;
			}
		}
		if(ans1 && ans2) {
			System.out.println("Bingo");
		}
		else
		{
			System.out.println("Not found!!!!");
		}
		}

}
