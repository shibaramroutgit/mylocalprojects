package org.pro.testngx.methoddependency.methoddependencytestcases;

import org.testng.annotations.Test;

public class MethodDependencyTestCaseC {

    @Test
    public void testCase17()
    {
        System.out.println("testCase8");
    }
    @Test(dependsOnGroups ="smoke")
    public void testCase9()
    {
        System.out.println("testCase9");
    }
    @Test(dependsOnGroups = {"smoke","system"})
    public void testCase10()
    {
        System.out.println("testCase10");
    }
    @Test(groups = "smoke")
    public void testCase11()
    {
        System.out.println("testCase11");
    }
    @Test(groups = "system")
    public void testCase12()
    {
        System.out.println("testCase12");
    }
    @Test(groups = "system")
    public void testCase13()
    {
        System.out.println("testCase13");
    }
    @Test(groups ="smoke" )
    public void testCase14()
    {
        System.out.println("testCase14");
    }
    @Test
    public void testCase15()
    {
        System.out.println("testCase15");
    }
    @Test
    public void testCase16()
    {
        System.out.println("testCase16");
    }
}
