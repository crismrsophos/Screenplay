package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoInventoryPage extends PageObject {

	By btnGoToShopping = By.id("shopping_cart_container");

	public void addInventory(){
		Action.recorrer(getDriver());
		Action.clicTo(getDriver(), btnGoToShopping);
	}

}
