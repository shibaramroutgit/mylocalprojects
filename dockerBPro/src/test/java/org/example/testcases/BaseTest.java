package org.example.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setDriver()
    {
        WebDriverManager.chromedriver().setup();
        this.driver=new ChromeDriver();

    }

    @AfterTest
    public void quitDriver()
    {
       this.driver.quit();

    }

    public abstract void getPageRef();


}
