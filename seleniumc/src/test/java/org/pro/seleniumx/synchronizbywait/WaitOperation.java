package org.pro.seleniumx.synchronizbywait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitOperation {
    /**
     * implicitlyWait -- It applicable to all web element
     * explicitWait -- It applicable to a given state of web element
     *
     */

    @Test
    public void testImplicitlyWait()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        //This wait applicable at driver level , it throws no such element after given time if unable to fiend element on DOM
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement clickMe = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
        String s1 = clickMe.getText();
        System.out.println(s1);
    }

    @Test
    public void testExplicitWait()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Clickable
        WebElement clickMe = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(clickMe));
        String s1 = clickMe.getText();

        // alertIsPresent()
        wait.until(ExpectedConditions.alertIsPresent());
        String text1 = driver.switchTo().alert().getText();
        System.out.println(text1);

        // elementSelectionStateToBe()
        WebElement check1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
        wait.until(ExpectedConditions.elementSelectionStateToBe(check1, false));
        check1.click();

    }


    @Test
    public void testFluentWait()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(10));
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.ignoring(NoSuchElementException.class);

        WebElement w1 = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        fluentWait.until(ExpectedConditions.elementToBeClickable(w1));
        w1.sendKeys("Test Address");


    }

    @Test
    public void testThreadSleep()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        try {
            WebElement w1 = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
            Thread.sleep(2000); // driver.wait(2000);
            w1.sendKeys("Test Address");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }






}
