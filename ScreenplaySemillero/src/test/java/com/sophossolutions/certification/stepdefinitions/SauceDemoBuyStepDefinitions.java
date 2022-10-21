package com.sophossolutions.certification.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;
import static com.sophossolutions.certification.userinfaces.CheckoutCompleteSauceDemoPage.TITLE_BUY_FINISHED;


import com.sophossolutions.certification.models.UserInformation;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.Buy;
import com.sophossolutions.certification.tasks.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import net.serenitybdd.screenplay.GivenWhenThen;


public class SauceDemoBuyStepDefinitions {
    @Given("{string} selecciona el producto {string}")
    public void seleccionaElProducto(String theActor, String product) {
        theActorCalled(theActor).attemptsTo(Select.theProduct(product));
    }

    @And("diligencia los campos del formulario de checkout con los datos")
    public void diligenciaLosCamposDelFormularioDeCheckoutConLosDatos(UserInformation data) {
        theActorInTheSpotlight().attemptsTo(Buy.checkoutProcess(data));
    }

    @Then("verifica que el mensaje mostrado sea {string}")
    public void verificaQueElMensajeSea(String msg) {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(GetText.theField(TITLE_BUY_FINISHED), containsStringIgnoringCase(msg)));
    }
}