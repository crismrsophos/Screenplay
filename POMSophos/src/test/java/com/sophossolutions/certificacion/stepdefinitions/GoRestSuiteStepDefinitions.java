package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.apis.ApiService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class GoRestSuiteStepDefinitions {

    @When("consulto la informacion en el endpoint {string} para el id {string}")
    public void consultoLaInformacionEnElEndpointParaElId(String endpoint, String id) {
        ApiService.endpointIdGet(endpoint, id);
    }

    @When("elimino un usuario en el endpoint {string} para el id {string}")
    public void eliminoUnUsuarioEnElEndpointParaElId(String endpoint, String id) {
        ApiService.endpointIdDelete(endpoint, id);
    }

    @When("agrego en el endpoint {string} los siguientes datos")
    public void agregoEnElEndpointLosSiguientesDatos(String endpoint, Map<String, String> user){
        ApiService.endpointPost(endpoint, user);
    }

    @Then ("valido que el status_code de eliminacion sea {int}")
    public void validoQueElStatusCodeDeEliminacionSea(int statusCode){
        ApiService.validateStatus(statusCode);
    }

    @Then("valido que el status_code de posteo sea {int}")
    public void validoQueElStatusCodeDePosteoSea(int statusCode){
        ApiService.validateStatus(statusCode);
    }

}
