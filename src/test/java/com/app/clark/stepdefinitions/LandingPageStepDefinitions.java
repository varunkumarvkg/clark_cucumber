package com.app.clark.stepdefinitions;

import com.app.clark.pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPageStepDefinitions {

    private  LandingPage landingPage;

    public LandingPageStepDefinitions() {
        this.landingPage = new LandingPage();
    }

    @Given(": User gets the landing url")
    public void userGetsTheLandingUrl() {
        landingPage.goToLandingPage();
    }

    @And(": Accept all cookies")
    public void acceptAllCookies() {
        landingPage.acceptAllCookies();
    }

    @When(": User clicks on {string} tab")
    public void userClicksOnTab(String tab) {
        landingPage.selectTab(tab);
    }
    @And(": User clicks on start")
    public void userClicksOnStart() throws InterruptedException {
        landingPage.startQuestionnaire();
    }


    @When(": User clicks on Bedarf tab")
    public void userClicksOnBedarfTab() {
        landingPage.selectBedarfTab();
    }

}
