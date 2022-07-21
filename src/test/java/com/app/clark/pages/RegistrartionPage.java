package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrartionPage extends BasePage {

     public RegistrartionPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//*[@type = 'email']") private WebElement emailAddressFld;
    @FindBy(xpath = "//*[@type ='password']") private WebElement passwordFld;
    @FindBy(xpath = "//*[@type ='submit']") private WebElement submitBtn;


    /**
     *
     * @param email email field for registration
     */
    public void enterEmail(String email){
        wait.forElementToBeDisplayed(10, emailAddressFld, "emailAddressFld");
        emailAddressFld.sendKeys(email);
    }

    /**
     *
     * @param password password field for registration
     */
    public void enterPassword(String password){
        wait.forElementToBeDisplayed(10, passwordFld, "passwordFld");
        passwordFld.sendKeys(password);
    }

    public void submitRegistration(){
        wait.forElementToBeDisplayed(10, submitBtn, "submitBtn");
        submitBtn.click();
    }

}
