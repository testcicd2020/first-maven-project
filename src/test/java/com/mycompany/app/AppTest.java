package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{ 

    public boolean isPositiveNumber(int num) {
 	if( num >= 0) {
		return true;	
	} else {
		return false;
	}
    }
   /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        boolean result = isPositiveNumber(-10);
        assertTrue( result);
    }
}
