package com.learning.core.day8;

import java.util.Scanner;

class Node 
{
    int data;
    Node next;

    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class D08P02 
{
    private Node front, rear;

    public D08P02() 
    {
        this.front = this.rear = null;
    }

    public void enqueue(int item) 
    {
        Node newNode = new Node(item);
        if (rear == null) 
        {
            front = rear = newNode;
        } 
        else 
        {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() 
    {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) 
        {
            rear = null;
        }
    }

    public void display() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        D08P02 queue = new D08P02();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in the queue:");
        for (int i = 0; i < 5; i++) 
        {
            int element = scanner.nextInt();
            queue.enqueue(element);
        }

        System.out.print("Elements in queue: ");
        queue.display();

        
        queue.dequeue();
        queue.dequeue();

      

        System.out.print("After remvoing two elements: ");
        queue.display();

        scanner.close();
    }
}