package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.GuruHomePage;
import com.sophossolutions.certificacion.pages.GuruLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {

	GuruLoginPage login;
	GuruHomePage home;

	@Given("Deseo ir a la página {string}")
	public void deseoIrALaPágina(String url) {
		login.goToUrl(url);
	}

	@When("Inicio sesion con los datos {string} y {string}")
	public void inicioSesionConLosDatosY(String user, String password) {
		login.loginGuru(user, password);
	}

	@Then("Valido que el mensaje de inicio sea {string}")
	public void validoQueElMensajeDeInicioSea(String message) {
		home.validateText(message);
	}

}
