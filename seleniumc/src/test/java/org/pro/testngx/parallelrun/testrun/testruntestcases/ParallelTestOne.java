package org.pro.testngx.parallelrun.testrun.testruntestcases;

import org.testng.annotations.*;

public class ParallelTestOne {

    @BeforeTest
    public void beforeTestMethod()
    {
        long id = Thread.currentThread().getId();
        System.out.println("beforeTestMethod--"+id);
    }
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
    @AfterTest
    public void afterTestMethod()
    {
        long id = Thread.currentThread().getId();
        System.out.println("AfterTestMethod--"+id);
    }
}
