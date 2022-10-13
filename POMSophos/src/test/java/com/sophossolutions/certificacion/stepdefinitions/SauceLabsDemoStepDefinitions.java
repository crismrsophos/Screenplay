package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLabsDemoStepDefinitions {

    SauceLabsDemoHomePage homePage;
    SauceLabsDemoInventoryPage inventoryPage;
    SauceLabsDemoCartPage cartPage;
    SauceLabsDemoCheckoutStp1Page checkoutStp1Page;
    SauceLabsDemoCheckoutStp2Page checkoutStp2Page;

    @When("Inicio sesión con los datos {string} y {string} en {string}")
    public void inicioSesiónConLosDatosYEn(String userName, String password, String app) {
        homePage.login(userName, password, app);

    }
    @When("Selecciono los productos menores a {string} y diligencio {string}, {string} y {string}")
    public void seleccionoLosProductosMenoresAYDiligencioY(String maxValue, String name, String lastName, String postalCode) {
        inventoryPage.selectProductsAndCheckout(maxValue);
        cartPage.checkout();
        checkoutStp1Page.setInformation(name, lastName, postalCode);
        checkoutStp2Page.finish();
    }

    @Then("Valido el mensaje {string}")
    public void validoElMensaje(String message) {

    }

}
