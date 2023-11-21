package org.pro.testngx.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CustomAssertTest  {

    @Test
    public static void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
        WebElement select = driver.findElement(By.xpath("//*[@id='Skills']"));
        CustomAssertClass customAssert = new CustomAssertClass();
        customAssert.assertElementIsTextbox(select);

    }
}
