package org.pro.testngx.assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
    @Test
    public void testCase1()
    {
        String abc=null;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Shibaram","Shibaram1");
        softAssert.assertTrue(10<30);
        softAssert.assertFalse(10<5);
        softAssert.assertNotNull(abc);
        softAssert.assertNull(abc);
        System.out.println("testCase1");
    }

    @Test
    public void testCase2()
    {
        String abc=null;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Shibaram","Shibaram1");
        softAssert.assertTrue(10<30);
        softAssert.assertFalse(10<5);
        softAssert.assertNotNull(abc);
        softAssert.assertNull(abc);
        System.out.println("testCase2");
        softAssert.assertAll();

    }
}
