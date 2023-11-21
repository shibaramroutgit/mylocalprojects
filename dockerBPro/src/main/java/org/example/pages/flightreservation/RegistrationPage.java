package org.example.pages.flightreservation;

import org.example.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistrationPage extends AbstractPage {

    private static final Logger log = LoggerFactory.getLogger(RegistrationPage.class);

    @FindBy(id="FirstName")
    private WebElement firstNameInput;
    @FindBy(id="LastName")
    private WebElement lastNameInput;
    @FindBy (id="email")
    private WebElement emailInput;
    @FindBy (id="password")
    private WebElement passwordInput;
    @FindBy (name="street")
    private WebElement streetInput;
    @FindBy (name="zip")
    private WebElement zipInput;
    @FindBy (id="register")
    private WebElement registerButton;
    public RegistrationPage(WebDriver driver)
    {
      super(driver);
    }

    @Override
    public boolean isPageload() {
        this.wait.until(ExpectedConditions.visibilityOf(this.registerButton));
        return this.registerButton.isDisplayed();
    }




    public void navigateToRegPage(String regUrl)
    {
        this.driver.get(regUrl);
    }
    public void regUser(String fName, String lName, String email, String street, String zip)
    {
        this.firstNameInput.sendKeys(fName);
        this.lastNameInput.sendKeys(lName);
        this.emailInput.sendKeys(email);
        this.streetInput.sendKeys(street);
        this.zipInput.sendKeys(zip);
    }

    public void regButtonClick()
    {
        this.registerButton.click();
    }
}
