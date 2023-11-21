package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderOperation {
    /**
     *
     */
    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Slider.html");

        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
        WebElement sliderHeader = driver.findElement(By.xpath("//div[@id='slider']//a"));
        Actions act = new Actions(driver);
        act.dragAndDropBy(sliderHeader,400,0).build().perform();// Move to Right Side
        act.dragAndDropBy(sliderHeader,-600,0).build().perform();// Move to Left Side


    }
}
