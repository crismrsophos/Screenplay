package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.models.ProductAdvantage;
import com.sophossolutions.certification.models.UserCredential;
import com.sophossolutions.certification.questions.GetText;
import com.sophossolutions.certification.tasks.AdvantageFullfillData;
import com.sophossolutions.certification.tasks.AdvantageLogin;
import com.sophossolutions.certification.tasks.AdvantageSelectProduct;
import com.sophossolutions.certification.utils.GetTarget;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;


import static com.sophossolutions.certification.userinfaces.AdvantageOnlineBuyOrderPaymentPage.ORDER_ADVANTAGE;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.TITLE_SAUCE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

public class AdvantageOnlineBuyStepDefinitions {

    @When("Seleccionar categoria y caracteristicas especificas del producto")
    public void seleccionarCategoriaYCaracteristicasEspecificasDelProducto(ProductAdvantage selectProduct) {
        theActorInTheSpotlight().attemptsTo(AdvantageSelectProduct.in(selectProduct));
    }
    @When("ingrese los siguientes datos")
    public void ingreseLosSiguientesDatos(UserCredential credential) {
        theActorInTheSpotlight().attemptsTo(AdvantageLogin.in(credential), AdvantageFullfillData.in());

    }

    @Then("verifica que el mensaje sea {string} en {string}")
    public void verificaQueElMensajeSeaEn(String advantageMsg, String advantage) {
        theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(GetText.theField(GetTarget.page(advantage)), containsStringIgnoringCase(advantageMsg)));
    }

}
