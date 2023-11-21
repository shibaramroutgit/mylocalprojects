package org.pro.testngx.itestnglistener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AccountBalanceTestCase {

    @Test
    public  void accountBalanceTestCase1()
    {
        System.out.println("accountBalanceTestCase1");
        ReportMasterListener.extentTest.info("Step 1");
        ReportMasterListener.extentTest.info("Step 2");
        ReportMasterListener.extentTest.info("Step 3");
        Assert.fail("Fail ");

    }

    @Test
    public void accountBalanceTestCase2()
    {
        System.out.println("accountBalanceTestCase2");
        ReportMasterListener.extentTest.info("Step 1");
        ReportMasterListener.extentTest.info("Step 2");
        ReportMasterListener.extentTest.info("Step 3");
        Assert.assertTrue(true);


    }

    @Test
    public void accountBalanceTestCase3()
    {
        System.out.println("accountBalanceTestCase3");
        ReportMasterListener.extentTest.info("Step 1");
        ReportMasterListener.extentTest.info("Step 2");
        ReportMasterListener.extentTest.info("Step 3");
        throw  new SkipException("Skip");


    }

    @Test
    public void accountBalanceTestCase4()
    {
        System.out.println("accountBalanceTestCase4");
        ReportMasterListener.extentTest.info("Step 1");
        ReportMasterListener.extentTest.info("Step 2");
        ReportMasterListener.extentTest.info("Step 3");
        Assert.assertTrue(true);
    }
}
