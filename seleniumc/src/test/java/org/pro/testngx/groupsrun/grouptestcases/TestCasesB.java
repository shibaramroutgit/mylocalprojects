package org.pro.testngx.groupsrun.grouptestcases;

import org.testng.annotations.Test;

public class TestCasesB {

    @Test(groups = "smoke")
    public void testCase5()
    {
        System.out.println("TestCasesB--testCase5--smoke");
    }

    @Test(groups = "smoke")
    public void testCase6()
    {
        System.out.println("TestCasesB--testCase6--smoke");
    }
    @Test (groups = "system")
    public void testCase7()
    {
        System.out.println("TestCasesB--testCase7--system");
    }
    @Test(groups = "reg")
    public void testCase8()
    {
        System.out.println("TestCasesB--testCase8--reg");
    }
}
