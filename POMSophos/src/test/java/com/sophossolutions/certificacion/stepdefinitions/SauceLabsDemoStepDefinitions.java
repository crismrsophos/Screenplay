package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.models.Cliente;

import com.sophossolutions.certificacion.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLabsDemoStepDefinitions {

    SauceLabsDemoInventoryPage inventoryPage;
    SauceLabsDemoCartPage cartPage;
    SauceLabsDemoCheckoutStp1Page checkoutStp1Page;
    SauceLabsDemoCheckoutStp2Page checkoutStp2Page;

    SauceLabsDemoCheckoutCompletePage checkoutCompletePage;

	@When("Cuando compro en sauce demo con los siguientes datos")
	public void cuandoComproEnSauceDemoConLosSiguienteDatos(Cliente userData){
        inventoryPage.selectProductsAndCheckout(userData.getMaxValue());
		cartPage.continueCheckOut();
        checkoutStp1Page.setInformation(userData.getFirstName(), userData.getLastName(), userData.getPostalCode());
        checkoutStp2Page.finish();
	}

    @Then("Valido el mensaje {string}")
    public void validoElMensaje(String message) {
		checkoutCompletePage.validateText(message);
	}
}
