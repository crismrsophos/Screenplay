package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;
import static com.sophossolutions.certification.userinfaces.CheckoutCompleteSauceDemoPage.*;

import com.sophossolutions.certification.models.UserInformation;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.Buy;
import com.sophossolutions.certification.tasks.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

public class SauceDemoBuyStepDefinitions {
    @Given("{string} selecciona el producto {string}")
    public void seleccionaElProducto(String theActor, String product) {
        theActorCalled(theActor).attemptsTo(Select.theProduct(product));
    }

    @When("selecciona los productos con precio menor a {string}")
    public void seleccionaLosProductosConPrecioMenorA(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("diligencia los campos del formulario de checkout con los datos")
    public void diligenciaLosCamposDelFormularioDeCheckoutConLosDatos(UserInformation data) {
        theActorInTheSpotlight().attemptsTo(Buy.checkoutProcess(data));
    }

    @Then("verifica que el mensaje mostrado {string}")
    public void verificaQueElMensajeSea(String msg) {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(GetText.theField(TITLE_BUY_FINISHED), containsStringIgnoringCase(msg)));
    }
}
