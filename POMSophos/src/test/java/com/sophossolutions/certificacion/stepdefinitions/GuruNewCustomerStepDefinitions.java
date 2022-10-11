package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.GuruNewCustomerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruNewCustomerStepDefinitions {

	GuruNewCustomerPage customer;

	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPágina(String url) {
		customer.goToUrl(url);
	}

	@When("Agrego un cliente en la pagina con los datos {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} y {string}")
	public void agregoUnClienteEnLaPaginaConLosDatosY(String customerName, String birthDate, String address,
													  String city, String state, String pin,
													  String mobileNumber, String eMail,
													  String password) {
		customer.newCustomer(customerName, birthDate, address, city, state, pin, mobileNumber,
				eMail, password );
	}

	@Then("Valido que el mensaje de registro sea {string}")
	public void validoQueElMensajeDeRegistroSea(String message) {
		customer.validateText(message);
	}

}
