package org.pro.seleniumx.screenhort;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class WebPageScreenShort {

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
     *
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
    public void caseWebPageTakeScreenShort()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\screenshorts\\erro1.jpg"));
        }catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void caseTakeWebPageScreenShortByUniqueNameTimeStamp()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        Date date = new Date();
        System.out.println(date);
        String filename = date.toString().replace(" ", "_").replace(":","_")+".jpg";
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\screenshorts\\"+filename));
        }catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

}
