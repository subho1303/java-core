package com.learning.core.day7;

import java.util.Stack;

public class D07P04 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (Character.isDigit(currentChar)) {
               
                operands.push(currentChar - '0');
            } else {
               
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(currentChar)) {
                    
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    int result = applyOperation(operand1, operand2, operator);
                   
                    operands.push(result);
                }
                
                operators.push(currentChar);
            }
        }

        
        while (!operators.isEmpty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            int result = applyOperation(operand1, operand2, operator);
            operands.push(result);
        }

        
        return operands.peek();
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    private static int applyOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String input = "10+2*6";
        System.out.println("Input: " + input);
        System.out.println("Output: " + evaluateExpression(input));
    }
}
