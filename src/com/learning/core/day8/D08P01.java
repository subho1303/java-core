package com.learning.core.day8;

import java.util.Scanner;

class D08P01 
{		
		private int size;
	    private int[] queueArray;
	    private int front,rear;
	    
	    public D08P01(int size)
	    {
	    	this.size = size;
	    	this.queueArray = new int[size];
	    	this.front = this.rear = -1;
	    }
	    
	    public void enqueue(int item)
	    {
	    	if(rear == size -1)
	    	{
	    		System.out.println("Queue is full)");
	    		return;
	    	}
	    	else if(front == -1 && rear == -1)
	    	{
	    		front = rear = 0;
	    	}
	    	else
	    	{
	    		rear ++;
	    	}
	    	queueArray[rear] = item;
	    }
	    public void dequeue()
	    {
	    	if(front == -1)
	    	{
	    		System.out.println("Queue is empty");
	    		return;
	    	}
	    	else if(front == rear)
	    	{
	    		front = rear = -1;
	    	}
	    	else
	    	{
	    		front++;
	    	}
	    }
	    public void display() 
	    {
	        if (front == -1) 
	        {
	            System.out.println("Queue is empty");
	            return;
	        } 
	        else 
	        {
	            for (int i = front; i <= rear; i++) 
	            {
	                System.out.print(queueArray[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) 
	    {
	    	Scanner scanner = new Scanner(System.in);
	    	int size = 4;
	    	System.out.println("Enter Elements");
	    	D08P01 queueArray = new D08P01(size);
	    	for (int i = 0; i < size; i++) 
	    	{
	    		int element = scanner.nextInt();
	    		queueArray.enqueue(element);
	    	}
	    	System.out.println("Elements in queue");
	    	queueArray.display();
		
	    	queueArray.dequeue();
	    	
	    	System.out.println("After removing first elemet");
	    	queueArray.display();
		
	    	scanner.close();
	    }
	

}
