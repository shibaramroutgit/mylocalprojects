package org.pro.seleniumx.webelements;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkOperation {

    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        WebElement linkA = driver.findElement(By.xpath("//[@class='link"));
        WebElement linkB = driver.findElement(By.linkText("Login user"));
        WebElement linkC = driver.findElement(By.partialLinkText("login"));
        linkA.click();
        String text = linkA.getText();
        String attribute = linkA.getAttribute("herf");
        boolean bVal1 =  linkA.isEnabled();
        String tagName = linkA.getTagName();
        boolean bVal2 = linkA.isDisplayed();
    }


}
