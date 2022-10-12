package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLabsDemoStepDefinitions {

	SauceLabsDemoHomePage home;
	SauceLabsDemoInventoryPage inventory;
	SauceLabsDemoCartPage cart;
	SauceLabsDemoCheckoutPage checkOut;

	@When("Compro en sauce demo con los siguientes datos {string}, {string}, {string}, {string} y {string}")
	public void comproEnSauceDemoConLosSiguienteDatos(String userName, String password, String name,
													  String lastName, String postalCode){
		home.login(userName, password);
		inventory.addInventory();
		cart.continueCheckOut();
		checkOut.continueStepOne(name, lastName, postalCode);
		checkOut.continueStepTwo();
	}

	@Then("Valido que en sauce demo aparezca {string}")
	public void validoQueEnSauceDemoAparezca(String message){
		checkOut.validation(message);
	}

}
