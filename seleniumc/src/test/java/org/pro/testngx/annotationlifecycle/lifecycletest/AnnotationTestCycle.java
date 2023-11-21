package org.pro.testngx.annotationlifecycle.lifecycletest;

import org.testng.annotations.*;

public class AnnotationTestCycle {

    @BeforeSuite
    public void testCaseBeforeSuite()
    {
        System.out.println("testCaseBeforeSuite");
    }
    @BeforeTest
    public void testCaseBeforeTest()
    {
        System.out.println("testCaseBeforeTest");
    }
    @BeforeClass
    public void testCaseBeforeClass()
    {
        System.out.println("testCaseBeforeClass");
    }
    @BeforeMethod
    public void testCaseBeforeMethod()
    {
        System.out.println("testCaseBeforeMethod");
    }
    @Test
    public void testCase1()
    {
        System.out.println("testCase1");
    }
    @Test
    public void testCase2()
    {
        System.out.println("testCase2");
    }
    @AfterMethod
    public void testCaseAfterMethod()
    {
        System.out.println("testCaseAfterMethod");
    }
    @AfterClass
    public void testCaseAfterClass()
    {
        System.out.println("testCaseAfterClass");
    }

    @AfterTest
    public void testCaseAfterTest()
    {
        System.out.println("testCaseAfterTest");
    }
    @AfterSuite
    public void testCaseAfterSuite()
    {
        System.out.println("testCaseAfterSuite");
    }

}
