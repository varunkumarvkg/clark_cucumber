package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary cucumber-cookie-banner-accept-btn _banner-buttons_1hvnco']")
    private WebElement allCookiesAcceptBtn;
    @FindBys(@FindBy(xpath = "//*[@role = 'menuitem']")) private List<WebElement> tabs;
    @FindBy(xpath = "//*[text()[contains(.,'Optimierungsvorschläge']]") private WebElement bedarfCheck;

    @FindBy(xpath = "//*[@href='/de/app/recommendations']") private WebElement bedarfTab;
    @FindBy(xpath = "//*[@data-test-button-appearance ='primary']") private WebElement startBtn;


    public void goToLandingPage(){
        driver.get("https://staging.clark.de/de/app/contracts?cv=2");
        wait.forLoading(5);
    }
    public void acceptAllCookies(){
        wait.forElementToBeDisplayed(10,allCookiesAcceptBtn,"allCookiesAcceptBtn");
        allCookiesAcceptBtn.click();
        if(driver.getCurrentUrl().contains("login")) {
            driver.get("https://staging.clark.de/de/app/contracts?cv=2");
            wait.forLoading(5);
        }
    }

    public void selectBedarfTab(){
        wait.forElementToBeDisplayed(10,bedarfTab,"bedarfTab");
        executor.buttonClick(bedarfTab);
    }

    public void startQuestionnaire() throws InterruptedException {
        Thread.sleep(2000);
        wait.forElementToBeDisplayed(10,startBtn,"startBtn");
        startBtn.click();
    }



}
