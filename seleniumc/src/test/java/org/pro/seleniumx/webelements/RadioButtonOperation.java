package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RadioButtonOperation {

    /**
     *
     */


    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        WebElement r1= driver.findElement(By.id("yesRadio"));
        WebElement r2 = driver.findElement(By.id("impressiveRadio"));

        //r1.click(); // Unable to lick due to overlap by other Element
        //r2.click(); // Unable to lick due to overlap by other Element

        Actions act = new Actions(driver);
        act.moveToElement(r1).click().build().perform();
        act.moveToElement(r2).click().build().perform();

    }
}
