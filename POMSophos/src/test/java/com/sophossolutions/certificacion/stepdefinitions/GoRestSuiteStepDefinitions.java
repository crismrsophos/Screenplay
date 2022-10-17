package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.apis.ApiService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class GoRestSuiteStepDefinitions {


    @When("ejecuto el metodo post en el endpoint {string} y envío la siguiente información")
    public void ejecutoElMetodoPostEnElEndpointYEnvíoLaSiguienteInformación(String endpoint, Map<String, String> newUserData) {
        ApiService.executePost(endpoint, newUserData);

    }

    @When("ejecuto el metodo get en el endpoint {string} para el último usuario consultado")
    public void ejecutoElMetodoGetEnElEndpointParaElÚltimoUsuarioConsultado(String endpoint) {
        ApiService.executeGetforLastUser(endpoint);
    }
}
