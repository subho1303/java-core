package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P14 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements");
        for (int i = 0; i < n1; i++) 
        {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements");
        for (int i = 0; i < n2; i++) 
        {
            arr2[i] = scanner.nextInt();
        }

        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n1 && j < n2) 
        {
            if (arr1[i] < arr2[j]) 
            {
                union.add(arr1[i]);
                i++;
            } 
            else if (arr1[i] > arr2[j]) 
            {
                union.add(arr2[j]);
                j++;
            } else 
            {
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < n1) 
        {
            union.add(arr1[i]);
            i++;
        }

        while (j < n2) 
        {
            union.add(arr2[j]);
            j++;
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        
        scanner.close();
    }
}
