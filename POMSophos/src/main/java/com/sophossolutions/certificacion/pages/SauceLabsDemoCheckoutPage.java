package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SauceLabsDemoCheckoutPage extends PageObject {

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By btnContinueStepOne = By.id("continue");
	By btnFinish = By.id("finish");
	By validationText = By.xpath("(//*[@id='checkout_complete_container'])/div");

	public void continueStepOne(String _firstName, String _lastName, String _postalCode){
		Action.setText(getDriver(), firstName, _firstName);
		Action.setText(getDriver(), lastName, _lastName);
		Action.setText(getDriver(), postalCode, _postalCode);
		Action.clicTo(getDriver(), btnContinueStepOne);
	}

	public void continueStepTwo(){
		Action.clicTo(getDriver(), btnFinish);
	}

	public void validation(String message){
		Action.validateTextOfField(getDriver(), validationText, message);
	}

}
