package org.pro.seleniumx.webelements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class ScrollBarOperation {
    /**
     *
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        Actions actions = new Actions(driver);

        //Case1: scrollbar move to end of page
        actions.sendKeys(Keys.PAGE_DOWN).build().perform(); // It moves down but scroll not moves to complete END

        //Case 2: scrollbar move to top of page
        actions.sendKeys(Keys.PAGE_UP).build().perform(); // It moves down but scroll not moves to complete TOP

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Case 3: Move to particular position  towards UP
        js.executeScript("window.scrollBy(0,400)"); // Move UP. if we use 400,0 then it works for Horizontal bar Right

        //Case 4: Down to particular position  towards down
        js.executeScript("window.scrollBy(0,-400)"); // Move Down. if we use -500,0 then it works for Horizontal bar Left


        //Case 5: Move UP Scroll to as high of browser
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // Move to Complete TOP

        //Case 6: Move Down Scroll to as high of browser
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)"); // Move to Complete DOWN



        // Case 7: Move scroll to a specific web element
        WebElement element = driver.findElement(By.id("submitbtn"));
        js.executeScript("arguments[0].scrollIntoView()",element);//Scroll till the web element display
    }
}
