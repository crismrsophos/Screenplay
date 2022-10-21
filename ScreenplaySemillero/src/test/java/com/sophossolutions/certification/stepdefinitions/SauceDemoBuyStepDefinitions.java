package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.certification.models.UserCredential;
import com.sophossolutions.certification.models.UserInformation;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.CheckoutInfo;
import com.sophossolutions.certification.tasks.Inventory;
import com.sophossolutions.certification.tasks.Login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.*;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;


public class SauceDemoBuyStepDefinitions {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }
}
