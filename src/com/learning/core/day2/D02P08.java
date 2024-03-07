package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {
	public static void main(String[] args) {
		int i;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start number");
		int n1=sc.nextInt();
		System.out.println("Enter the end number");
		int n2=sc.nextInt();
		for(i=n1;i<=n2;i++) {
			sum+=i;
		}
		System.out.println( + sum);
		}

}
