package com.learning.core.day6;

import java.util.HashMap;
import java.util.Scanner;

public class D06P02 {

    public static void main(String[] args) {
        HashMap<String, Long> phonebook = new HashMap<>();

        phonebook.put("Joseph", 7882221113L);
        phonebook.put("Bob", 9876543210L);
        phonebook.put("Charlie", 7890123456L);
        phonebook.put("David", 5678901234L);
        phonebook.put("Emily", 3456789012L);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        Long phoneNumber = phonebook.get(name);

        if (phoneNumber != null) {
            System.out.println("Phone number for " + name + ": " + phoneNumber);
        } else {
            System.out.println("Name not found in phonebook.");
        }

        scanner.close();
    }
}