package org.pro.seleniumx.basicauth;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthAfterSE4 {
    /**
     * Interface HasAuthentication is used to handel the auth
     * All Browser Implemented this Interface and access register() method directly to set User:Pwd
     * As we store driver reference in WebDriver we need type cast to HasAuthentication interface'
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ((HasAuthentication)driver).register(UsernameAndPassword.of("admin","admin"));
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

}
