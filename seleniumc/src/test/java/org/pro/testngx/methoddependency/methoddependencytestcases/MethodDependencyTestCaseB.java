package org.pro.testngx.methoddependency.methoddependencytestcases;

import org.testng.annotations.Test;

public class MethodDependencyTestCaseB extends MethodDependencyTestCaseA{


    @Test(dependsOnMethods = "testCase6")
    public void testCase7()
    {
        System.out.println("testCase7");
    }
    @Test
    public void testCase8()
    {
        System.out.println("testCase8");
    }
}
