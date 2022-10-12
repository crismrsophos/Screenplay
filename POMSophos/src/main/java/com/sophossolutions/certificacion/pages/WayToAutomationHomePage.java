package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WayToAutomationHomePage extends PageObject {

	By registrationFormImage = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[5]/ul/li/a/figure/img");

	public void clicRegistrationImage() {
		Action.clicTo(getDriver(), registrationFormImage);
	}

}
