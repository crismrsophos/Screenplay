package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SauceLabsDemoCheckoutPage extends PageObject {

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By btnContinueStepOne = By.id("continue");
	By btnFinish = By.id("finish");
	By validationText = By.xpath("(//*[@id='checkout_complete_container'])/div");
	String cssValueComparison = "div.summary_subtotal_label";
	Float valor;
	public void continueStepOne(String _firstName, String _lastName, String _postalCode){
		Action.setText(getDriver(), firstName, _firstName);
		Action.setText(getDriver(), lastName, _lastName);
		Action.setText(getDriver(), postalCode, _postalCode);
		Action.clicTo(getDriver(), btnContinueStepOne);
	}

	public void continueStepTwo(){
		valor = Float.parseFloat(getDriver().findElement(By.cssSelector(cssValueComparison)).getText().replace("Item total: $", ""));
		System.out.println(valor);
		Action.clicTo(getDriver(), btnFinish);
	}

	public void validation(String message){
		Action.validateTextOfField(getDriver(), validationText, message);
	}

}
