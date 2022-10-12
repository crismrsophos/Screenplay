package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.Set;

public class WayToAutomationRegistrationPage extends PageObject {

	By name = By.name("name");
	By phone = By.xpath("//*[@name='phone']");
	By email = By.xpath("//*[@name='email']");
	By btnCountryList = By.xpath("//*[@name='country']");
	String countrySelector = "//*[@value='%s']";
	By btnCountryValue;
	By city = By.xpath("//*[@name='city']");
	By userName = By.xpath("//*[@id='load_form']/fieldset[6]/input");
	By password = By.xpath("//*[@id='load_form']/fieldset[7]/input");
	By btnSubmit = By.xpath("//*[@class='fancybox-inner']/div/form/div[1]/div[2]/input");
	By validationMessage = By.id("alert");
	final long FOUR = 4L;
	String parentWindow = getDriver().getWindowHandle();

	public void fillForm(String _name, String _phone, String _email,
									String _country, String _city, String _username, String _password){
		Action.getWindows(getDriver(), parentWindow);
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
