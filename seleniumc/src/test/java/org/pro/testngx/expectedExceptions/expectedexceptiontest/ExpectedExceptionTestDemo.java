package org.pro.testngx.expectedExceptions.expectedexceptiontest;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExpectedExceptionTestDemo {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testCase1()
    {
        throw new ArithmeticException();
    }

    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void testCase2()  {
        throw new ArrayIndexOutOfBoundsException();
    }
}
