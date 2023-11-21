package org.pro.testngx.parameters.parameterstestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAtSuiteTestLevel {
    @Parameters({"test-parameterA"})
    @Test
    public void testCase1(String param)
    {
        System.out.println("testCase1"+"--"+param);
    }

    @Parameters({"test-parameterA"})
    @Test
    public void testCase2(String param)
    {
        System.out.println("testCase2"+"--"+param);
    }

    @Parameters({"suite-parameterA"})
    @Test
    public void testCase3(String param)
    {
        System.out.println("testCase3"+"--"+param);
    }
}
