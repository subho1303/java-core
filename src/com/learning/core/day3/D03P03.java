package com.learning.core.day3;

import java.util.Scanner;

public class D03P03 {
	public static void main(String[] args) {
        int[] numbers = new int[18];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 18 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
       

    
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += numbers[i];
        }
        numbers[15] = sum;

        double average = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average /= numbers.length;
        numbers[16] = (int) Math.round(average); 

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        numbers[17] = smallest;

        System.out.println("Modified array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
