package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AutomationPracticeStepDefinitions {

    AutomationHomePage home;
    AutomationTshirtPage tshirt;

    AutomationSelectPage select;

    AutomationBuyProceedPage shipping;

    @Given("Deseo ir a la página de ropa {string}")
    public void deseoIrALaPágina(String url) {
        home.goToUrl(url);
    }

   @When("Compro camisa de mujer con las siguientes caracteristicas {string}, {string}, {string}," +
           " {string}, {string}")
    public void comproCamisaDeMujerConLasSiguientesCaracteristicas(String color, String quantity, String size,
                                                                   String email, String password) {
        home.clicTshirt();
        tshirt.clicColor(color);
        select.clicSelect(quantity, size);

        shipping.clicCheckout();
        shipping.signAutomation(email,password);
        shipping.clicCheckoutA();
        shipping.clicAgree();

    }
    @Then("Valido la compra cuando el precio final es igual a este item {string}")
    public void validoLaCompraCuandoElPrecioFinalEsIgualAlPrecioEstablecido(String total) {
       shipping.comparation(total);
    }



}
