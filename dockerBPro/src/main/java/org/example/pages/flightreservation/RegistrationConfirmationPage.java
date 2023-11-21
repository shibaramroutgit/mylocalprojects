package org.example.pages.flightreservation;

import org.example.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistrationConfirmationPage extends AbstractPage {
    private static final Logger log = LoggerFactory.getLogger(RegistrationConfirmationPage.class);

    private @FindBy(id="go-to-flights-search")
    WebElement searchFlightButton;

    public RegistrationConfirmationPage(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public boolean isPageload() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchFlightButton));
        return this.searchFlightButton.isDisplayed();
    }

    private void goToFlightSearch()
    {
        this.searchFlightButton.click();
    }
}
