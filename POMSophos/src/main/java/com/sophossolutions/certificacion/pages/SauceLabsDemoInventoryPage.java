package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoInventoryPage extends PageObject {

	By btnGoToShopping = By.id("shopping_cart_container");
	String lookedClass = "div.inventory_item_price";
	String addedClass = "(//*[@class='btn btn_primary btn_small btn_inventory'])";

	public void addInventory(){
		Action.locateAndAdd(getDriver(), lookedClass, addedClass);
		Action.clicTo(getDriver(), btnGoToShopping);
	}

}
