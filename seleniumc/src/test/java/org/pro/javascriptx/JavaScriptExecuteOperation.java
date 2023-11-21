package org.pro.javascriptx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptExecuteOperation {

    /**
     * Javascript executor allows you to run  Javascript/jquery code in the browser
     * JavaScriptExecutor is a class present in the selenium
     * Methods of the JavaScriptExecutor Class
     *          executeScript()
     *          executeAsyncScript()
     *
     * cast the driver object to JavascriptExecutor.
     * JavascriptExecutor js = (JavascriptExecutor) driver;
     * js.executeScript("javascript command");
     *
     *
     *
     *
     */

    @Test
    public void caseZoomLevels()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Set Zoom Level
        js.executeScript("document.body.style.zoom='90");

    }
    @Test
    public void caseHighlightElement()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
        WebElement ele = driver.findElement(By.xpath("//*[@id='Email']"));
        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Highlight Element
        js.executeScript("document.getElementById('lst-ib').style.backgroundColor='red'");
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
    }
    @Test
    public void caseScrollByPage()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Find Element as Object
        js.executeScript("window.scrollByPages(3)");// Page down (1 page what display at body at a time)

    }
    @Test
    public void caseFiendElement()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Find Element as Object
        Object searchTextBar = js.executeScript("return document.getElementById('lst-ib')");
        // Cast Object to WebElement
        ((WebElement)searchTextBar).sendKeys("abc");

    }

    @Test
    public void caseClickElement()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.xpath("//[@class='val'"));

        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementByName('btnI')[0].click()");
        js.executeScript("arguments[0].click()",element);
    }

    @Test
    public void caseSetValue()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.xpath("//[@class='val'"));
        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementByName('textbox').value='user name'");
        js.executeScript("arguments[0].value='value",element);

    }

    @Test
    public void caseScrollWebpage()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 300)"); //scrollBy(horizontalDistance, verticalDistance). Up

        js.executeScript("window.scrollBy(0, -300)"); //scrollBy(horizontalDistance, verticalDistance). Down
    }
    @Test
    public void caseScrollPageTopDown()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //Page Top
        js.executeScript("window.scrollBy(document.body.scrollHeight,0)"); //Page Bottom
    }

    @Test
    public void caseScrollIntoView ()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.xpath("//[@class='val'"));
        // Type cast driver object into JavaScriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('default').scrollIntoView(true)");
        //or
        js.executeScript("arguments[0].scrollIntoView()",element);//Scroll till the web element display

    }










}
