package org.pro.seleniumx.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableOperation {
    /**
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");

        // Total Rows of the Table using tr tag (Include Header)
        List<WebElement> totalRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

        // Total Columns of the Table using th tag (Include Header)
        List<WebElement> totalColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));

        // Get Name of all Table Header
        for (WebElement th:totalColumns) {

            System.out.print(th.getText() +"  ");
        }
        System.out.println();

        // Get all Table Data
        for(int r=2;r<=totalRows.size();r++)
        {
            List<WebElement> rowTD = driver.findElements(By.xpath("//table[@name='BookTable']//tr["+r+"]/td"));
            for (WebElement td:rowTD) {
                System.out.print(td.getText()+"  ");
            }
            System.out.println("--");
        }

        // Get Specific Column  TD data
        // Identify the header from where to get data

        List<WebElement> headerName = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
       int columnPosition=1;
        for (WebElement name:headerName) {
            if( name.getText().equals("Subject"))
            {
                for (int row=2;row<=totalRows.size();row++)
                {
                    WebElement webTD = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]/td["+columnPosition+"]"));
                    System.out.println(webTD.getText());
                }
            }
            columnPosition++;
        }


        // Get Specific Cell Data
        for (int rx=2;rx<=totalRows.size();rx++)
        {
            for(int c=1;c<=totalColumns.size();c++)
            {
                if (rx==5 & c==4)
                {
                    WebElement webTD = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+rx+"]/td["+c+"]"));
                    System.out.println(webTD.getText());
                }
            }
        }


    }
}
