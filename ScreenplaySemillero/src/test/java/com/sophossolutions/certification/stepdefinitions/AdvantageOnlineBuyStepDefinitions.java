package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.models.ProductAdvantage;
import com.sophossolutions.certification.tasks.AdvantageSelectProduct;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class AdvantageOnlineBuyStepDefinitions {

    @When("Seleccionar categoria y caracteristicas especificas del producto")
    public void seleccionarCategoriaYCaracteristicasEspecificasDelProducto(ProductAdvantage selectProduct) {
        theActorInTheSpotlight().attemptsTo(AdvantageSelectProduct.in(selectProduct));
    }
    @When("ingrese los siguientes datos")
    public void ingreseLosSiguientesDatos(io.cucumber.datatable.DataTable dataTable) {

    }

}
