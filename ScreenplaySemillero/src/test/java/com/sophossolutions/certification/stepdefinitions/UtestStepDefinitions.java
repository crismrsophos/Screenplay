package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.tasks.UTestHome;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }


    @Given("{string} navega a la pagina {string}")
    public void ingresaALaPagina(String string, String string2) {
    }
    @When("suministra los siguientes datos")
    public void suministraLosSiguientesDatos() {
        theActorInTheSpotlight().attemptsTo(UTestHome.in());
    }
    @When("suministra los datos de direccion")
    public void suministraLosDatosDeDireccion() {

    }
}
