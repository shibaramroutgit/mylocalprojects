package org.pro.extentreportx;

public class ExtentReportKnowledge {

    /**
     * ExtentReport
     * Extent Report Dependency
     *      # Add in POM.xml - extentreports / 5.0.9
     *
     * Extent Report Primary Classes
     *      # ExtentSparkReporter --- It is used to generate HTML Report Configuration
     *      # ExtentReports -- It is used to get  create Test Case at Report
     *      # ExtentTest --- Add Test Case Stage Pass, Fail, Skip, Info
     *      # ExtentReports Object.createTestCase() return a ExtentTest class object
     */

     /**
     * Example1: Get Test Run Status using ExtentTest Object
     *     1 create a Report Set public methods as Below to execute Before Test
     *     @BeforeTest
     *     public void setReport() // to Set the configuration, Before After Test
     *     {
     *         extentSparkReporter = new ExtentSparkReporter(".//EXReport//extent.html");
     *         extentSparkReporter.config().setEncoding("utf-8");
     *         extentSparkReporter.config().setDocumentTitle("W2A Automation Reports");
     *         extentSparkReporter.config().setReportName("Automation Test Results");
     *         extentSparkReporter.config().setTheme(Theme.STANDARD);
     *
     *         extentReports = new ExtentReports();
     *         extentReports.attachReporter(extentSparkReporter);
     *         extentReports.setSystemInfo("Automation Tester", "Rahul Arora");
     *         extentReports.setSystemInfo("Build No", "1234");
     *         extentReports.setSystemInfo("Organization", "Way2Automation");
     *      }
     *
     *    2 Create a public endReport() to close the report. Run After Test
     *      @AfterTest
     *     public void endReport()
     *     {
     *         extentReports.flush(); // It is IMP to Call
     *     }
     *
     *    3 On Each  Test Case add below code to add Test on Report and Add Test Status using extentTest object
     *       extentTest = extentReports.createTest("bookOrderTestCase2"); // Test CAse to Report
     *       extentTest.info("Message") to add Test Steps into report
     *       extentTest.fail("Fail_bookOrderTestCase2");
     *       Or
     *       extentTest.Pass("Pass"); // Test status to report
     *       Or
     *       extentTest.Skip("Skip_bookOrderTestCase2");
     *
     *    4 Add the Test Cases into testng.xml file and run as Test Ng
     */

    /**
     * Example2: Get Test Case Run Status using TestNG Assertion
     *
     *     1 Create a Class As SetupExtent Report having a Static Method which return ExtentReports Class Object
     *     public static ExtentReports extentReportSetup()
     *     {
     *         Date d  = new Date();
     *         String fileName = "Extent_"+ d.toString().replace(":", "_").replace(" ", "_")+".html";
     *         ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\reportsextent\\"+fileName);
     *         extentSparkReporter.config().setTheme(Theme.STANDARD);
     *         extentSparkReporter.config().setDocumentTitle(fileName);
     *         extentSparkReporter.config().setEncoding("utf-8");
     *         extentSparkReporter.config().setReportName(fileName);
     *
     *         ExtentReports extentReports = new ExtentReports();
     *         extentReports.attachReporter(extentSparkReporter);
     *         extentReports.setSystemInfo("Automation Tester", "Shibaram Rout");
     *         extentReports.setSystemInfo("Organization", "Shibaram Automation");
     *         extentReports.setSystemInfo("Build no", "HelpTest-1234");
     *         return extentReports;
     *    }
     *
     *     2 create a Report Listener Class and Implements "ITestListener" Interface
     *       Define public static ExtentReport object = SetupExtent.extentReportSetup
     *       Define public static ExtentTest;
     *
     *       To Get create Test Case on Report and initialization of ExtentTest
     *       OnTestStart(){
     *           extentTest = extentReports.createTest(iTestResult.getTestClass().getName()+"_"+iTestResult.getMethod().getMethodName());
     *       }
     *
     *       OnTestPass(), OnTestFail(), OnTestSkip() add
     *       extentTest.pass("Message")
     *       extentTest.Fail("Message")
     *       extentTest.Skip("Message")
     *
     *       onFinish() add
     *       extentReports.flush()
     *
     *
     *     3 Add this listener CLass in listener tag  & Add Test Case Class under Test tag in TestNG.xml file
     *
     *     4 On Each Test Class's Test Case , add Assertion to set the test status of test case
     *
     *
     *     5 Add the Test Cases into testng.xml file and run as Test Ng
     */
}
