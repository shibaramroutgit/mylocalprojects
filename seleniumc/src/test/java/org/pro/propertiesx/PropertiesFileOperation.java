package org.pro.propertiesx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileOperation {

    /**
     * Properties file is a Java File Operation to work
     * Properties file store key=value pair
     *
     *
     */

    @Test
    public void testCase1() {
       try{
           FileReader fileReader = new FileReader("D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\resources\\testdata.properties");
            Properties properties = new Properties();
            properties.load(fileReader);
            String browser= properties.getProperty("TestBrowser");
            if(browser.equals("Chrome"))
            {
                WebDriver driver = new ChromeDriver();
                driver.get(properties.getProperty("TestWebPage"));
            }else
           {
               System.out.println("No Driver Set");
           }

        }catch (IOException IO){
           System.out.println(IO.getMessage());
       }


    }
}
