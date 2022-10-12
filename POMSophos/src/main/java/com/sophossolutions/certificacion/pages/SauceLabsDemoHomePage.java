package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoHomePage extends PageObject {

	By userName = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");

	public void login(String _userName, String _password) {
		Action.setText(getDriver(), userName, _userName);
		Action.setText(getDriver(), password, _password);
		Action.clicTo(getDriver(), btnLogin);
	}

}
