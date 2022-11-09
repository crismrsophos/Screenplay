package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.models.ProductAdvantage;
import com.sophossolutions.certification.models.UserCredential;
import com.sophossolutions.certification.tasks.AdvantageFullfillData;
import com.sophossolutions.certification.tasks.AdvantageLogin;
import com.sophossolutions.certification.tasks.AdvantageSelectProduct;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class AdvantageOnlineBuyStepDefinitions {

    @When("Seleccionar categoria y caracteristicas especificas del producto")
    public void seleccionarCategoriaYCaracteristicasEspecificasDelProducto(ProductAdvantage selectProduct) {
        theActorInTheSpotlight().attemptsTo(AdvantageSelectProduct.in(selectProduct));
    }
    @When("ingrese los siguientes datos")
    public void ingreseLosSiguientesDatos(UserCredential credential) {
        theActorInTheSpotlight().attemptsTo(AdvantageLogin.in(credential), AdvantageFullfillData.in());

    }

}
