package org.pro.seleniumx.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewTabOrWindowOperation {

    /**
     *
     */
    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().newWindow(WindowType.WINDOW); // Run time open a new window and work
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.switchTo().newWindow(WindowType.TAB); // // Run time open a new tab and work
        driver.get("https://demo.automationtesting.in/Register.html");

    }
}
