package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class IframeOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Case 1: Single Iframe
        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        driver.switchTo().frame(iframe1);
        //Do operation on control present on Iframe as we do normal

        //Case 2: Multiple Iframe
        List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
        for (WebElement w:iframeList) {
            if (w.getTagName().equals("iframeMain")) // Compare by ID, Name, Index
            {
                driver.switchTo().frame(w);// frame() is overloaded by Sting, ID, Name, Web element
            }
        }


        // Case 3: Nested Iframe
        WebElement topIframe = driver.findElement(By.xpath("//iframe[@id='singleframeA']"));
        WebElement middleIframe = driver.findElement(By.xpath("//iframe[@id='singleframeB']"));
        WebElement innerIframe = driver.findElement(By.xpath("//iframe[@id='singleframeC']"));
        driver.switchTo().frame(topIframe);
        driver.switchTo().frame(middleIframe);
        driver.switchTo().frame(innerIframe);
        //Do operation on control present on Iframe as we do normal

        //Case 4:
        driver.switchTo().defaultContent(); // At any point from any iframe we can move back to default browser

        //Case 5:
        //Inside Iframe we can find if any iframe present by tag name and count will be size of List collection
        int count = iframeList.size();





    }

}
