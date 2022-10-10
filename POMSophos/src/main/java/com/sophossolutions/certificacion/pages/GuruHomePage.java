package com.sophossolutions.certificacion.pages;

import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruHomePage extends PageObject {

	By title = By.xpath("//*[text()='Manger Id : mgr123']");
	By sectionNewCustomer = By.xpath("//*[@href='addcustomerpage.php']");

	public void validateText(String message) {
		Action.validateTextOfField(getDriver(), title, message);
	}

	public void clickOnNewCustomer() {
		Action.clicTo(getDriver(), sectionNewCustomer);
	}

	public void goToUrl(String url) {
		Action.navegateToUrl(getDriver(), url);
	}

}
