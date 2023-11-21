package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUploadDownloadOperation {
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
        WebElement fileUPBtn = driver.findElement(By.xpath("//input[@id='imagesrc']"));

        fileUPBtn.click();

        try {
            Robot robot = new Robot();
            StringSelection stringSelection = new StringSelection("D:\\MyProjectsGIT\\seleniumprojects\\SeleniumConceptWorkspaceA\\seleniumconcepts\\src\\test\\resources\\s1.png");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
            robot.setAutoDelay(3000); // to view the operation at execution no need real time
            // Below 2 Line do copy file from given path using CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.setAutoDelay(3000);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.setAutoDelay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("End of Try");
            robot.setAutoDelay(3000);

        }catch (Exception exception)
        {
            exception.getMessage();
        }



        // File Upload using sendKeys() method but not recommend
        //fileUP.sendKeys("D:\\MyProjectsGIT\\seleniumprojects\\SeleniumConceptWorkspaceA\\seleniumconcepts\\src\\test\\resources\\s1.png");






    }
}
