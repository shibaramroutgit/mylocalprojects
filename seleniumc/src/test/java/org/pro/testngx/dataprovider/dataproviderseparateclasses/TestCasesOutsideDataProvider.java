package org.pro.testngx.dataprovider.dataproviderseparateclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCasesOutsideDataProvider {

    @Test(dataProvider = "UserData", dataProviderClass = DataProvideUtils.class) // cal by name or method name
    public void getUserData(String username,String location )
    {
        System.out.println(username);
        System.out.println(location);

    }

    @Test(dataProvider = "MobileData", dataProviderClass = DataProvideUtils.class)
    public void getMobileData(Long mob, int age)
    {
        System.out.println(mob);
        System.out.println(age);
    }


}
