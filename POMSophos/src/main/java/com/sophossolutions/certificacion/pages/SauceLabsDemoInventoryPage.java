package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoInventoryPage extends PageObject {

	By btnEnsayo = By.id("add-to-cart-sauce-labs-backpack");
	By btnEnsayo2 = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By btnGoToShopping = By.id("shopping_cart_container");


	public void addInventory(){
		Action.clicTo(getDriver(), btnEnsayo);
		Action.clicTo(getDriver(), btnEnsayo2);
		Action.clicTo(getDriver(), btnGoToShopping);
	}

}
