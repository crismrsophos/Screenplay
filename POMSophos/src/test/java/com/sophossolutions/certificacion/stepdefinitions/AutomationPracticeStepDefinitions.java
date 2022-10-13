package com.sophossolutions.certificacion.stepdefinitions;

import com.sophossolutions.certificacion.pages.AutomationBuyProceedPage;
import com.sophossolutions.certificacion.pages.AutomationHomePage;
import com.sophossolutions.certificacion.pages.AutomationSelectPage;
import com.sophossolutions.certificacion.pages.AutomationTshirtPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPracticeStepDefinitions {

	AutomationHomePage home;
	AutomationTshirtPage tshirt;
	AutomationSelectPage select;
	AutomationBuyProceedPage shipping;

	@When("Compro camisa de mujer con las siguientes caracteristicas {string}, {string}, {string}, {string} y {string}")
	public void comproCamisaDeMujerConLasSiguientesCaracteristicas(String color, String quantity, String size,
			String email, String password) {
		home.clicTshirt();
		tshirt.clicColor(color);
		select.theTShirt(quantity, size);
		shipping.shippingTShirt(email, password);
	}

	@Then("Valido que el precio final de la compra es igual a {string}")
	public void validoLaCompraCuandoElPrecioFinalEsIgualAlPrecioEstablecido(String total) {
		shipping.comparison(total);
	}

}
