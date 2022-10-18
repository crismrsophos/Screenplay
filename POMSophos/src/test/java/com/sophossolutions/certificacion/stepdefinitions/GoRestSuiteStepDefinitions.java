package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.apis.ApiService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class GoRestSuiteStepDefinitions {

    @When("agrego en el endpoint {string} los siguientes datos")
    public void agregoEnElEndpointLosSiguientesDatos(String endpoint, Map<String, String> user){
        ApiService.endpointPost(endpoint, user);
    }

    @When("consulto la informacion en el endpoint {string} para el usuario creado")
    public void consultoLaInformacionEnElEndpointParaElId(String endpoint) {
        ApiService.endpointIdGet(endpoint);
    }

    @When("elimino un usuario en el endpoint {string} para el usuario creado")
    public void eliminoUnUsuarioEnElEndpointParaElId(String endpoint) {
        ApiService.endpointIdDelete(endpoint);
    }

    @Then ("valido que el status_code sea {int}")
    public void validoQueElStatusCodeSea(int statusCode){
        ApiService.validateStatus(statusCode);
    }

}
