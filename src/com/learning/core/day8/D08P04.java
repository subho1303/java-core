package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;

public class D08P04 {
    public static void main(String[] args) {
 
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Yellow");
        queue1.add("Green");
        queue1.add("Pink");
        queue1.add("Black");
        queue1.add("Blue");
        queue1.add("White");

        if (!queue1.isEmpty()) {
            System.out.println("Output 1:");
            System.out.println("Not Empty");
        } else {
            System.out.println("Output 1:");
            System.out.println("Empty");
        }

        Queue<String> queue2 = new LinkedList<>();

        if (!queue2.isEmpty()) {
            System.out.println("\nOutput 2:");
            System.out.println("Not Empty");
        } else {
            System.out.println("\nOutput 2:");
            System.out.println("Empty");
        }
    }
}