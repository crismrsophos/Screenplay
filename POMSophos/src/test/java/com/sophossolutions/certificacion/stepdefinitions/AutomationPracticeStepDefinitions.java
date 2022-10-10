package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.AutomationPracticeConfirmationPage;
import com.sophossolutions.certificacion.pages.GuruHomePage;
import com.sophossolutions.certificacion.pages.GuruLoginPage;
import com.sophossolutions.certificacion.pages.AutomationPracticePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPracticeStepDefinitions {

	GuruLoginPage login;
	GuruHomePage home;
	AutomationPracticePage automation;
	AutomationPracticeConfirmationPage automationConfirmation;


	@Given("Deseo ir a la siguiente pagina {string}")
	public void deseoIrALaSiguientePagina(String url) {
		automation.entradaPagina(url);
	}

	@When("Selecciono una camiseta e inicio sesion con los datos {string} y {string}")
	public void seleccionoUnaCamisetaEInicioSesionConLosDatosY(String email, String password) {
		automationConfirmation.procesoCompra(email, password);
	}

	@Then("Valido que el monto sea {string}")
	public void validoQueElMontoSea(String price) {
		automationConfirmation.validarTextoCompra(price);
	}

}
