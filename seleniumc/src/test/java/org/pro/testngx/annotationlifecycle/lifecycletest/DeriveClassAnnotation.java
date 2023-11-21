package org.pro.testngx.annotationlifecycle.lifecycletest;

import org.testng.annotations.*;

public class DeriveClassAnnotation extends BaseClassAnnotation{

    @BeforeClass
    public void deriveBeforeClass()
    {
        System.out.println("DeriveClassAnnotation--beforeClass");
    }
    @BeforeMethod
    public void deriveBeforeMethod()
    {
        System.out.println("DeriveClassAnnotation--beforeMethod");
    }
    @AfterClass
    public void deriveAfterClass()
    {
        System.out.println("DeriveClassAnnotation--afterClass");
    }

    @AfterMethod
    public void deriveAfterMethod()
    {
        System.out.println("DeriveClassAnnotation--afterMethod");
    }

    @Test
    public void deriveTestCase1()
    {
        System.out.println("DeriveClassAnnotation--testCase1");
    }
}
