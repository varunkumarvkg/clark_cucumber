package com.app.clark.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility {

    private WebDriver driver;

    public JavaScriptExecutorUtility(WebDriver driver){this.driver = driver;
        executor = (JavascriptExecutor) this.driver;
    }

    JavascriptExecutor executor;

    /**
     *
     * @param element represents WebElement to be clicked
     */
    public void buttonClick(WebElement element){
        executor.executeScript("arguments[0].click();", element);
    }


}
