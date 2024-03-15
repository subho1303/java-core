package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class D10P09 {

    @Test
    public void testFindMaxWithPositiveValues() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int expectedOutput = 6;

        int actualOutput = findMax(arr);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindMaxWithNegativeValues() {
        int[] arr = {-1, -2, -3, -4, -5, -6};
        int expectedOutput = -1;

        int actualOutput = findMax(arr);

        assertEquals(expectedOutput, actualOutput);
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        { 
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}