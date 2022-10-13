package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SauceLabsDemoCartPage extends PageObject {

	By btnCheckOut = By.id("checkout");

	public void continueCheckOut(){
		Action.clicTo(getDriver(), btnCheckOut);
	}

}
