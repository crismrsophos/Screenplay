package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.Set;

public class WayToAutomationRegistrationPage extends PageObject {

	By name = By.name("name");
	By phone = By.name("phone");
	By email = By.name("email");
	By btnCountryList = By.name("country");
	String countrySelector = "//*[@value='%s']";
	By btnCountryValue;
	By city = By.name("city");
	By userName =  By.xpath("//*[@id='load_box']//*[@name='username']");
	By password = By.xpath("//*[@id='load_box']//*[@name='password']");
	By btnSubmit = By.xpath("//*[@id='load_box']//*[@value='Submit']");
	By validationMessage = By.id("alert");
	final long FOUR = 4L;

	public void fillForm(String _name, String _phone, String _email,
									String _country, String _city, String _username, String _password){
		Action.getWindows(getDriver());
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

	public void submitValidation(String message){
		Action.waitForElement(getDriver(), validationMessage, FOUR);
		Action.validateTextOfField(getDriver(), validationMessage, message);
	}

}
