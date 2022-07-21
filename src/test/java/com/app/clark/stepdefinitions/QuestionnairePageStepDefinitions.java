package com.app.clark.stepdefinitions;

import com.app.clark.pages.QuestionnairePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class QuestionnairePageStepDefinitions {

    private QuestionnairePage questionnairePage;

    public QuestionnairePageStepDefinitions() {
        this.questionnairePage = new QuestionnairePage();
    }

    @When(": User enters the DOB {string}")
    public void userEntersTheDOB(String dob) {
        questionnairePage.enterDob(dob);
    }

    @And(": User selects the gender {string}")
    public void userSelectsTheGender(String gender) {
        questionnairePage.genderQuestionnairePage();
         questionnairePage.selectRadioBtnOption(gender);
    }

    @And(": User selects the type of house {string}")
    public void userSelectsTheTypeOfHouse(String houseType) {
        questionnairePage.waitForHouseQuestion();
        questionnairePage.selectRadioBtnOption(houseType);
    }

    @And(": User selects the type of vechicle {string}")
    public void userSelectsTheTypeOfVechicle(String vehicle) {
        questionnairePage.waitForVechicleQuestion();
        questionnairePage.selectCheckBoxOption(vehicle);
    }

    @And(": User selects the family type {string}")
    public void userSelectsTheFamilyType(String familyType) {
        questionnairePage.waitForFamilyStatusQuestion();
        questionnairePage.selectRadioBtnOption(familyType);
    }

    @And(": User selects the kids under eighteen {string}")
    public void userSelectsTheKidsUnderEighteen(String kids) {
        questionnairePage.waitForKidQuestion();
        questionnairePage.selectRadioBtnOption(kids);
    }

    @And(": User selects the profession {string}")
    public void userSelectsTheProfession(String profession) {
        questionnairePage.waitForProfessionQuestion();
        questionnairePage.selectRadioBtnOption(profession);
    }

    @And(": User enters the type of insurance {string}")
    public void userEntersTheTypeOfInsurance(String insurance) {
        questionnairePage.waitForInsuranceQuestion();
        questionnairePage.selectRadioBtnOption(insurance);
    }

    @And(": User selects the hobby {string}")
    public void userSelectsTheHobby(String hobby) {
        questionnairePage.waitForHobbyQuestion();
        questionnairePage.selectCheckBoxOption(hobby);
    }

    @And(": User selects the pets {string}")
    public void userSelectsThePets(String pet) {
        questionnairePage.waitForPetQuestion();
        questionnairePage.selectCheckBoxOption(pet);
    }

    @And(": User enters the income {string}")
    public void userEntersTheIncome(String income) {
        questionnairePage.enterAnnualIncome(income);
    }


    @And(": User enters the job title {string}")
    public void userEntersTheJobTitle(String jobTitle) {
        questionnairePage.enterJobTitle(jobTitle);
    }

    @And(": User saves the questionnaire")
    public void userSavesTheQuestionnaire() {
        questionnairePage.saveQuestionnaire();
    }


}
