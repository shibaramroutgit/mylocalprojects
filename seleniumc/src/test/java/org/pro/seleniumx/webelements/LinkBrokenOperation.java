package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class LinkBrokenOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");

        // Find all the link of the web page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = links.size();

        // To validate the links we need associate URL
        for (WebElement l:links) {

            String linkURL = l.getAttribute("href");

            try {
                URL httpurl = new URL(linkURL);
                HttpURLConnection connection = (HttpURLConnection) httpurl.openConnection();
                connection.connect();
                if(connection.getResponseCode()==200)
                {
                    System.out.println(l.getAttribute("href") + "-" + connection.getResponseCode() + "-" + "Valid Link");
                }else
                {
                    System.out.println(l.getAttribute("href") + "-" + connection.getResponseCode() + "-" + "Invalid Link");
                }

            }catch (Exception exception)
            {
                exception.getMessage();
            }

        }



    }
}
