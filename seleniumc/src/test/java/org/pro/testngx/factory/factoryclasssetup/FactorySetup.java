package org.pro.testngx.factory.factoryclasssetup;

import org.testng.annotations.Factory;

public class FactorySetup {
    @Factory
    public Object[] dataFactory()
    {

        return new Object[]{new TestCaseForFactory("Shibaram", "BBSR",  40)};
        //return new Object[]{new TestCaseForFactory("Shibaram", "BBSR",  40), new TestCasesClass("Dasarathi", "BLR", 35)};
    }
}
