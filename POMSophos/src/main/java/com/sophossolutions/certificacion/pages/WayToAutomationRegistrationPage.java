package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WayToAutomationRegistrationPage extends PageObject {

	By name = By.name("name");
	By phone = By.xpath("//*[@name='phone']");
	By email = By.xpath("//*[@name='email']");
	By btnCountryList = By.xpath("//*[@name='country']");
	String countrySelector = "//*[@value='%s']";
	By btnCountryValue;
	By city = By.xpath("//*[@name='city']");
	By userName = By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input");
	By password = By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input");
	By btnSubmit = By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input");
	By validationMessage = By.id("alert");

	public void fillForm(String _name, String _phone, String _email,
									String _country, String _city, String _username, String _password){
		Action.setText(getDriver(), name, _name);
		Action.setText(getDriver(), phone, _phone);
		Action.setText(getDriver(), email, _email);

		Action.clicTo(getDriver(), btnCountryList);
		btnCountryValue = By.xpath(String.format(countrySelector, _country));
		Action.clicTo(getDriver(), btnCountryValue);

		Action.setText(getDriver(), city, _city);
		Action.setText(getDriver(), userName, _username);
		Action.setText(getDriver(), password, _password);
		Action.clicTo(getDriver(), btnSubmit);
	}

	public void resultValidation(String message){
		Action.validateTextOfField(getDriver(), validationMessage, message);
	}

}
