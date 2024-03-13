package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;

public class D08P05 
{

	public static Queue<Integer>[] splitQueue(Queue<Integer> originalQueue) 
	{
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!originalQueue.isEmpty()) 
        {
            int element = originalQueue.poll();
            if (element % 2 == 0) {
                evenQueue.add(element);
            } else {
                oddQueue.add(element);
            }
        }

        return new Queue[]{oddQueue, evenQueue};
    }

    public static void main(String[] args) 
    {
        Queue<Integer> originalQueue = new LinkedList<>();
        originalQueue.add(2);
        originalQueue.add(7);
        originalQueue.add(9);
        originalQueue.add(4);
        originalQueue.add(6);
        originalQueue.add(5);
        originalQueue.add(10);

        Queue<Integer>[] splitQueues = splitQueue(originalQueue);

        System.out.println("Odd Queue:");
        for (Integer element : splitQueues[0]) 
        {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Even Queue:");
        for (Integer element : splitQueues[1]) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
