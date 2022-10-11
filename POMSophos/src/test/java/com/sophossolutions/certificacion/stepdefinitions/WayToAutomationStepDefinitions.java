package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.GuruNewCustomerPage;
import com.sophossolutions.certificacion.pages.WayToAutomationHomePage;
import com.sophossolutions.certificacion.pages.WayToAutomationRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WayToAutomationStepDefinitions {

	GuruNewCustomerPage customer;
	WayToAutomationHomePage way2Home;
	WayToAutomationRegistrationPage way2Registration;

	@When("Registro al usuario en Way2 con los siguientes datos")
	public void registroAlUsuarioEnWay2ConLosSiguientesDatos() {
		way2Home.clicRegistrationImage();
	}

	@Then("Valido que en way2 aparezca el mensaje de validacion igual a {string}")
	public void validoQueEnWay2AparezcaElMensajeDeValidacionIgualA(String message) {
		customer.validateText(message);
	}

}
