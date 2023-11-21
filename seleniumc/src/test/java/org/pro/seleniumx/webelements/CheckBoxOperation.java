package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement checkbox = driver.findElement(By.id("chk123"));
        String text = checkbox.getText();
        checkbox.click(); // Select the checkbox , if we do 1 more click() it unselect
        Boolean bVal1 = checkbox.isDisplayed();
        Boolean bVal2 = checkbox.isSelected();
        Boolean bVal3 = checkbox.isEnabled();
        String tagName = checkbox.getTagName();

        List<WebElement> checkboxList  = driver.findElements(By.xpath("//input[@class=chk]"));
        for (WebElement w:checkboxList) {
            if(w.getText().equals("Cricket"))
            {
                if (w.isSelected()==true)
                {
                    w.click(); //Unselect
                }
            }
        }



    }
}
