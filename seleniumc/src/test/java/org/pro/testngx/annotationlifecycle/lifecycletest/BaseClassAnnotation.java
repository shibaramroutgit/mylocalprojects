package org.pro.testngx.annotationlifecycle.lifecycletest;

import org.testng.annotations.*;

public class BaseClassAnnotation {
    @BeforeClass
    public void baseBeforeClass()
    {
        System.out.println("BaseClassAnnotation--beforeClass");
    }
    @BeforeMethod
    public void baseBeforeMethod()
    {
        System.out.println("BaseClassAnnotation--beforeMethod");
    }
    @AfterClass
    public void baseAfterClass()
    {
        System.out.println("BaseClassAnnotation--afterClass");
    }

    @AfterMethod
    public void baseAfterMethod()
    {
        System.out.println("BaseClassAnnotation--afterMethod");
    }

    @Test
    public void baseTestCase1()
    {
        System.out.println("BaseClassAnnotation--testCase1");
    }
}
