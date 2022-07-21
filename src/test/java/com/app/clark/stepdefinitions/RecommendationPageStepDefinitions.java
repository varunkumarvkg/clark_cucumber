package com.app.clark.stepdefinitions;

import com.app.clark.pages.RecommedationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RecommendationPageStepDefinitions {

    private RecommedationPage recommedationPage;

    public RecommendationPageStepDefinitions(){
        this.recommedationPage = new RecommedationPage();
    }

    @And(": User navigates to recommended Card page")
    public void userNavigatesToRecommendedCardPage() {
        recommedationPage.navigateToRecommendationPage();
    }

    @And(": User navigates to overviewtab")
    public void userNavigatesToOverviewtab() {
        recommedationPage.selectOverviewTab();
    }

    @And(": User selects a recommended card {string}")
    public void userSelectsARecommendedCard(String recCard) {
        recommedationPage.selectRecommendedCard(recCard);
    }

    @Then(": User should see the selected card details {string}")
    public void userShouldSeeTheSelectedCardDetails(String recCard) {
        recommedationPage.verifySelectedCard(recCard);
    }

}
