package org.pro.seleniumx.webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertOperation {

    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Click OK
        alert.dismiss(); // Click Cancel
        String text = alert.getText();// Get alert text

    }
}
