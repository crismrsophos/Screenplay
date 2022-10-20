package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.*;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

public class SauceDemoBuyStepDefinitions {
    @Given("{string} selecciona el producto a comprar")
    public void seleccionaElProductoAComprar(String string) {
        throw new io.cucumber.java.PendingException();
    }
    @When("va al carro de compras y diligencia los campos del formulario de checkout con los datos")
    public void vaAlCarroDeComprasYDiligenciaLosCamposDelFormularioDeCheckoutConLosDatos(io.cucumber.datatable.DataTable dataTable) {
        throw new io.cucumber.java.PendingException();
    }
}
