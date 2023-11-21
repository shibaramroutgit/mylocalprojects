package org.pro.testngx.timeout.timeouttestcases;

import org.testng.annotations.Test;

public class TimeoutAtMethodLevel {

    @Test(timeOut = 2000)
    public void testCase1()  {
        System.out.println("testCase1 Pass");
    }
    @Test (timeOut = 7000)
    public void testCase2()  {
        System.out.println("testCase2 Pass");
    }
    @Test (timeOut = 2000)
    public void testCase3() {
        System.out.println("testCase3 Pass");
    }
}
