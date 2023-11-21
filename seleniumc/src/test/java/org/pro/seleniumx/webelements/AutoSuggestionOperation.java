package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestionOperation {

    /**
     * On Auto suggestion have unique xpath to fields. It gives us list of auto suggestions
     * Right Click on one suggestion - Inspect it to get common xpath to field all suggestions
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).sendKeys("computer");
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id= 'nav-flyout-iss-anchor']//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
        for (WebElement w:suggestions)
        {
            if(w.getText().equals("Computer HP"))
            {
                w.click();
            }
        }



    }
}
