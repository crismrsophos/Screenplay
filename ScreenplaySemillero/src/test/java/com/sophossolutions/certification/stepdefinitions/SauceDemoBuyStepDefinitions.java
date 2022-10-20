package com.sophossolutions.certification.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.certification.models.CheckoutSauceCredential;
import com.sophossolutions.certification.models.PrepareForCheckoutSauce;
import com.sophossolutions.certification.tasks.PrepareCheckoutSauce;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.sophossolutions.certification.userinfaces.HomeSauceDemoPage.*;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

public class SauceDemoBuyStepDefinitions {
    // PENDIENTE IMPLEMENTAR MÉTODO PARA SELECCIONAR PRODUCTOS Y AGREGAR A CARRITO).
    @Given("selecciona el producto a comprar")
    public void seleccionaElProductoAComprar() {
        // TODO
        //theActorInTheSpotlight().attemptsTo(PrepareCheckoutSauce.prepareFor());
    }
    // PENDIENTE REALIZAR PROCESO DE CHECKOUT DESDE LA VISTA DEL CARRITO DE COMPRAS.
    @When("va al carro de compras y diligencia los campos del formulario de checkout con los datos")
    public void vaAlCarroDeComprasYDiligenciaLosCamposDelFormularioDeCheckoutConLosDatos(CheckoutSauceCredential data) {
        // TODO
    }
}
