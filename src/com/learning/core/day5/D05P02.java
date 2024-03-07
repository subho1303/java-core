package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 
{
    public static void main(String[] args) 
    {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list of student names separated by spaces:");
        String input = scanner.nextLine();
        String[] namesArray = input.split(" ");

        for (String name : namesArray) 
        {
            studentNames.add(name);
        }

        System.out.println("Enter the name to search:");
        String searchName = scanner.nextLine();

        if (studentNames.contains(searchName)) 
        {
            System.out.println("Found");
        } 
        else 
        {
            System.out.println("Not found");
        }
    }
}