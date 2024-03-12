package com.learning.core.day7;

class Node 
{
	  double data;
	  Node next;

	  public Node(double data) {
	    this.data = data;
	  }
}

class Stack 
{
	  private Node top;

	  public Stack() 
	  {
	    top = null;
	  }

	  public boolean isEmpty() 
	  {
	    return top == null;
	  }

	  public void push(double data) 
	  {
	    Node newNode = new Node(data);
	    newNode.next = top;
	    top = newNode;
	  }

	  public double pop() 
	  {
	    if (isEmpty()) {
	      System.out.println("Stack underflow");
	      return Double.MIN_VALUE; 
	    }
	    double data = top.data;
	    top = top.next;
	    return data;
	  }

	  public void display() 
	  {
	    Node temp = top;
	    System.out.print("The elements of the stack are: ");
	    while (temp != null) {
	      System.out.print(temp.data + " ");
	      temp = temp.next;
	    }
	    System.out.println("null");
	  }
}
	
public class D07P02 {
	public static void main(String[] args) {
	    Stack stack = new Stack();

	    stack.push(10.0);
	    stack.push(20.0);
	    stack.push(30.0);
	    stack.push(40.0);

	    stack.display();

	    stack.pop();
	    stack.pop();

	    stack.display();
	  }
	
}
