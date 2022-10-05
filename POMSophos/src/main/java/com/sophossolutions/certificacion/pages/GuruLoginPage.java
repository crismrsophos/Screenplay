package com.sophossolutions.certificacion.pages;

import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruLoginPage extends PageObject {

	By username = By.name("uid");
	By password = By.name("password");
	By btnLogin = By.xpath("//*[@value='LOGIN']");

	public void goToUrl(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
	
	public void loginGuru(String user, String passw) {
		Action.setText(getDriver(), username, user);
		Action.setText(getDriver(), password, passw);
		Action.clicTo(getDriver(), btnLogin);
	}
	
}
