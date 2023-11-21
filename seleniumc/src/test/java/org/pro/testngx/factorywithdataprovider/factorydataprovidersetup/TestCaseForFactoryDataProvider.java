package org.pro.testngx.factorywithdataprovider.factorydataprovidersetup;

import org.testng.annotations.Test;

public class TestCaseForFactoryDataProvider {

    public String name;
    public int age;
    public TestCaseForFactoryDataProvider(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    @Test
    public void testCase1()
    {
        System.out.println("testCase1"+"-Name-"+name+"-Age-"+age);
    }
    @Test
    public void testCase2()
    {
        System.out.println("testCase2"+"-Name-"+name+"-Age-"+age);
    }

}
