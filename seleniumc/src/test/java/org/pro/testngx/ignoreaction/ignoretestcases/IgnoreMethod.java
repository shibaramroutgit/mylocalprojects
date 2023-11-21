package org.pro.testngx.ignoreaction.ignoretestcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreMethod {

    @Test // default way to not ignore
    public void testCase1()
    {
        System.out.println("testCase1");
    }

    @Ignore // it is way to ignore
    public void testCase2()
    {
        System.out.println("testCase2");

    }
    @Test(enabled = false) // it is way to ignore
    public void testCase3()
    {
        System.out.println("testCase3");

    }
    @Test(enabled = true) // it is way to not ignore
    public void testCase4()
    {
        System.out.println("testCase4");
    }
}
