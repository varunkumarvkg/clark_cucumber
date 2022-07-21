package com.app.clark.pages;

import com.app.clark.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RecommendationQuestionnairePage extends BasePage {

    RecommendationQuestionnairePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBys(@FindBy(xpath="//*[@type='radio']")) private List<WebElement> radioBtns;
    @FindBy(id="questionnaire-next-button") private WebElement nextBtn;
    @FindBy(xpath="//*[@type='text']") private WebElement txtBox;
    @FindBy(id="headline") private WebElement questionHeader;
    @FindBy(id="description") private WebElement questionDescription;





}
