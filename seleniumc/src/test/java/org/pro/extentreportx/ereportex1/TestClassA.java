package org.pro.extentreportx.ereportex1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

public class TestClassA {

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
    public void bookOrderTestCase1()
    {
        extentTest = extentReports.createTest("bookOrderTestCase1"); // Add Test Case into Report
        extentTest.info("Run Time Test Step Info what execute"); // Add Test Case Name to report
        extentTest.pass("Pass_bookOrderTestCase1"); // Add Test Case Status to Report
    }

    @Test
    public void bookOrderTestCase2()
    {
        System.out.println("BookOrderTestCase2");
        extentTest = extentReports.createTest("bookOrderTestCase2"); // Add Test Case into Report
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        extentTest.fail("Fail_bookOrderTestCase2"); // Add Test Case Status to Report

    }

    @Test
    public void bookOrderTestCase3()
    {
        System.out.println("BookOrderTestCase3");
        extentTest = extentReports.createTest("bookOrderTestCase3"); // Add Test CAse to Report
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        extentTest.pass("Pass_bookOrderTestCase3"); // Add Test Status to Report
    }

    @Test
    public void bookOrderTestCase4()
    {
        System.out.println("BookOrderTestCase4");
        extentTest = extentReports.createTest("bookOrderTestCase4"); // Add Test CAse to Report
        extentTest.info("User Action at run time"); // Add Test Steps into Report
        extentTest.skip("Pass_bookOrderTestCase3"); // Add Test Status to Report
    }



}
