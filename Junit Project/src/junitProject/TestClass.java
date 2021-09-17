package junitProject;

import org.junit.Test;

import org.junit.Assert;

public class TestClass {
	
    @Test
    public void isLeapYearTest(){
    	LeapYearImpl leapYearImpl = new LeapYearImpl();
    	Integer leapYr = 2000;
        Assert.assertTrue(leapYearImpl.isLeapYear(leapYr));
    }
    
    @Test
	public void isNonLeapYearTest(){
		LeapYearImpl leapYearImpl = new LeapYearImpl();
		Integer NonLeapYr = 2001;
	    Assert.assertFalse(leapYearImpl.isLeapYear(NonLeapYr));
	}
    
    @Test(expected = NullPointerException.class)
    public void isLeapYearNullTest(){
    	LeapYearImpl leapYearImpl = new LeapYearImpl();
    	Integer leapYr = null;
        Assert.assertNull(leapYearImpl.isLeapYear(leapYr));
    }
    
}