package org.pro.extentreportx.ereportex3;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportMasterListener implements ITestListener {

    public  static ExtentReports extentReports = ReportMasterSetup.extentReportSetup();
    public static ExtentTest extentTest;
    @Override
    public void onTestStart(ITestResult iTestResult) {
        extentTest = extentReports.createTest(iTestResult.getTestClass().getName()+"_"+iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        extentTest.pass("Test Case Pass");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        extentTest.fail("Test Case Fail");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        extentTest.skip("Test Case Skip");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        if(extentReports!=null)
        {
            extentReports.flush();
        }

    }
}
