package org.pro.testngx.ignoreaction.ignoretestcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class ClassC {

    @Test // default way to not ignore
    public void testCase1()
    {
        System.out.println("ClassC-testCase1");
    }

    public void testCase2()
    {
        System.out.println("ClassC-testCase2");

    }

}
