package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {
    private Stack<Integer> mainStack;
    private Stack<Integer> D07P06;

    public D07P06() {
        mainStack = new Stack<>();
        D07P06 = new Stack<>();
    }

    public void push(int item) {
        mainStack.push(item);
        if (D07P06.isEmpty() || item <= D07P06.peek()) {
            D07P06.push(item);
        }
    }

    public int pop() {
        int poppedItem = mainStack.pop();
        if (poppedItem == D07P06.peek()) {
            D07P06.pop();
        }
        return poppedItem;
    }

    public int getMin() {
        return D07P06.peek();
    }

    public static void main(String[] args) {
        D07P06 stack = new D07P06();
        stack.push(16);
        stack.push(15);
        stack.push(29);
        stack.push(19);
        stack.push(18);

        System.out.println("Minimum Element: " + stack.getMin());
    }
}
