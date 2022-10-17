package com.sophossolutions.certificacion.stepdefinitions;

import java.util.Map;

import com.sophossolutions.certificacion.apis.ApiService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetBookingApiStepDefinitions {

	@Given("deseo establecer la base uri {string}")
	public void deseoEstablecerLaBaseUri(String baseUrl) {
		ApiService.setBaseUrl(baseUrl);
	}

	@When("ejecuto el método get en el endpoint {string}")
	public void ejecutoElMetodoGetEnElEndpoint(String endpoint) {
		ApiService.executeGet(endpoint);
	}

	@Then("valido que el status_code sea {int} y los datos de la reserva sean")
	public void validoQueElStatusCodeSeaYLosDatosDeLaReservaSean(int statusCode, Map<String, String> booking) {
		ApiService.validateStatus(statusCode);
		ApiService.validateResponse(booking);
	}

}
