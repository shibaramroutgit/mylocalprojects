package org.pro.testngx.annotationlifecycle.lifecycletest;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupTest {

    @Test(groups = "Smoke")
    public void testCase1()
    {
        System.out.println("testCase1");
    }
    @Test(groups = "Smoke")
    public void testCase2()
    {
        System.out.println("testCase2");
    }
    @Test(groups = "Reg")
    public void testCase3()
    {
        System.out.println("testCase3");
    }
    @Test(groups = "Reg")
    public void testCase4()
    {
        System.out.println("testCase4");
    }

    @Test(groups = "System")
    public void testCase5()
    {
        System.out.println("testCase5");
    }
    @BeforeGroups ({"Smoke"})
    public void testCase6()
    {
        System.out.println("testCase6");
    }
}
