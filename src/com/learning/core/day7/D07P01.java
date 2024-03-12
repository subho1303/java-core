package com.learning.core.day7;

public class D07P01 {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public D07P01(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String element) {
        if (top < maxSize - 1) {
            stackArray[++top] = element;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            return "Stack Underflow";
        }
    }

    public void display() {
        
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	D07P01 stack = new D07P01(5);

        // Pushing elements onto the stack
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");

        // Displaying stack after pushing
        System.out.print("After Pushing 4 Elements: ");
        stack.display();

        // Popping an element from the stack
        String poppedElement = stack.pop();
        System.out.print("After a pop: ");
        stack.display();
    }
}