package org.pro.testngx.factorywithdataprovider.factorydataprovidersetup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryDataProviderSetup {
    @Factory(dataProvider = "userdata")
    public Object[] factoryMethod(String name, int age)
    {
        Object[] objects = new Object[2];
        objects[0] = new TestCaseForFactoryDataProvider(name, age);
        objects[1] = new TestCaseForFactoryDataProvider(name, age);
        return objects;
    }


    @DataProvider(name="userdata")
    public Object[][] getUserData()
    {
        Object[][] objects = new Object[2][2];

        objects[0][0]="shibaram";
        objects[0][1]=40;

        objects[1][0]="Dasarathi";
        objects[1][1]=35;

        return objects;
    }
}
