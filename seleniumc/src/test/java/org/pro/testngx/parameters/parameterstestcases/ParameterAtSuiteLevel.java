package org.pro.testngx.parameters.parameterstestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAtSuiteLevel {
    @Parameters({"suite-parameterA", "suite-parameterB"})
    @Test
    public void testCase1(String paramA, String paramB)
    {
        System.out.println("testCase1"+"--"+paramA+"--"+paramB);
    }

    @Parameters({"suite-parameterB"})
    @Test
    public void testCase2(String param)
    {
        System.out.println("testCase2"+"--"+param);
    }

    @Parameters({"suite-parameterC"})
    @Test
    public void testCase3(String param)
    {
        System.out.println("testCase3"+"--"+param);
    }
}
