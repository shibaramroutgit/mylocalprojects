package org.pro.testngx.testpriority.prioritytest;

import org.testng.annotations.Test;

public class PriorityTestClass {

    @Test(priority = 1)
    public void testCase1()
    {
        System.out.println("testCase1");
    }
    @Test (priority = 4)
    public void testCase4()
    {
        System.out.println("testCase4");
    }
    @Test (priority = 3)
    public void testCase3()
    {
        System.out.println("testCase3");
    }
    @Test(priority = 5)
    public void testCase5()
    {
        System.out.println("testCase5");
    }
    @Test(priority = 2)
    public void testCase2A()
    {
        System.out.println("testCase2A");
    }
    @Test(priority = 2)
    public void testCase2B()
    {
        System.out.println("testCase2B");
    }
    @Test(priority = 6)
    public void testCase6()
    {
        System.out.println("testCase6");
    }
    @Test()
    public void testCase0()
    {
        System.out.println("testCase0");
    }
}
