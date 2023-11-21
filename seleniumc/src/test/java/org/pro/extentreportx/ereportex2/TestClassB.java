package org.pro.extentreportx.ereportex2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.util.Date;

public class TestClassB {

    public ExtentSparkReporter extentSparkReporter;
    public ExtentReports extentReports;
    public ExtentTest extentTest;

    @BeforeTest
    public void reportSetup()
    {
        //File Unique Name
        Date date = new Date();
        String fileName = date.toString().replace(" ","_").replace(":","_")+".html";

        extentSparkReporter = new ExtentSparkReporter("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\reportsextent\\"+ fileName);
        extentSparkReporter.config().setEncoding("utf-8");
        extentSparkReporter.config().setDocumentTitle("W2A Automation Reports");
        extentSparkReporter.config().setReportName("Automation Test Results");
        extentSparkReporter.config().setTheme(Theme.STANDARD);

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Automation Tester", "Shibaram Rout");
        extentReports.setSystemInfo("Build No", "1234");
        extentReports.setSystemInfo("Organization", "Way2Automation");

    }

    @AfterTest
    public void endReport()
    {
        extentReports.flush();// It is IMP to Call to generate report by closing all previous history
    }

    @Test
    public  void bookOrderTestCase1()
    {
        System.out.println("BookOrderTestCase1");
        extentTest = extentReports.createTest("bookOrderTestCase1"); // Add Test Case into Report
        System.out.println("Test CAse Execute");
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        Assert.fail("Fail "); // Add Test Status using TestNG Assertion

    }

    @Test
    public void bookOrderTestCase2()
    {
        System.out.println("BookOrderTestCase2");
        extentTest = extentReports.createTest("bookOrderTestCase2"); // Add Test Case into Report
        System.out.println("Test CAse Execute");
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        Assert.assertTrue(true); // Add Test Status using TestNG Assertion


    }

    @Test
    public void bookOrderTestCase3()
    {
        System.out.println("BookOrderTestCase3");
        extentTest = extentReports.createTest("bookOrderTestCase3"); // Add Test CAse to Report
        System.out.println("Test CAse Execute");
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        throw  new SkipException("Skip"); // Add Test Status using TestNG Assertion


    }

    @Test
    public void bookOrderTestCase4()
    {
        System.out.println("BookOrderTestCase4");
        extentTest = extentReports.createTest("bookOrderTestCase4"); // Add Test CAse to Report
        System.out.println("Test CAse Execute");
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        Assert.assertTrue(true); // Add Test Status using TestNG Assertion

    }

    // As we are taking status of Test Case using Test NG Assertion
    // We have to add this status into Extent Report using "ITestResult" Interface
    // We execute it Before Method because each method is a Test Case
    @AfterMethod
    public void updateTestStatus(ITestResult iTestResult)
    {
        String testCaseName;
        if (iTestResult.getStatus()==ITestResult.SUCCESS)
        {
            testCaseName = iTestResult.getMethod().getMethodName();// Get the Test Case Name
            extentTest.pass("Pass"+testCaseName);
        } else if (iTestResult.getStatus()==ITestResult.FAILURE) {
            testCaseName = iTestResult.getMethod().getMethodName();
            extentTest.fail("Fail"+testCaseName);
        } else if (iTestResult.getStatus()==ITestResult.SKIP) {
            testCaseName = iTestResult.getMethod().getMethodName();
            extentTest.skip("Skip"+testCaseName);
        }
    }



}
