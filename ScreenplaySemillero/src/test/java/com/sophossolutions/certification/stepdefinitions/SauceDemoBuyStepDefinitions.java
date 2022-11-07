package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.certification.models.UserInformation;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.Buy;
import com.sophossolutions.certification.tasks.Select;
import com.sophossolutions.certification.tasks.FinishBuy;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.sophossolutions.certification.userinfaces.CheckoutCompleteSauceDemoPage.*;







import static org.hamcrest.core.StringContains.containsStringIgnoringCase;


public class SauceDemoBuyStepDefinitions {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }
    @Given("{string} escoge un producto para adquirirlo")
    public void escogeUnProductoParaAdquirir(String string) {

    }
    @When("ingresa los datos de envio")
    public void ingresaLosDatosDeEnvio(UserInformation information) {
        theActorInTheSpotlight().attemptsTo(Select.in(), Buy.info(information),FinishBuy.in());

    }
  /* @Then("Verifica que el mensaje sea {string}")
    public void verificaQueElMensajeSea(String message) {
       theActorInTheSpotlight()
               .should(GivenWhenThen.seeThat(GetText.theField(TITTLE_PURCHARSE), containsStringIgnoringCase(message)));*/
    }


