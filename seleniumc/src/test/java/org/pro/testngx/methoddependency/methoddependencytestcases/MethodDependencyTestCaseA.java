package org.pro.testngx.methoddependency.methoddependencytestcases;

import org.testng.annotations.Test;

public class MethodDependencyTestCaseA {

    @Test(dependsOnMethods = "testCase2") // Single Method dependency
    public void testCase1()
    {
        System.out.println("testCase1");
    }

    @Test(dependsOnMethods = {"testCase3", "testCase4"}) // multiple method dependency
    public void testCase2()
    {
        System.out.println("testCase2");
    }

    @Test
    public void testCase3()
    {
        System.out.println("testCase3");
    }

    @Test
    public void testCase4()
    {
        System.out.println("testCase4");
    }

    @Test
    public void testCase5()
    {
        System.out.println("testCase5");
    }
    @Test
    public void testCase6()
    {
        System.out.println("testCase6");
    }
}
