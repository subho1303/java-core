package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
       
       int positiveCount = 0;
       int negativeCount = 0;
       int zeroCount = 0;
       
       System.out.println("Enter how many numbers you want: ");
       int n = sc.nextInt();
       
       for (int i = 0; i < n; i++) {
           System.out.println("Enter the numbers: ");
           int num = sc.nextInt();
           
           if (num > 0) {
               positiveCount++;
           } else if (num < 0) {
               negativeCount++;
           } else {
               zeroCount++;
           }
       }
       
       System.out.println("Positive numbers: " + positiveCount);
       System.out.println("Negative numbers: " + negativeCount);
       System.out.println("Zeroes: " + zeroCount);
       
   }
}
