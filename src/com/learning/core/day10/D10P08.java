package com.learning.core.day10;

import static org.junit.Assert.*;
import org.junit.Test;

public class D10P08 {

	 @Test
	    public void testMul() {
	        Calculator11 Calculator11 = new Calculator11();
	        assertEquals(6, Calculator11.mul(2, 3));
	        assertEquals(0, Calculator11.mul(0, 3));
	        assertEquals(-8, Calculator11.mul(4, -2));
	    }

	    @Test
	    public void testDiv() {
	        Calculator11 Calculator11 = new Calculator11();
	        assertEquals(3, Calculator11.div(9, 3));
	        assertEquals(-4, Calculator11.div(8, -2));
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testDivByZero() {
	        Calculator11 Calculator11 = new Calculator11();
	        Calculator11.div(10, 0);
	    }
	    
}
