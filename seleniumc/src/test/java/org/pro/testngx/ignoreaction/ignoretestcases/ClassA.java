package org.pro.testngx.ignoreaction.ignoretestcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(enabled = true)
public class ClassA {

    @Test
    public void testCase1()
    {
        System.out.println("ClassA-testCase1");
    }

    @Test
    public void testCase2()
    {
        System.out.println("ClassA-testCase2");

    }

}
