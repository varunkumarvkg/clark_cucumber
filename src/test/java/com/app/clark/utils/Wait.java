package com.app.clark.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Wait {

    private WebDriver driver;


    public Wait(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param condition represents the condition for wait
     * @param timeoutMessage represents wait time in seconds
     * @param timeout represents timeout message to be displayed
     */
    private void waitUntilCondition(ExpectedCondition condition, String timeoutMessage, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.withMessage(timeoutMessage);
        wait.until(condition);
    }

    /**
     *
     * @param timeout represents wait time in seconds
     */
    public void forLoading(int timeout){
        ExpectedCondition<Object> condition = ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";");
        String timeoutMessage = "Page didn't load after " + Integer.toString(timeout) + " seconds.";
        waitUntilCondition(condition, timeoutMessage, timeout);
    }

    /**
     *
     * @param timeout represents wait time in seconds
     * @param webElement represents WebElement to be  visible
     * @param webElementName represents WebElement name in string
     */
    public void forElementToBeDisplayed(int timeout, WebElement webElement, String webElementName){
        ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf(webElement);
        String timeoutMessage = webElementName + " wasn't displayed after " + Integer.toString(timeout) + " seconds.";
        waitUntilCondition(condition, timeoutMessage, timeout);
    }

    /**
     *
     * @param timeout represents wait time in seconds
     * @param elements represents List of WebElements to be visisble
     * @param elementName represents WebElement name in string
     */
    public void forPresenceOfElements(int timeout, List<WebElement> elements, String elementName){
        ExpectedCondition<List<WebElement>> condition = ExpectedConditions.visibilityOfAllElements(elements);
        String timeoutMessage = elementName + " elements were not displayed after " + Integer.toString(timeout) + " seconds.";
        waitUntilCondition(condition, timeoutMessage, timeout);
    }
}
