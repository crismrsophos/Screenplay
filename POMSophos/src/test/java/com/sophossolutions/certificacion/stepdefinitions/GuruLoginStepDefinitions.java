package com.sophossolutions.certificacion.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.sophossolutions.certificacion.pages.GuruHomePage;
import com.sophossolutions.certificacion.pages.GuruLoginPage;

public class GuruLoginStepDefinitions {

    GuruLoginPage login;
    GuruHomePage home;

    @Given("Deseo ir a la página {string}")
    public void deseoIrALaPágina(String url) {
        login.goToUrl(url);
    }

    @When("Inicio sesión con los datos {string} y {string} en {string}")
    public void inicioSesionConLosDatosY(String user, String password, String app) {
        login.login(user, password, app);
    }

    @Then("Valido que el mensaje de inicio sea {string}")
    public void validoQueElMensajeDeInicioSea(String message) {
        home.validateText(message);
    }
}