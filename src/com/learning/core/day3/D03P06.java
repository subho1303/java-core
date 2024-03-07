package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        System.out.println("Enter the number of last vowels to count:");
        int n = sc.nextInt();
        
        String lastNVowels = getLastNVowels(input, n);
        if (lastNVowels.equals("Mismatch in vowels count")) {
            System.out.println(lastNVowels);
        } else {
            System.out.println("Last " + n + " vowels: " + lastNVowels);
        }
    }
    
    public static String getLastNVowels(String input, int n) {
        StringBuilder vowels = new StringBuilder();
        int count = 0;
        int vowelsFound = 0;
        
        for (int i = input.length() - 1; i >= 0 && vowelsFound < n; i--) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch);
                vowelsFound++;
            }
        }
        
        if (vowelsFound < n) {
            return "Mismatch in vowels count";
        }
        
        return vowels.reverse().toString();
    }

}
