package com.sophossolutions.certification.stepdefinitions;
import com.sophossolutions.certification.models.UtestUserInfo;
import com.sophossolutions.certification.tasks.UTestHome;
import com.sophossolutions.certification.tasks.UTestPersonalInfo;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {



    @When("suministra los siguientes datos")
    public void suministraLosSiguientesDatos(UtestUserInfo Uinfo) {
        theActorInTheSpotlight().attemptsTo(UTestHome.in(), UTestPersonalInfo.in(Uinfo));
    }
    @When("suministra los datos de direccion")
    public void suministraLosDatosDeDireccion() {

    }


}
