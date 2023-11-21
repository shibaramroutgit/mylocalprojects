package org.pro.seleniumx.screenhort;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

public class WebElementScreenShort {


    /**
     * TakesScreenshot is an interface , implemented by all teh Browser CLass
     *
     * On Browser Class reference we can call the "getScreenshotAs()" method for screenshot but
     * If driver object store in WebDriver reference then we need to type cast driver as "TakesScreenshot"
     * interface to get access of "getScreenshotAs()" method
     *
     * To use FileUtile.copyFile() we need a dependency of "commons-io", add in POM.xml
     *
     * File Operation at this stage, we need to handel the IOException
     *
     *  If we want to take screeshot of a web element then type cast the web Element into TakeScreeShort
     *  File ScreenShot = ((TakesScreenshot) webElement Name).getScreenshotAs(OutputType.File);
     *  FileUtils.copyFile(ScreenShot, new File("./ScreeFolder/erro1.jpg")
     *
     *
     *
     *
     *
     *
     *
     *
     */


    @Test
    public void caseTakeWebElementScreenShort()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement elementImage = driver.findElement(By.xpath("//*[@id='imagetrgt']"));
        try {
            File file = ((TakesScreenshot) elementImage).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\screenshorts\\erro1.jpg"));
        }catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void caseTakeWebElementScreenShortByUniqueName()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement elementImage = driver.findElement(By.xpath("//*[@id='imagetrgt']"));
        Date date = new Date();
        String fileName = date.toString().replace(" ","_").replace(":","_")+".jpg";
        try {
            File file = ((TakesScreenshot) elementImage).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\screenshorts"+fileName));
        }catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
