package com.learning.core.day2;

import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args) {
		int i;
		Scanner c= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=c.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0) {
			System.out.println(i);
		}
			}
	}
		
}

