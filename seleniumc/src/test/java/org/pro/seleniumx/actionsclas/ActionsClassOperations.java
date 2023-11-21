package org.pro.seleniumx.actionsclas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassOperations {
    /**
     * For Single Action we use perform()
     * for multiple Action we sue build().perform()
     */

    @Test
    public void testClass()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        WebElement testElement = driver.findElement(By.xpath("//[@class='linkUser']"));
        WebElement parentElement = driver.findElement(By.xpath("//[@class='parentDiv']"));
        WebElement childElement = driver.findElement(By.xpath("//[@class='ChildDiv']"));


        // Create Action Class Object, which accept parameter as Driver  object
        Actions actions = new Actions(driver);

        // SendKeys()
        actions.sendKeys(testElement,"Boy School").build().perform();
        actions.sendKeys(Keys.TAB).build().perform();

        // Click()
        actions.click(testElement).build().perform();

        //MoveToElement() - It use to hover, click and drag-drop. it moves the cursor to element
        actions.moveToElement(testElement).build().perform(); // Mouse Hover on Element
        actions.moveToElement(testElement).click().build().perform();// Click Operation
        actions.moveToElement(testElement).clickAndHold().build().perform();
        actions.moveToElement(testElement).doubleClick().build().perform();

        //DoubleClick()
        actions.doubleClick(testElement).build().perform();

        //contextClick()
        actions.contextClick(testElement).build().perform();

        //dragAndDrop()
        actions.dragAndDrop(childElement,parentElement).build().perform();

        //dragAndDropBy()- Useful to resize teh control
        actions.dragAndDropBy(testElement,200,300).build().perform();

        //clickAndHold()
        actions.clickAndHold(testElement).build().perform();

        //keyDown() keyUp() Ctrl+A
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();





    }
}
