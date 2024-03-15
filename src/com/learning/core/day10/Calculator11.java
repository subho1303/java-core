package com.learning.core.day10;

public class Calculator11 
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b) {
	    return a * b;
	}

	public int div(int a, int b) {
	    if (b == 0) {
	        throw new IllegalArgumentException("Cannot divide by zero");
	    }
	    return a / b;
	}
	public int findMax (int[] arr,int max)
    {
		int maх=0;
    	for (int i = 0; i < arr.length; i++)
    	{
    		if (arr[i] > max)
    			{
    				max = arr[i];
    			}
    	}
		
		return maх;

    	}
}
