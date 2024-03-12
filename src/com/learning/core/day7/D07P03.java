package com.learning.core.day7;

import java.util.Stack;

public class D07P03 {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "JavaQuiz";
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverseString(input));
    }
}
