package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Slider.html");

        WebElement userNameByName= driver.findElement(By.name("userName"));
        WebElement userNameByID= driver.findElement(By.id("userName"));
        WebElement userNameByTag= driver.findElement(By.tagName("input"));
        WebElement userNameByXpath= driver.findElement(By.xpath("//[@class='User']"));
        WebElement userNameByCSS= driver.findElement(By.cssSelector("#basicBootstrapForm"));
        WebElement userNameByClass= driver.findElement(By.className("User"));
        WebElement userNameByLinkText= driver.findElement(By.linkText("UserName"));
        WebElement userNameByPartLinkText= driver.findElement(By.partialLinkText("User"));



    }
}
