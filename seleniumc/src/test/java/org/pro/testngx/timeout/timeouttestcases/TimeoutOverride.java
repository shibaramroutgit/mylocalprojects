package org.pro.testngx.timeout.timeouttestcases;

import org.testng.annotations.Test;

public class TimeoutOverride {

    @Test(timeOut = 7000)
    public void testCase1()  {
        System.out.println("testCase1 Pass");
    }
    @Test
    public void testCase2() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("testCase2 Fail");
    }
    @Test()
    public void testCase3() throws InterruptedException {
        Thread.sleep(8000);
        System.out.println("testCase3 Pass");
    }
}
