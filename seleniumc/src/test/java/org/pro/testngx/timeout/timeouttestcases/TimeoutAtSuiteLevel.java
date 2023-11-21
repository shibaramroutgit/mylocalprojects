package org.pro.testngx.timeout.timeouttestcases;

import org.testng.annotations.Test;

public class TimeoutAtSuiteLevel {

    @Test
    public void testCase1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testCase1 Pass");
    }
    @Test
    public void testCase2() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("testCase2 Fail");
    }
    @Test
    public void testCase3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testCase3 Pass");
    }
}
