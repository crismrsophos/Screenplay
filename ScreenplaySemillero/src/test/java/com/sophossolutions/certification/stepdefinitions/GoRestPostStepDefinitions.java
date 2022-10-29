package com.sophossolutions.certification.stepdefinitions;

import com.sophossolutions.certification.models.User;
import com.sophossolutions.certification.models.UserPost;
import com.sophossolutions.certification.tasks.ExecutePatchToken;

import static com.sophossolutions.certification.constans.Secret.TOKEN_GO_REST;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.Map;

import com.sophossolutions.certification.models.User;
import com.sophossolutions.certification.tasks.ExecutePatchToken;
import com.sophossolutions.certification.tasks.ExecutePostToken;
import com.sophossolutions.certification.utils.GetType;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static com.sophossolutions.certification.constans.Secret.TOKEN_GO_REST;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GoRestPostStepDefinitions {
    @When("ejecuta el método post {string} con los siguientes datos")
    public void ejecutaElMétodoPostConLosSiguientesDatos(String endpoint, UserPost bodyUser) {
        theActorInTheSpotlight().attemptsTo(ExecutePostToken.setInfoUser(TOKEN_GO_REST, endpoint, bodyUser));
    }

}
