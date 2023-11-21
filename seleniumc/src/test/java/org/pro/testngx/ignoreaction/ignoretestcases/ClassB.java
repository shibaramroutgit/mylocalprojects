package org.pro.testngx.ignoreaction.ignoretestcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ClassB {

    @Test
    public void testCase1()
    {
        System.out.println("ClassB-testCase1");
    }

    @Test
    public void testCase2()
    {
        System.out.println("ClassB-testCase2");

    }

}
