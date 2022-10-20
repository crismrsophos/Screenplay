package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;
import static com.sophossolutions.certification.userinfaces.BuyCompleteSauceDemoPage.*;

import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.models.BuySauce;
import com.sophossolutions.certification.tasks.CheckoutBuySauce;
import com.sophossolutions.certification.tasks.Select;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

public class SauceDemoBuyStepDefinitions {
    @When("selecciona el producto {string} y diligencia los campos del formulario de checkout con los datos")
    public void vaAlCarroDeComprasYDiligenciaLosCamposDelFormularioDeCheckoutConLosDatos(String product, BuySauce data) {
        theActorInTheSpotlight()
                .attemptsTo(
                        Select.theProduct(product),
                        CheckoutBuySauce.checkoutProcess(data));
    }

    @Then("verifica que el mensaje mostrado {string}")
    public void verificaQueElMensajeSea(String msg) {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(GetText.theField(TITLE_BUY_FINISHED), containsStringIgnoringCase(msg)));
    }
}
