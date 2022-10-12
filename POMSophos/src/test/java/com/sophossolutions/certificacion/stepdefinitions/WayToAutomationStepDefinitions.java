package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.models.Usuario;
import com.sophossolutions.certificacion.pages.GuruNewCustomerPage;
import com.sophossolutions.certificacion.pages.WayToAutomationHomePage;
import com.sophossolutions.certificacion.pages.WayToAutomationRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WayToAutomationStepDefinitions {

	WayToAutomationHomePage way2Home;
	WayToAutomationRegistrationPage way2Registration;

	@When("Registro al usuario en Way2 con los siguientes datos")
	public void registroAlUsuarioEnWay2ConLosSiguientesDatos(Usuario userData) {
		way2Home.clicRegistrationImage();
		way2Registration.fillForm(userData.getName(), userData.getPhone(), userData.getEmail(),
				userData.getCountry(), userData.getCity(), userData.getUsername(), userData.getPassword());
	}

	@Then("Valido que en way2 aparezca el mensaje de validacion igual a {string}")
	public void validoQueEnWay2AparezcaElMensajeDeValidacionIgualA(String message) {
		way2Registration.submitValidation(message);
	}

}
