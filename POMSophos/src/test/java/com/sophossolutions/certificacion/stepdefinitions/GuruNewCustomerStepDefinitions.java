package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.GuruNewCustomerPage;


import com.sophossolutions.certificacion.pages.GuruValidation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GuruNewCustomerStepDefinitions {


   GuruNewCustomerPage newCustomer;
    GuruValidation newMessage;




    @Given("Deseo ir a la página siguiente {string}")
    public void deseoIrALaPáginaSiguiente(String url) {
        newCustomer.goToUrl(url);
    }
    @When("Creo sesion con los siguientes datos {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void creoSesionConLosSiguientesDatos(String name, String gender, String date, String address,
                                                String city, String state, String pin, String mobile, String email, String password) {
        newCustomer.newCustomerGuru(name, gender, date, address, city, state, pin, mobile, email, password);
    }
    @Then("Valido que el texto de inicio sea {string}")
    public void validoQueElTextoDeInicioSea(String message) {

        newMessage.validateText(message);

    }


}
