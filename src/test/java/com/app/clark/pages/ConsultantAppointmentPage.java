package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ConsultantAppointmentPage extends BasePage {

     ConsultantAppointmentPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath ="//*[@class='_title_sk7w3d']" ) private WebElement pageTitle;
    @FindBy(xpath = "_description_sk7w3d") private WebElement pageDescription;
    @FindBy(xpath = "//*[@data-test-field='First Name']") private WebElement firstNameTxtBox;
    @FindBy(xpath = "//*[@data-test-field='Last Name']") private WebElement lastNameTxtBox;
    @FindBy(xpath = "//*[@data-test-field='Phone Number']") private WebElement phnNoTxtBox;
    @FindBy(xpath = "//*[@data-test-field='Date']") private WebElement appointmentDateFld;
    @FindBy(xpath = "//*[@data-test-field='Time']") private WebElement appointmentTimeFld;
    @FindBys(@FindBy(xpath = "//*[@data-test-field='Time']/option")) List<WebElement> appointmentTimings;
    @FindBy(xpath="//*[contains(text(),'deinen')]") private WebElement toContactBtn;
    @FindBy(xpath = "//*[@class ='cucumber-reward-screen-header _header_ie5k4r']") private WebElement pageHeaderTxt;
    @FindBy(xpath="//*[@class='cucumber-reward-screen-text _text_ie5k4r']") private WebElement pageTxt;

    /**
     *
     * @param year represents the year
     * @param month represents the month
     * @return returns the List of dates
     */
    public List<String>getAppointmentDates(String year, String month){
        List<String> dates = new ArrayList<>();
        List<WebElement>appointmentDates = findListOfElementsByXpath(this.getDatePickerXpath(year,month));
        for (WebElement appointmentDate : appointmentDates) {
            dates.add(appointmentDate.getText());
        }
        return dates;
    }

    /**
     *
     * @param year represents the year
     * @param month represents the month
     * @return returns the xpath for the dates
     */
    public String getDatePickerXpath(String year, String month){
        String datePickerXpath;
        datePickerXpath = "//*[contains(text(),'"+month+" "+year
                +"')]/parent :: ul/following-sibling :: ul[@data-view='days']/li[@data-view='day']";
        return datePickerXpath;
    }


}
