package org.pro.seleniumx.testexceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionList {
    /**
     * Exception 2 Types
     * 1 Checked Exception - Exception accorded at writing code or compile
     * 2 Unchecked Exception - Exception accorded at run time
     *
     *
     * ElementNotVisibleException:-
     * It occurs when element is present but not visible to do operation
     *
     * ElementClickInterceptedException:-
     * It occurs when the target element that you want to click is overlaid by some other element in the web page.
     *
     * connectionClosedException:-
     * It occurs when driver connection is disconnected
     *
     * InsecureCertificateException:-
     * It occurs when SSL certificate is expire of the undergo test UTL
     *
     * InvalidArgumentException:-
     * It occurs when parameters type mismatch
     *
     * InvalidCoordinatesException:-
     * It occurs when we are moving cursor / dropping / resize element wrong coordinate
     *
     * InvalidElementStateException:-
     * It occurs when element state not allow to do some action such as attempting to clear an element that isn't both editable and resettable.
     *
     * NoAlertPresentException:-
     * It occurs when we try to switch to an alert, but it is not present
     *
     * NoSuchAttributeException:-
     * It occurs when we try to get the attribute which is  not present on web element
     *
     * NoSuchElementException:
     * It occurs when we try to get the web element by wrong locator
     *
     * NoSuchFrameException:-
     * It occurs when we try to switch to a frame, but it is not present
     *
     * NoSuchWindowException:
     * It occurs when we try to switch to a window, but it is not present
     *
     * RemoteDriverServerException:
     * It occurs when remote server does not response
     *
     * ScreenshotException:-
     * It occurs when system unable to take screenshot
     *
     * ScriptTimeoutException, TimeoutException:-
     * It occurs when script take more time to execute as it set for
     *
     * StaleElementReferenceException:-
     * It occurs when element was present before, but now it is not due to refresh or other
     *
     * WebDriverException:
     * It occurs when web driver do action after it close
     *
     *
     *
     */

    @Test
    public void testCase1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

    }

}
