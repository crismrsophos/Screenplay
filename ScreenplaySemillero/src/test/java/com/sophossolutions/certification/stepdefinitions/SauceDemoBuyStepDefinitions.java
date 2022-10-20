package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;
import static com.sophossolutions.certification.userinfaces.CheckoutBuyCompleteSauceDemoPage.*;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.CheckouBuySauce;
import com.sophossolutions.certification.models.CheckoutBuySauceCredential;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

public class SauceDemoBuyStepDefinitions {
    @When("selecciona el producto y diligencia los campos del formulario de checkout con los datos")
    public void vaAlCarroDeComprasYDiligenciaLosCamposDelFormularioDeCheckoutConLosDatos(CheckoutBuySauceCredential data) {
        theActorInTheSpotlight().attemptsTo(CheckouBuySauce.checkoutProcess(data));
    }

    @Then("verifica que el mensaje mostrado {string}")
    public void verificaQueElMensajeSea(String msg) {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(GetText.theField(TITLE_BUY_FINISHED), containsStringIgnoringCase(msg)));
    }
}
