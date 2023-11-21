package org.pro.testngx.factory.factoryclasssetup;

import org.testng.annotations.Test;

public class TestCaseForFactory {
    public String name;
    public String loc;
    public int age;


    public TestCaseForFactory(String name, String loc, int age)
    {
        this.name=name;
        this.loc=loc;
        this.age=age;
    }

    @Test
    public void testCase1()
    {
        System.out.println(name +"--"+loc+"--"+age);
    }

    @Test
    public void testCase2()
    {
        System.out.println(name +"--"+loc+"--"+age);
    }
}
