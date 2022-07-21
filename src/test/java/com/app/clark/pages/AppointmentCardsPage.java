package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class AppointmentCardsPage extends BasePage {

    AppointmentCardsPage(){ PageFactory.initElements(driver,this);    }

    @FindBy(xpath ="//*[contains(text(),'Angebot')]") private WebElement reqQuoteBtn;

    /**
     *
     * @param opportunityCard string of the opportunity card name
     * @return returns the schedule confirmed date
     */
    public String getConfirmedDate(String opportunityCard){
        String confirmedDate;
        WebElement confirmationDate = findElementByXpath(this.getConfirmedDateXpath(opportunityCard));
        confirmedDate = confirmationDate.getText();
        return confirmedDate;
    }

    /**
     *
     * @param opportunityCard string of the opportunity card name
     * @return returns the xpath of the selected card's date
     */
    public String getConfirmedDateXpath(String opportunityCard){
        String dateXpath;
        dateXpath = "//*[@data-test-opportunity-card ='"+opportunityCard+"']/div/span";
        return dateXpath;
    }


}
