package org.pro.seleniumx.basicauth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthBeforeSE4 {
    /**
     * On page load , if web page  asks for username and password then
     * Auth window not an alert / not browser window to do inspect for locate element
     * We have to inject username and password at url before selenium 4
     *
     * Original URL = "https://the-internet.herokuapp.com/basic_auth"
     * New URL with UerName and Password:
     * https:// + admin:admin@ + //the-internet.herokuapp.com/basic_auth
     *
     *
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
