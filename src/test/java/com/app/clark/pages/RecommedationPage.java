package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommedationPage extends BasePage {

    public RecommedationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class ='cucumber-reward-screen-header _header_ie5k4r']") private WebElement pageHeaderTxt;
    @FindBy(xpath="//*[@class='cucumber-reward-screen-text _text_ie5k4r']") private WebElement pageTxt;
    @FindBy(xpath="//*[text()[contains(.,'Empfehlungen ansehen')]]") private WebElement recommendationsBtn;
    @FindBy(xpath="//*[text()[contains(.,'Persönliche')]]") private WebElement assessBtn;
    @FindBy(xpath="//*[text()[contains(.,'Überblick')]]") private WebElement overviewTab;
    @FindBy(xpath="//*[text()[contains(.,'Wichtigste')]]") private WebElement mainRecommendationTab;
    @FindBy(xpath="//*[text()[contains(.,'Loslegen')]]") private WebElement startBtn;
    @FindBy(xpath ="//*[@class='_arguments-title_1snybf']") private  WebElement cardTitle;
    @FindBy(xpath ="//*[@class='cucumber-manager-category-title _heading__title_bpwfo0']") private WebElement recommendedCardTitle;


    public void navigateToRecommendationPage(){
        wait.forElementToBeDisplayed(10,recommendationsBtn,"recommendationsBtn");
        recommendationsBtn.click();
    }
    public void selectOverviewTab(){
        wait.forElementToBeDisplayed(10,overviewTab,"overviewTab");
        overviewTab.click();
    }

    /**
     *
     * @param recCard recommendation card to be navigated for card details
     */
    public void navigateToRecommendedCard(String recCard){
        WebElement recommendedCardBtn = findElementByXpath(getRecCardBtnXpath(recCard));
        wait.forElementToBeDisplayed(10,recommendedCardBtn,"recommendedCard");
        recommendedCardBtn.click();
        wait.forElementToBeDisplayed(10, startBtn,"startBtn");
        startBtn.click();
    }

    /**
     *
     * @param recCard selecting recommended card
     */
    public void selectRecommendedCard(String recCard){
        WebElement recommendedCard = findElementByXpath(getRecCardXpath(recCard));
        wait.forElementToBeDisplayed(10,recommendedCard,"recommendedCard");
        recommendedCard.click();
    }

    /**
     *
     * @param recCard asserting recommended card in card details
     */
    public void verifySelectedCard(String recCard){
        wait.forElementToBeDisplayed(10,cardTitle,"cardTitle");
        Assert.assertEquals(recCard,cardTitle.getText());
    }

    /**
     *
     * @param recCard recommended card string
     * @return returns xpath for recommended card
     */
    public String getRecCardXpath(String recCard){
        String recCardXpath;
        recCardXpath ="//*[@data-cucumber-recommendation-card-title='" + recCard + "']";
        return recCardXpath;
    }

    /**
     *
     * @param recCard recommended card string
     * @return returns xpath for recommended card button
     */
    public String getRecCardBtnXpath(String recCard) {
        String recCardXpath;
        recCardXpath = "//*[@data-cucumber-questionnaire-link='" + recCard + "']";
        return recCardXpath;
    }


}
