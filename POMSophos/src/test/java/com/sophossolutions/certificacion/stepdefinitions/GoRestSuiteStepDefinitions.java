package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.apis.ApiService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class GoRestSuiteStepDefinitions {

    @When("Deseo consultar la informacion en el {string} para el usuario {string}")
    public void deseoConsultarLaInformacionEnElParaElUsuario(String endpoint, String id) {
        ApiService.endpointIdGet(endpoint, id);
    }

}
