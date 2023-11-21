package org.pro.extentreportx.ereportex3;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class BankAccountTestCase {


    @Test
    public  void bankAccountTestCase1()
    {
        System.out.println("bankAccountTestCase1");
        ReportMasterListener.extentTest.info("Step1");
        Assert.fail("Fail ");

    }

    @Test
    public void bankAccountTestCase2()
    {
        System.out.println("bankAccountTestCase2");
        ReportMasterListener.extentTest.info("Step1");
        Assert.assertTrue(true);


    }

    @Test
    public void bankAccountTestCase3()
    {
        System.out.println("bankAccountTestCase3");
        ReportMasterListener.extentTest.info("Step1");
        throw  new SkipException("Skip");


    }

    @Test
    public void bankAccountTestCase4()
    {
        System.out.println("bankAccountTestCase4");
        ReportMasterListener.extentTest.info("Step1");
        Assert.assertTrue(true);
    }
}
