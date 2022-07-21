package com.app.clark.basepage;

import com.app.clark.hooks.Setup;
import com.app.clark.utils.JavaScriptExecutorUtility;
import com.app.clark.utils.Wait;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    protected JavaScriptExecutorUtility executor;


    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
        this.executor = new JavaScriptExecutorUtility(this.driver);
    }

    /**
     *
     * @param xpath string of a WebElement xpath
     * @return returns List of WebElements for the xpath
     */
    public List<WebElement> findListOfElementsByXpath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }

    /**
     *
     * @param xpath string of a WebElement xpath
     * @return returns the WebElement for the xpath
     */
    public WebElement findElementByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    /**
     *
     * @param elements List of WebElements of radio button or check box
     * @param option option to be selected from the WebElements
     */
    public void selectRadioOrCheckBoxOptions(@NotNull List<WebElement> elements, String option){
        for(int i=0;i<elements.size();i++) {
            if (option.equals(elements.get(i).getText())) {
                elements.get(i).click();
                break;
            }
        }
    }
}
