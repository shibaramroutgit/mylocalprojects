package org.pro.seleniumx.webdriverexample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MethodsOfWebDriver {

    @Test
    public void testCase1()   {

        WebDriver driver = new ChromeDriver(); // Chrome Driver Reference

        driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login"); // Navigate to URL

        String title = driver.getTitle(); // Get the title of the web page

        String currentURL=  driver.getCurrentUrl(); // It returns the current page URL

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Global Wait at driver level

        Dimension dimension = driver.manage().window().getSize(); // It returns size of the window Height and width
        int x = dimension.height;
        int y = dimension.width;

        driver.manage().window().setSize(new Dimension(200,300)); // Set the driver window size

        Point point = driver.manage().window().getPosition(); // Return X, Y coordination as Point class reference of driver window on machine
        int xc = point.getX();
        int yc = point.getY();

        driver.manage().window().setPosition(new Point(200,300));// Set X, Y of Driver Window

        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.navigate().refresh(); // Refresh the driver

        driver.navigate().back(); // Go back to previous  page

        driver.navigate().forward(); // Go to forwarded page

        driver.close(); // Close the current session driver window where current focus present

        driver.quit();// Close the main driver session

        String htmlDOm = driver.getPageSource(); // Return the HTML DOM

        WebElement buttonElement = driver.findElement(By.xpath("//button[@class='class1']")); // Return a web element reference

        List<WebElement> webElementList = driver.findElements(By.xpath("//link[@class='ilink']"));
        for (WebElement w:webElementList)
        {
            String linkName = w.getText();
            System.out.println(linkName);
        }

        String  windowID = driver.getWindowHandle(); // Return a String Window ID


        Set<String> stringSet = driver.getWindowHandles(); // Return Set collection of window ids
        for (String s:stringSet)
        {
            driver.switchTo().window(s);
        }


        Alert alert = driver.switchTo().alert();// Returns an Alert Class Reference
        alert.dismiss();
        alert.accept();

        WebElement iframe = driver.findElement(By.xpath("//[@class='iframec']"));
        driver.switchTo().frame(iframe);

        // wait() is part of java.lang.Object.wait(long timeout) to pause the thread
        try {
            driver.wait(1000);
        }catch (InterruptedException IE)
        {
            IE.getMessage();
        }


        driver.switchTo().newWindow(WindowType.WINDOW); // Run time open a new window and work
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.switchTo().newWindow(WindowType.TAB); // // Run time open a new tab and work
        driver.get("https://demo.automationtesting.in/Register.html");






    }
}
