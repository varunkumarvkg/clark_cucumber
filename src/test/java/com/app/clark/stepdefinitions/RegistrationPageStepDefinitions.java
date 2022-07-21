package com.app.clark.stepdefinitions;

import com.app.clark.pages.RegistrartionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegistrationPageStepDefinitions {

    private RegistrartionPage registrartionPage;

    public RegistrationPageStepDefinitions(){
        this.registrartionPage = new RegistrartionPage();
    }

    @And(": User enters the email {string}")
    public void userEntersTheEmail(String email) {
        registrartionPage.enterEmail(email);
    }

    @And(": User enters the password {string}")
    public void userEntersThePassword(String password) {
        registrartionPage.enterPassword(password);
    }

    @And(": User registers the details")
    public void userRegistersTheDetails() {
        registrartionPage.submitRegistration();
    }

   }
