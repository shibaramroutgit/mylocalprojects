package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBoxOperation {

    /**
     *
     */

    @Test
    public void testCase()
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement textBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        textBox.sendKeys("Shibaram");


    }
}
