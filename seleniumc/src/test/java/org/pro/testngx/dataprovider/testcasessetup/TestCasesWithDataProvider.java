package org.pro.testngx.dataprovider.testcasessetup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCasesWithDataProvider {

    @Test(dataProvider = "UserData") // cal by name or method name
    public void getUserData(String username,String location )
    {
        System.out.println(username);
        System.out.println(location);

    }

    @Test(dataProvider = "MobileData")
    public void getMobileData(Long mob, int age)
    {
        System.out.println(mob);
        System.out.println(age);
    }

    @DataProvider(name="UserData")
    public Object[][]dataMethod()
    {
        Object[][] objects = new Object[2][2];

        objects[0][0]="Shibaram";
        objects[0][1]="Bangalore";

        objects[1][0]="Dasarathi";
        objects[1][1]="Delhi";

        return objects;
    }

    @DataProvider(name="MobileData")
    public Object[][]getAgeMob()
    {
        Object[][] objects = new Object[2][2];

        objects[0][0]= 9731931298L;
        objects[0][1]= 20;

        objects[1][0]= 8888222200L;
        objects[1][1]= 30;

        return objects;
    }
}
