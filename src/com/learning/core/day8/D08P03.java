package com.learning.core.day8;

import java.util.Scanner;

public class D08P03 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public D08P03(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int data) {
        if (nItems == maxSize) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = data;
        nItems++;
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public void display() {
        System.out.print("Elements in circular queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println(queueArray[rear]);
    }

    public static void main(String[] args) {
        D08P03 queue = new D08P03(5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i=1;i<=4;i++)
        {
        	queue.insert(sc.nextInt());
        }

        queue.display();

        queue.remove();

        queue.display();
    }
}