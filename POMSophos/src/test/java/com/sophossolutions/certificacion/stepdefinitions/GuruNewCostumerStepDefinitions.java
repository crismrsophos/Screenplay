package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.GuruCustomerRegistration;
import com.sophossolutions.certificacion.pages.GuruHomePage;
import com.sophossolutions.certificacion.pages.GuruLoginPage;
import com.sophossolutions.certificacion.pages.GuruNewCustomerEntryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class GuruNewCostumerStepDefinitions {

    GuruHomePage newCustomerSection;
    GuruNewCustomerEntryPage newCustomerEntry;
    GuruCustomerRegistration customerRegistration;

    @Given("Deseo ir a la sección de new costumer")
    public void deseoIrALaSecciónDeNewCostumer() {
        newCustomerSection.clickOnNewCustomer();
        //newCustomerSection.goToUrl(url);
    }
    @When("Diligencio los datos {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} y {string}")
    public void diligencioLosDatosY(String customerName, String gender, String dateOfBirth, String address, String city,
                                    String state, String pin, String mobileNumber, String email, String password) {

        newCustomerEntry.entryNewCustomer(customerName, gender, dateOfBirth, address, city, state, pin, mobileNumber, email, password);
    }
    @Then("Valido que el mensaje de registro sea {string}")
    public void validoQueElMensajeDeRegistroSea(String title) {
        customerRegistration.validateText(title);
    }

}
