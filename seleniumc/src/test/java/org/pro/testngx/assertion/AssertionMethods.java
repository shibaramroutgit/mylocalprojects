package org.pro.testngx.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class AssertionMethods {

    @Test
    public void testCase1()
    {
        Assert.assertTrue(2>5);
        System.out.println("Assert Verified");
    }
    @Test
    public void testCase2()
    {
        Assert.assertTrue(10>5 && 10<20 );
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase3()
    {
        Assert.assertTrue(10>5 && 10<2 , "Assertion is Fail Boz Boolean Condition Result is false");
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase4()
    {
        Assert.assertFalse(10>5 && 10<20 , "Condition Expect false but it return true so it is Fail");
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase5()
    {
        Assert.assertFalse(10>5 && 10>20 );
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase6()
    {
        Assert.fail();
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase7()
    {
        Assert.fail("User Set Fail Manually");
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase8()
    {
        Assert.fail("User Set Fail Manually", new NoSuchElementException("User Manually Throw Exception"));
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase9()
    {
        Assert.assertEquals(1,1);
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase10()
    {
        String actual = "shibaram";
        String expect = "shibaramrout";
        Assert.assertEquals(actual,expect);
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase11()
    {
        String city=null;
        Assert.assertNotNull(city);
        System.out.println("Assert Verified");
    }
    @Test
    public void testCase12()
    {
        String city="BHU";
        Assert.assertNotNull(city);
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase13()
    {
        String city="BHU";
        Assert.assertNull(city);
        System.out.println("Assert Verified");
    }
    @Test
    public void testCase14()
    {
        String city=null;
        Assert.assertNull(city);
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase15()
    {
        Object [] A = {10,30,40};
        Object [] B = {30,10,40};
        Assert.assertEqualsNoOrder(A,B);
        System.out.println("Assert Verified");
    }
    @Test
    public void testCase16()
    {
        Object [] A = {10,30,40};
        Object [] B = {10,30,50};
        Assert.assertEqualsNoOrder(A,B);
        System.out.println("Assert Verified");
    }

    @Test
    public void testCase17()
    {
        Object A = 10;
        Object B = 20;
        Assert.assertNotEquals(A,B);
        System.out.println("Assert Verified");
    }








}
