package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.models.Cliente;
import com.sophossolutions.certificacion.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLabsDemoStepDefinitions {

	SauceLabsDemoHomePage home;
	SauceLabsDemoInventoryPage inventory;
	SauceLabsDemoCartPage cart;
	SauceLabsDemoCheckoutPage checkOut;

	@When("Cuando compro en sauce demo con los siguientes datos")
	public void cuandoComproEnSauceDemoConLosSiguienteDatos(Cliente userData){
		home.login(userData.getUser(), userData.getPassword());
		inventory.addInventory();
		cart.continueCheckOut();
		checkOut.continueStepOne(userData.getFirstName(), userData.getLastName(), userData.getPostalCode());
		checkOut.continueStepTwo();
	}

	@Then("Valido que en sauce demo aparezca {string}")
	public void validoQueEnSauceDemoAparezca(String message){
		checkOut.validation(message);
	}

}
