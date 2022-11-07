package com.sophossolutions.certification.stepdefinitions;

import com.sophossolutions.certification.models.UserQa;
import com.sophossolutions.certification.tasks.DemoQAInfo;
import com.sophossolutions.certification.tasks.DemoQaButtons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoQaStepDefinitions {

        @When("Ingresa los siguientes datos de usuario")
        public void ingresaLosSiguientesDatosDeUsuario(UserQa userqa) {
            theActorInTheSpotlight().attemptsTo(DemoQaButtons.in(),
                    DemoQAInfo.in(userqa));
        }
}
