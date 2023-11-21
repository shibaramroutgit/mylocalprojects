package org.pro.seleniumx.webdriverexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;

public class OptionsOfDriver {

    /**
     * Driver Options
     * Before Selenium 4, we Set the browser capabilities using "DesiredCapabilities" class
     * DesiredCapabilities is now (selenium4) deprecated
     *
     * After Selenium 4, we use options class. Evey browser driver has its options class
     * such as ChromeOptions, FirefoxOptions
     *
     * Options class is used to set the default setting to browser while testing UI
     * Options can be added to browser by methods and method parameter
     *
     * Step 1: Create object of options class
     * ChromeOptions options = new ChromeOptions()
     * Step 2: Add settings
     * Step 3: add the option object as parameter to driver object
     * WebDriver driver = new ChromeDriver(options);
     *
     * options.setAcceptInsecureCerts(true) // use to work on expire SSL
     *
     * options.addExtensions(new File("/path/to/extension.crx")); // use to add extension
     *
     * options.addArguments("disable-infobars"); // use to hide the info bar of run browser which display browser control by automation
     *
     * options.addArguments("--headless"); // use to hide the address bar
     *
     * if you want to use desired capabilities with option then merge() method is use
     *  DesiredCapabilities dc = new DesiredCapabilities();
     *  dc.setCapability("something", true);
     *  options.merge(dc);
     *
     *  options.addArguments("start-maximized"); // use to maximize browser
     *
     *  options.addArguments("incognito");// open browser incognito mode
     *
     *
     *
     *
     *
     *
     *
     */

    @Test
    public void testCase1()
    {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addExtensions(new File("/path/to/extension.crx"));
        options.addArguments("disable-infobars");
        options.addArguments("--headless");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("something", true);
        options.merge(dc);
        options.addArguments("start-maximized");
        options.addArguments("incognito");
    }

    @Test
    public void testCaseBadSSL()
    {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();

    }

}


