package org.pro.testngx.parallelrun.testrun.testruntestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTestTwo {
    @BeforeClass
    public void beforeClassMethod()
    {
        long id = Thread.currentThread().getId();
        System.out.println("beforeClassMethod--"+id);
    }

    @Test
    public void testMethodOne()
    {
        long id = Thread.currentThread().getId();
        System.out.println("testMethodOne--"+id);
    }
    @Test
    public void testMethodTwo()
    {
        long id = Thread.currentThread().getId();
        System.out.println("testMethodTwo--"+id);
    }

    @AfterClass
    public void afterClassMethod()
    {
        long id = Thread.currentThread().getId();
        System.out.println("afterClassMethod--"+id);
    }
}
