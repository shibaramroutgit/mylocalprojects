package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        WebElement country = driver.findElement(By.xpath("//select[@type='text'][@id='Skills']"));

        Select select = new Select(country);

        select.selectByIndex(2); // Select position value using their index
        select.selectByVisibleText("India"); // Select value by their display name

        select.selectByValue("IN"); // Select by value of the option
        select.deselectByValue("IN"); // Unselect by value of the option

        select.deselectByIndex(2);// Unselect position value using their index
        select.deselectByVisibleText("India");// Unselect value by their display name

        select.deselectAll(); // Deselect all either single or multi select


        WebElement firstOpt = select.getFirstSelectedOption();

        List<WebElement> optionList = select.getAllSelectedOptions();
        for (WebElement w:optionList) {
            System.out.println(w.getText());

        }

        boolean bVal1 = select.isMultiple();// Return boolean value true multi select false single select



        // sendKeys() we can set value but not commanded
        // country.sendKeys("UK")




    }
}
