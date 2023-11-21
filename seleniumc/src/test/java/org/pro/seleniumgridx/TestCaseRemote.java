package org.pro.seleniumgridx;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCaseRemote {

   public WebDriver driver;
   public Capabilities capabilities;
   public String browser = "Chrome";

   @BeforeTest
    public void setupRemoteDriver() throws MalformedURLException {

       if(browser.equals("Chrome"))
       {
           capabilities = new ChromeOptions();
       } else if (browser.equals("Firefox")) {
           capabilities = new FirefoxOptions();
       }
       driver = new RemoteWebDriver(new URL("http://192.168.0.24:4444"),capabilities);
       driver.manage().window().maximize();
   }

   @Test
    public void testCase1() throws InterruptedException {
       driver.get("https://demo.automationtesting.in/Register.html");
       Thread.sleep(3000);
   }
    @Test
    public void testCase2() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }
    @Test
    public void testCase3() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }

    @Test
    public void testCase4() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }
    @Test
    public void testCase5() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }
    @Test
    public void testCase6() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }
    @Test
    public void testCase7() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }
    @Test
    public void testCase8() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }

    @Test
    public void testCase9() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }
    @Test
    public void testCase10() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeDriver()
    {
        driver.quit();
    }

}
