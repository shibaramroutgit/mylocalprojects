package org.example.pages.flightreservation;

import org.example.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlightSearchPage extends AbstractPage {

    private static final Logger log = LoggerFactory.getLogger(FlightSearchPage.class);

    @FindBy(id="pasanger")
    WebElement pasangerCount;

    @FindBy(id="SeachFlight")
    WebElement seachFlightButton;

    public FlightSearchPage(WebDriver driver)
    {
        super(driver);
    }
    @Override
    public boolean isPageload() {
        this.wait.until(ExpectedConditions.visibilityOf(this.pasangerCount));
        return this.pasangerCount.isDisplayed();
    }


    public void selectPasanger(String PassangerN)
    {
        Select passangerNum = new Select(this.pasangerCount);
        passangerNum.deselectByValue(PassangerN);

    }

    public void seachFlight()
    {
        this.seachFlightButton.click();
    }
}
