package org.example.log4jsetup;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class UserReg {

    /**
     * Process to Configure Log4j
     * Step1: Add Log 4j Dependency on POM.XML
     * Step2: Create a Folder at Project Level and keep "log4j.properties" file with default setting. It set the nature of log appender
     * Step3: Create a folder at Project Level to keep logs (Create applog.txt file)
     * Step4: Define a global Logger Object to access through class
     * --Logger logObject = Logger.getLogger(ClassName.Class);
     * Step5: Load the log4j.Properties file (PropertyConfigurator.configure("D:\\MyProjectsGIT\\seleniumprojects\\SeleniumConceptWorkspaceA\\seleniumconcepts\\src\\test\\resources\\log4j.properties");
     * Step6: use "logObject.info("User Define Message") where we need log
     * Step7: Run the code and validate log
     */

     WebDriver driver= new ChromeDriver();
     Logger logger = Logger.getLogger(UserReg.class);
    @BeforeSuite
    public void setup()
    {

        PropertyConfigurator.configure("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\\\log4j.properties");
        driver.manage().window().maximize();

    }

    @Test
    public void testCase1()
    {
        logger.info("testCase1 Start");
        driver.get("https://www.guru99.com/selenium-tutorial.html");
        logger.info("testCase1 End");
    }
    @Test
    public void testCase2()
    {
        logger.info("testCase2 Start");
        driver.get("https://demo.automationtesting.in/Register.html");
        logger.info("testCase2 End");
    }
    @Test
    public void testCase3()
    {
        logger.info("testCase3 Start");
        driver.get("https://www.selenium-tutorial.com/");
        logger.info("testCase3 End");
    }

}
