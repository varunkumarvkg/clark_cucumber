package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class QuestionnairePage extends BasePage
{
     public QuestionnairePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mandate_birthdate") private WebElement birthDateFld;
    @FindBy(xpath = "//*[contains(text(),'Abbrechen')]") private WebElement abortBtn;
    @FindBy(xpath ="//*[@class='_question__intro_ovng3k']/p/span") private WebElement questionTitle;
    @FindBy(xpath = "//*[text()[contains(.,'Weiter')]]") private WebElement continueBtn;
    @FindBy(xpath = "//*[contains(text(), 'Zurück')]") private WebElement backBtn;
    @FindBys(@FindBy(xpath = "//*[@class ='_radiobutton_1ybksg']/li/label/label"))
    private List<WebElement> optionRadioBtns;
    @FindBys(@FindBy(xpath = "//*[@class ='_checkboxinput_1vbm6f']/li/div/label"))
    private List<WebElement> checkBoxOptions;
    @FindBy(xpath = "//*[@placeholder = 'Berufsbezeichnung']") private WebElement jobTitleTxtFld;
    @FindBy(xpath = "//*[@type = 'text']") private WebElement incomeTxtFld;
    @FindBy(xpath = "//*[text()[contains(.,'Speichern')]]") private WebElement saveBtn;

    @FindBy(xpath="//*[text()[contains(.,'Geschlecht')]]") private WebElement genderQuestion;
    @FindBy(xpath="//*[text()[contains(.,'wohnst')]]") private WebElement houseQuestion;
    @FindBy(xpath="//*[text()[contains(.,'Fahrzeuge')]]") private WebElement vechicleQuestion;
    @FindBy(xpath="//*[text()[contains(.,'Wie')]]") private WebElement familyStatusQuestion;
    @FindBy(xpath="//*[text()[contains(.,'Ausbildung')]]") private WebElement kidQuestion;
    @FindBy(xpath="//*[text()[contains(.,'machst')]]") private WebElement professionQuestion;
    @FindBy(xpath="//*[text()[contains(.,'krankenversichert')]]") private WebElement insuranceQuestion;
    @FindBy(xpath="//*[text()[contains(.,'deiner')]]") private WebElement hobbyQuestion;
    @FindBy(xpath="//*[text()[contains(.,'Hast')]]") private WebElement petQuestion;

    /**
     *
     * @param dob represents date of birth
     */
    public void  enterDob(String dob){
        wait.forElementToBeDisplayed(10,birthDateFld,"birthDateFld");
        birthDateFld.sendKeys(dob);
        executor.buttonClick(continueBtn);
    }

    public void genderQuestionnairePage(){
        wait.forElementToBeDisplayed(10, genderQuestion, "genderQuestion");
    }

    public void waitForHouseQuestion(){
        wait.forElementToBeDisplayed(10,houseQuestion,"houseQuestion");
    }

    public void waitForVechicleQuestion(){
        wait.forElementToBeDisplayed(60, vechicleQuestion, "vechicleQuestion");
    }

    public void waitForFamilyStatusQuestion(){
        wait.forElementToBeDisplayed(10, familyStatusQuestion,"familyStatusQuestion");
    }

    public void waitForKidQuestion(){
        wait.forElementToBeDisplayed(10, kidQuestion,"kidQuestion");
    }

    public void waitForProfessionQuestion(){
        wait.forElementToBeDisplayed(10,professionQuestion,"professionQuestion");
    }

    public void waitForInsuranceQuestion(){
        wait.forElementToBeDisplayed(10,insuranceQuestion,"insuranceQuestion");
    }

    public void waitForHobbyQuestion(){
        wait.forElementToBeDisplayed(10, hobbyQuestion,"hobbyQuestion");
    }

    public void waitForPetQuestion(){
        wait.forElementToBeDisplayed(10,petQuestion,"petQuestion");
    }

    /**
     *
     * @param option radio button option to be selected
     */
    public void selectRadioBtnOption(String option){
        wait.forPresenceOfElements(10,optionRadioBtns,"optionRadioBtns");
        selectRadioOrCheckBoxOptions(optionRadioBtns,option);
    }

    /**
     *
     * @param option check box option to be selected
     */
    public void selectCheckBoxOption(String option){
        wait.forPresenceOfElements(10,checkBoxOptions,"checkBoxOptions");
        selectRadioOrCheckBoxOptions(checkBoxOptions,option);
        executor.buttonClick(continueBtn);
    }

    /**
     *
     * @param jobTitle job title to be entered
     */
    public void enterJobTitle(String jobTitle){
        wait.forElementToBeDisplayed(10,jobTitleTxtFld, "jobTitleTxtFld");
        jobTitleTxtFld.sendKeys(jobTitle);
        executor.buttonClick(continueBtn);
    }

    /**
     *
     * @param income income to be entered
     */
    public void enterAnnualIncome(String income){
        wait.forElementToBeDisplayed(5, incomeTxtFld, "incomeTxtFld");
        incomeTxtFld.sendKeys(income);
    }

    public void saveQuestionnaire(){
        executor.buttonClick(saveBtn);
    }

}
