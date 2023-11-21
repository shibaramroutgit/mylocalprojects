package org.pro.testngx.parallelrun.methodrun.methodruntestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelMethodTest {

    @BeforeMethod
    public void beforeMethod()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " +id);
    }

    @Test
    public void testMethodOne()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: "+id);
    }

    @Test
    public void testMethodTwo()
    {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: "+id);
    }

    @AfterMethod
    public void afterMethod()
    {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " +id);
    }

}
