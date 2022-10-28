package com.sophossolutions.certification.stepdefinitions;

import static com.sophossolutions.certification.constans.Secret.TOKEN_GO_REST;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.Map;

import com.sophossolutions.certification.models.User;
import com.sophossolutions.certification.tasks.ExecutePatchToken;
import com.sophossolutions.certification.utils.GetType;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GoRestPatchStepDefinitions {

    @Given("{string} desea consumir la información en la siguiente {string}")
    public void deseaConsumirLaInformaciónEnLaSiguienteHttpsGorestCoInPublicV2Users(String actorName, String baseUrl) {
        theActorCalled(actorName).whoCan(CallAnApi.at(baseUrl));
    }

    @When("ejecuta el método patch {string} con los siguientes datos")
    public void cuandoEjecutaElMétodoPatchConLosSiguientesDatos(String endpoint, User bodyUser) {
        theActorInTheSpotlight().attemptsTo(ExecutePatchToken.setInfoUser(TOKEN_GO_REST, endpoint, bodyUser));
    }

    @Then("valida que el código de respuesta sea {int} y contenga los valores")
    public void validaQueElCódigoDeRespuestaSea(Integer statusCode, Map<String, String> validateReponse) {
        theActorInTheSpotlight().should(seeThatResponse(response -> {
            response.statusCode(statusCode);
            for (Map.Entry<String, String> entry : validateReponse.entrySet()) {
                response.body(entry.getKey(),
                        equalTo(GetType.of(
                                entry.getValue(),
                                SerenityRest.lastResponse().getBody().jsonPath().get(entry.getKey())
                        )));
            }
        }));
    }}