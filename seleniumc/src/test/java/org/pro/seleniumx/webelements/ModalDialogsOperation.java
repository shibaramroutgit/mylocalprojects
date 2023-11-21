package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModalDialogsOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showSmallModal")).click();
        String mText = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
        System.out.println(mText);
        driver.findElement(By.id("closeSmallModal")).click();
    }
}
