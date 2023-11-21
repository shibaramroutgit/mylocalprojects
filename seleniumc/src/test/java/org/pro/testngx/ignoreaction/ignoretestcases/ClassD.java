package org.pro.testngx.ignoreaction.ignoretestcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(enabled = false) // not working this attribute
public class ClassD {

    @Test
    public void testCase1()
    {
        System.out.println("ClassD-testCase1");
    }

    @Test
    public void testCase2()
    {
        System.out.println("ClassD-testCase2");

    }

}
