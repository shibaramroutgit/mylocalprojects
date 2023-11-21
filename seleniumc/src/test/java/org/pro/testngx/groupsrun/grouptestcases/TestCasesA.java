package org.pro.testngx.groupsrun.grouptestcases;

import org.testng.annotations.Test;

public class TestCasesA {

    @Test(groups = "smoke")
    public void testCase1()
    {
        System.out.println("TestCasesA--testCase1--smoke");
    }

    @Test(groups = "smoke")
    public void testCase2()
    {
        System.out.println("TestCasesA--testCase2--smoke");
    }
    @Test (groups = "system")
    public void testCase3()
    {
        System.out.println("TestCasesA--testCase3--system");
    }
    @Test(groups = "reg")
    public void testCase4()
    {
        System.out.println("TestCasesA--testCase4--reg");
    }
}
