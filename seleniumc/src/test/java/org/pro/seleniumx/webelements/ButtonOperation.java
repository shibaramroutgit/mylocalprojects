package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ButtonOperation
{
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement button = driver.findElement(By.id("btn100"));

        button.click();
        Boolean bVal1 = button.isDisplayed();
        Boolean bVal2 = button.isEnabled();
        String text = button.getText();
        String tagName = button.getText();

        List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
        for (WebElement w:buttonlist) {
            if(w.getText().equals("Login"))
            {
                w.click();
            }
        }






    }
}
